package actions

import entity.GameState

sealed interface TransformState {
    fun transform(state: GameState): GameState
}