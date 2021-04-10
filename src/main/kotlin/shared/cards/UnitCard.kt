package shared.cards

import com.fasterxml.jackson.annotation.JsonProperty

data class UnitCard(
    override val id: Int?,
    @JsonProperty("unit_type")
    override val unitType: String,
    val speed: Int,
    val attack_strength: Int,
    val defence_strength: Int,
    val deploy_penalty: Int?,
    val flank_penalty: Int?,
    val combine_ability: Boolean?,
    val attack_modifiers: Any?,
    val defence_modifiers: Any?,

    ) : Card
