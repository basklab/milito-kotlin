package shared

import entity.battle.SquadFormation

data class BattleStateDTO(
    val attackColumn: Int,
    val defenceColumn: Int,
    val squadFormation: SquadFormation,
)
