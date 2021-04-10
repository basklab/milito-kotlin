package shared

import shared.cards.UnitCard
import shared.enums.FactionsEnum
import shared.enums.PhasesEnum

data class PlayerState (
    val deck: Deck,
    val dead_pile: Deck,
    val discard_pile: Deck,
    val faction: FactionsEnum,
    val hand: Hand,
    val player_id: Int,
    val row_1: List<UnitCard?>,
    val row_2: List<UnitCard?>,
    val state: PhasesEnum,
)
