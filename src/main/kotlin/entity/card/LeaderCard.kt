package entity.card

import kotlinx.serialization.Serializable

@Serializable
data class LeaderCard(
    override val id: Int? = null,
    override val unitType: String?,
    val combatValue: Int,
    val placeUnitAbility: Int,
    val specialEffect: String? = null,
) : Card
