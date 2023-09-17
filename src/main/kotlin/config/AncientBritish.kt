package config

import entity.card.LeaderCard
import entity.card.UnitCard

object AncientBritish {

    val leaders: List<LeaderCard> = listOf(
        LeaderCard(
            unitType = "LeaderCard_0",
            combatValue = 3,
            placeUnitAbility = 3
        ), LeaderCard(
            unitType = "LeaderCard_1",
            combatValue = 2,
            placeUnitAbility = 2
        ), LeaderCard(
            unitType = "LeaderCard_2",
            combatValue = 2,
            placeUnitAbility = 1,
            specialEffect = "if win combat"
        ), LeaderCard(
            unitType = "LeaderCard_3",
            combatValue = 1,
            placeUnitAbility = 2,
            specialEffect = "+2 if played in Wood or Rough column."
        ), LeaderCard(
            unitType = "LeaderCard_4",
            combatValue = 1,
            placeUnitAbility = 1,
            specialEffect = "+2 if played with 2x Chariots"
        ), LeaderCard(
            unitType = "LeaderCard_5",
            combatValue = 1,
            placeUnitAbility = 1,
            specialEffect = "+2 if played with 2x Slingers"
        ), LeaderCard(
            unitType = "LeaderCard_6",
            combatValue = 1,
            placeUnitAbility = 1,
            specialEffect = "+2 if played with 2x Warband Medium Infantry"
        ), LeaderCard(
            unitType = "LeaderCard_7",
            combatValue = -1,
            placeUnitAbility = 1
        )
    )

    val units: List<UnitCard> = listOf(
        UnitCard(
            unitType = "Warband_Med_Inf",
            speed = 2,
            attackStrength = 4,
            defenceStrength = 2
        ),
        UnitCard(
            unitType = "Slingers",
            speed = 3,
            attackStrength = 1,
            defenceStrength = 1,
            combineAbility = true
        ),
        UnitCard(
            unitType = "Chariots",
            speed = 3,
            attackStrength = 4,
            defenceStrength = 2
        ),
        UnitCard(
            unitType = "Light_Cavalry",
            speed = 5,
            attackStrength = 1,
            defenceStrength = 1
        )
    )

    val counts: Map<String, Int> = mapOf(
        "Warband_Med_Inf" to 6,
        "Slingers" to 6,
        "Chariots" to 6,
        "Light_Cavalry" to 4
    )

}
