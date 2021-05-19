package shared

import shared.cards.UnitCard
import shared.enums.FactionsEnum
import shared.enums.PhasesEnum

data class PlayerState(
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
