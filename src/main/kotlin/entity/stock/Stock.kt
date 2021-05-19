package entity.stock

import entity.card.Card

interface Stock {

    val cards: List<Card>

    fun getSize(): Int {
        return cards.size
    }

}
