package entity

import shared.enums.PhasesEnum

data class GameState(
    val neutral: List<Int>,
    val phase: PhasesEnum,
    val currentPlayer: PlayerState,
    val anotherPlayer: PlayerState,
    val battleState: AttackState?,
)
