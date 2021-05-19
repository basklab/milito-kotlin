package shared

import shared.enums.PhasesEnum

data class GameState(
    val neutral: List<Int>,
    val phase: PhasesEnum,
    val current_player: PlayerStateDTO,
    val another_player: PlayerStateDTO,
    val battle_state: AttackStateDTO?,
)
