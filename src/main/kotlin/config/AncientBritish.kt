package config

object AncientBritish {
    private val cardsImport = loadCards("milito-config/decks/AncientBritish.yaml")
    val leaders = cardsImport.leaders
    val units = cardsImport.units
    val counts = cardsImport.counts

}
