package entity.card

import com.fasterxml.jackson.annotation.JsonProperty

data class UnitCard(
    override val id: Int?,
    @JsonProperty("unit_type")
    override val unitType: String,
    @JsonProperty("speed")
    val speed: Int,
    @JsonProperty("attack_strength")
    val attackStrength: Int,
    @JsonProperty("defence_strength")
    val defenceStrength: Int,
    @JsonProperty("deploy_penalty")
    val deployPenalty: Int?,
    @JsonProperty("flank_penalty")
    val flankPenalty: Int?,
    @JsonProperty("combine_ability")
    val combineAbility: Boolean?,
    @JsonProperty("attack_modifiers")
    val attackModifiers: Any?,
    @JsonProperty("defence_modifiers")
    val defenceModifiers: Any?,
    ) : Card
