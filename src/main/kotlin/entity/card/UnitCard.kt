package entity.card

import kotlinx.serialization.Serializable

@Serializable
data class UnitCard(
    override val id: Int? = null,
    override val unitType: String,
    val speed: Int,
    val attackStrength: Int,
    val defenceStrength: Int,
    val deployPenalty: Int? = null,
    val flankPenalty: Int? = null,
    val combineAbility: Boolean? = null,
    val attackModifiers: String? = null,
    val defenceModifiers: String? = null,
) : Card
