package entity

import entity.card.UnitCard
import entity.stock.Deck
import entity.stock.Hand
import shared.enums.FactionsEnum
import shared.enums.PhasesEnum

data class PlayerState(
    val deck: Deck,
    val deadPile: Deck,
    val discardPile: Deck,
    val faction: FactionsEnum,
    val hand: Hand,
    var playerId: Int,
    val row1: MutableList<UnitCard?>,
    val row2: MutableList<UnitCard?>,
    val state: PhasesEnum,
)
