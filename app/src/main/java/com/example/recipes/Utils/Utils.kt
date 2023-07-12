package com.example.recipes.Utils

import com.example.recipes.R
import com.example.recipes.data.DishItemModel

object Utils {
    val dataSet = listOf(
        DishItemModel(
            imageId = R.drawable.borsch,
            titleId = R.string.borscht,
            contentId = R.string.borscht_about
        ),
        DishItemModel(
            imageId = R.drawable.ceasar,
            titleId = R.string.ceasar,
            contentId = R.string.ceasar_about
        ),
        DishItemModel(
            imageId = R.drawable.cheesecake,
            titleId = R.string.cheesecake,
            contentId = R.string.cheesecake_about
        ),
        DishItemModel(
            imageId = R.drawable.hot_dog,
            titleId = R.string.hot_dog,
            contentId = R.string.hot_dog_about
        ),
        DishItemModel(
            imageId = R.drawable.khinkali,
            titleId = R.string.khinkali,
            contentId = R.string.khinkali_about
        ),
        DishItemModel(
            imageId = R.drawable.lasagna,
            titleId = R.string.lasagna,
            contentId = R.string.lasagna_about
        ),
        DishItemModel(
            imageId = R.drawable.ratatouille,
            titleId = R.string.ratatouille,
            contentId = R.string.ratatouille_about
        ),
        DishItemModel(
            imageId = R.drawable.steak,
            titleId = R.string.steak,
            contentId = R.string.steak_about
        ),
    )
}