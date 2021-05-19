package shared

import entity.card.UnitCard
import shared.enums.FactionsEnum
import shared.enums.PhasesEnum

data class PlayerStateDTO(
    val deck: DeckDTO,
    val dead_pile: DeckDTO,
    val discard_pile: DeckDTO,
    val faction: FactionsEnum,
    val hand: HandDTO,
    val player_id: Int,
    val row_1: List<UnitCard?>,
    val row_2: List<UnitCard?>,
    val state: PhasesEnum,
)
