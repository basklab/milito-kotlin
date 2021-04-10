package shared

import shared.enums.PhasesEnum

data class GameState(
    val neutral: List<Int>,
    val phase: PhasesEnum,
    val current_player: PlayerState,
    val another_player: PlayerState,
    val battle_state: AttackState?,
)
