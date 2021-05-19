package actions

import entity.GameState

data class DiscardCardEvent(
    val selectedCard: Int,
): TransformState {
    override fun transform(state: GameState): GameState {
        TODO("Not yet implemented")
    }
}
