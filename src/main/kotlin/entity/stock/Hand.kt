package entity.stock

import entity.card.Card

data class Hand(
    override val cards: MutableList<Card>,
) : Stock {
    fun takeCardById(uuid: Int): Card? {
        for (i in cards.indices) {
            val card = cards[i]
            if (card.id == uuid) {
                cards.removeAt(i)
                return card
            }
        }
        return null;
    }
}
