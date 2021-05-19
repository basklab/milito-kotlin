package actions

import entity.GameState
import entity.card.UnitCard
import shared.enums.PhasesEnum
import shared.enums.StepsEnum

data class PlayCardEvent(
    val selectedCard: Int,
    val selectedColumn: Int,
    val selectedRow: Int,
) : TransformState {
    override fun transform(state: GameState): GameState {
        if (state.step != StepsEnum.PLAY_CARD || state.phase != PhasesEnum.PHASE_4_PLAYER_ACTIONS) {
            throw Exception("bad step or phase")
        }
        val player = state.currentPlayer
        val newCard = player.hand.takeCardById(this.selectedCard)
        if (newCard !is UnitCard) {
            throw Exception("bad card selected")
        }
        state.deployPenalty = newCard.deployPenalty ?: 0
        if (this.selectedColumn == 0 || this.selectedColumn == 4) {
            state.deployPenalty += newCard.flankPenalty ?: 0
        }
        // todo check another unit must be the same type or must have combine ability
        val currentRow = if (this.selectedRow == 1) {
            player.row1
        } else {
            player.row2
        }
        // discard existing cards
        val placeHolder: UnitCard? = currentRow[this.selectedColumn]
        if (placeHolder != null) {
            player.discardPile.push(placeHolder)
        }
        currentRow[this.selectedColumn] = newCard
        state.step = if (state.deployPenalty == 0) {
            StepsEnum.PLAY_CARD
        } else {
            StepsEnum.DISCARD_DEPLOY_COST
        }
        return state
    }
}
