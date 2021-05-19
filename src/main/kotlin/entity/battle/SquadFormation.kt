package entity.battle

import entity.card.Card
import entity.card.UnitCard

class SquadFormation(
    val bonusCard: Card,
    val mainUnit: UnitCard,
    val supportUnit: UnitCard,
)
