package entity.battle


data class BattleState(
    val attackColumn: Int,
    val defenceColumn: Int,
    val squadFormation: SquadFormation,
)
