package entity.stock

import entity.card.Card

data class Hand(
    override val cards: List<Card>,
) : Stock
