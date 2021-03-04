package com.example.mypuppy.ui.components

import androidx.compose.runtime.Immutable
import com.example.mypuppy.R


@Immutable
data class Puppy(
    val image: Int,
    val id:String,
    val name:String,
    val age:Int,
    val weight:Int
)



val puppys = listOf(
    Puppy(
        image = R.drawable.d_1,
        id = "D_1",
        name = "Bull",
        age = 2,
        weight = 13
    ),
    Puppy(
        image = R.drawable.d_2,
        id = "D_2",
        name = "Tomy",
        age = 2,
        weight = 10
    ),
    Puppy(
        image = R.drawable.d_3,
        id = "D_3",
        name = "Lacy",
        age = 4,
        weight = 26
    ),
    Puppy(
        image = R.drawable.d_4,
        id = "D_4",
        name = "Kalu",
        age = 1,
        weight = 8
    ),
    Puppy(
        image = R.drawable.d_5,
        id = "D_5",
        name = "Rex",
        age = 4,
        weight = 17
    ),
    Puppy(
        image = R.drawable.d_6,
        id = "D_6",
        name = "Banty",
        age = 6,
        weight = 25
    ),
    Puppy(
        image = R.drawable.d_7,
        id = "D_7",
        name = "Santha",
        age = 5,
        weight = 16
    ),
    Puppy(
        image = R.drawable.d_8,
        id = "D_8",
        name = "Signal",
        age = 9,
        weight = 28
    ),
    Puppy(
        image = R.drawable.d_9,
        id = "D_9",
        name = "Chims",
        age = 4,
        weight = 15
    ),
    Puppy(
        image = R.drawable.d_10,
        id = "D_10",
        name = "Scooby",
        age = 5,
        weight = 16
    ),
    Puppy(
        image = R.drawable.d_11,
        id = "D_11",
        name = "Teddy",
        age = 5,
        weight = 9
    ),
    Puppy(
        image = R.drawable.d_12,
        id = "D_12",
        name = "Sew",
        age = 6,
        weight = 16
    ),
    Puppy(
        image = R.drawable.d_13,
        id = "D_13",
        name = "Nisantha",
        age = 6,
        weight = 25
    ),
    Puppy(
        image = R.drawable.d_14,
        id = "D_14",
        name = "Tomy",
        age = 8,
        weight = 16
    ),
    Puppy(
        image = R.drawable.d_15,
        id = "D_15",
        name = "Kanna",
        age = 1,
        weight = 8
    )
)



