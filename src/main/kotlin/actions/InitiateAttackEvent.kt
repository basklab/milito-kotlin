package actions

import entity.GameState

data class InitiateAttackEvent(
    val bonusCardId: Int,
    val selectedColumn: Int,
    val selectedRow: Int,
): TransformState {
    override fun transform(state: GameState): GameState {
        TODO("Not yet implemented")
    }
}
