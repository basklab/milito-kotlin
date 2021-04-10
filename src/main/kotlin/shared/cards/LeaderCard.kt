package shared.cards

import com.fasterxml.jackson.annotation.JsonProperty
import shared.cards.Card

data class LeaderCard(
    override val id: Int?,
    @JsonProperty("unit_type")
    override val unitType: String?,
    val combat_value: Int,
    val place_unit_ability: Int,
    val special_effect: String?,
) : Card
