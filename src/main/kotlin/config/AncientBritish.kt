package config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import shared.cards.LeaderCard
import shared.cards.UnitCard
import java.io.File


data class CardsImport(
    val leaders: List<LeaderCard>,
    val units: List<UnitCard>,
    val counts: Map<String, Int>,
)

object AncientBritish {

    private val classLoader = Thread.currentThread().contextClassLoader
    private val file = File(classLoader.getResource("decks/AncientBritish.yaml")!!.file)

    private val mapper = ObjectMapper(YAMLFactory()).registerKotlinModule()

    val employee: CardsImport = mapper.readValue(file)

}
