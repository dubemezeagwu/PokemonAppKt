package com.olamachia.pokemonweekseventask.network.ApiResponses

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)