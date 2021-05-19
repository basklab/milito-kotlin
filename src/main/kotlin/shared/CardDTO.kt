package shared

import com.fasterxml.jackson.annotation.JsonProperty

data class CardDTO(
    val id: Int?,
    @JsonProperty("unit_type")
    val unitType: String?,
)
