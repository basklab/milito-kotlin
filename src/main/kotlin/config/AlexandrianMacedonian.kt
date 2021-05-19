package config


object AlexandrianMacedonian {
    private val cardsImport = loadCards("milito-config/decks/AlexandrianMacedonian.yaml")

    val leaders = cardsImport.leaders
    val units = cardsImport.units
    val counts = cardsImport.counts

}
