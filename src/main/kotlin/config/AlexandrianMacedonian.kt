package config

import entity.card.LeaderCard
import entity.card.UnitCard


object AlexandrianMacedonian {

    val counts: Map<String, Int> = mapOf(
        "Pikes" to 7,
        "Spears" to 4,
        "Light_Infantry" to 3,
        "Slingers" to 2,
        "Companions" to 2,
        "Heavy_Cavalry" to 2,
        "Light_Cavalry" to 2
    )

    val leaders = listOf(
        LeaderCard(
            unitType = "Leader_0",
            combatValue = 3,
            placeUnitAbility = 3
        ),
        LeaderCard(
            unitType = "Leader_1",
            combatValue = 2,
            placeUnitAbility = 3
        ),
        LeaderCard(
            unitType = "Leader_2",
            combatValue = 2,
            placeUnitAbility = 2,
            specialEffect = "if win combat"
        ),
        LeaderCard(
            unitType = "Leader_3",
            combatValue = 1,
            placeUnitAbility = 2,
            specialEffect = "+2 if played in Wood or Rough column."
        ),
        LeaderCard(
            unitType = "Leader_4",
            combatValue = 1,
            placeUnitAbility = 1,
            specialEffect = "+2 if played with 2x Chariots"
        ),
        LeaderCard(
            unitType = "Leader_5",
            combatValue = 1,
            placeUnitAbility = 1,
            specialEffect = "+2 if played with 2x Slingers"
        ),
        LeaderCard(
            unitType = "Leader_6",
            combatValue = 1,
            placeUnitAbility = 1,
            specialEffect = "+2 if played with 2x Warband Medium Infantry"
        ),
        LeaderCard(
            unitType = "Leader_7",
            combatValue = -1,
            placeUnitAbility = 1
        )
    )

    val units = listOf(
        UnitCard(
            unitType = "Pikes",
            speed = 2,
            attackStrength = 5,
            defenceStrength = 5,
            deployPenalty = 2,
            flankPenalty = 1
        ),
        UnitCard(
            unitType = "Spears",
            speed = 2,
            attackStrength = 4,
            defenceStrength = 5,
            deployPenalty = 1,
            flankPenalty = 1
        ),
        UnitCard(
            unitType = "Light_Infantry",
            speed = 3,
            attackStrength = 1,
            defenceStrength = 1,
            combineAbility = true
        ),
        UnitCard(
            unitType = "Companions",
            speed = 3,
            attackStrength = 4,
            defenceStrength = 2
        ),
        UnitCard(
            unitType = "Heavy_Cavalry",
            speed = 5,
            attackStrength = 1,
            defenceStrength = 1
        ),
        UnitCard(
            unitType = "Slingers",
            speed = 3,
            attackStrength = 1,
            defenceStrength = 1,
            combineAbility = true
        ),
        UnitCard(
            unitType = "Light_Cavalry",
            speed = 5,
            attackStrength = 1,
            defenceStrength = 1
        )
    )


}
