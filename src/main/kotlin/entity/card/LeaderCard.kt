package entity.card

import com.fasterxml.jackson.annotation.JsonProperty

data class LeaderCard(
    override val id: Int?,
    @JsonProperty("unit_type")
    override val unitType: String?,
    @JsonProperty("combat_value")
    val combatValue: Int,
    @JsonProperty("place_unit_ability")
    val placeUnitAbility: Int,
    @JsonProperty("special_effect")
    val specialEffect: String?,
) : Card
