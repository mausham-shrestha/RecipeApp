package com.example.recipeapp.data

import com.example.recipeapp.R
import com.example.recipeapp.model.Recipe

object RecipeSource {
    val recipes = listOf<Recipe>(
        Recipe(R.string.chicken_kiev, R.drawable.chicken_kiev, R.string.recipe_description),
        Recipe(R.string.fish_curry, R.drawable.fruity_fish_curry_easy_recipe, R.string.recipe_description),
        Recipe(R.string.italian_pasta, R.drawable.italian_pasta, R.string.recipe_description),
        Recipe(R.string.healthy_veggies, R.drawable.healthy_veggies, R.string.recipe_description),
        Recipe(R.string.lobster_salad, R.drawable.lobster_salad, R.string.recipe_description),
        Recipe(R.string.sweet_and_sour_basa_bake, R.drawable.sweet_and_sour_basa_bake, R.string.recipe_description),
        Recipe(R.string.salmone_alla_ticinese, R.drawable.salmone_alla_ticinese, R.string.recipe_description)
    )
}