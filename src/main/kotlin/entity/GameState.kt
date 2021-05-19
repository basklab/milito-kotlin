package entity

import entity.battle.BattleState
import shared.enums.PhasesEnum
import shared.enums.StepsEnum

data class GameState(
    var neutral: List<Int>,
    var phase: PhasesEnum,
    var currentPlayer: PlayerState,
    var anotherPlayer: PlayerState,
    var battleState: BattleState?,
    var step: StepsEnum,
    var deployPenalty: Int,
    )
