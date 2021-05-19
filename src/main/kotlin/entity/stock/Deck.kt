package entity.stock

import entity.card.Card

data class Deck(
    override val cards: List<Card>,
) : Stock
