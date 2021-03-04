package com.example.mypuppy.ui.components

import androidx.compose.runtime.Immutable
import com.example.mypuppy.R


@Immutable
data class Puppy(
    val image: Int,
    //val id:String,
    val name:String,
    val age:Int,
    //val weight:Int
)



val puppys = listOf(
    Puppy(
        image = R.drawable.d_1,
        //id = "D_1",
        name = "Bull",
        age = 2,
        //weight = 13
    ),
    Puppy(
        image = R.drawable.d_2,
        //id = "D_2",
        name = "Tomy",
        age = 2,
        //weight = 10
    ),
    Puppy(
        image = R.drawable.d_3,
        //id = "D_3",
        name = "Lacy",
        age = 4,
        //weight = 26
    ),
    Puppy(
        image = R.drawable.d_4,
        //id = "D_4",
        name = "Kalu",
        age = 1,
        //weight = 8
    ),
    Puppy(
        image = R.drawable.d_5,
        //id = "D_5",
        name = "Rosy",
        age = 4,
        //weight = 17
    ),
    Puppy(
        image = R.drawable.d_6,
        //id = "D_6",
        name = "Luka",
        age = 6,
        //weight = 25
    ),
    Puppy(
        image = R.drawable.d_7,
        //id = "D_7",
        name = "Usy",
        age = 5,
        //weight = 16
    ),
    Puppy(
        image = R.drawable.d_8,
        //id = "D_8",
        name = "Kadi",
        age = 9,
        //weight = 28
    ),
    Puppy(
        image = R.drawable.d_9,
        //id = "D_9",
        name = "Thipu",
        age = 4,
        //weight = 15
    ),
    Puppy(
        image = R.drawable.d_10,
        //id = "D_10",
        name = "Tarzan",
        age = 5,
        //weight = 16
    ),
    Puppy(
        image = R.drawable.d_11,
        //id = "D_11",
        name = "Teddy",
        age = 5,
        //weight = 9
    ),
    Puppy(
        image = R.drawable.d_12,
        //id = "D_12",
        name = "Nari",
        age = 6,
        //weight = 16
    ),
    Puppy(
        image = R.drawable.d_13,
        //id = "D_13",
        name = "Scooby",
        age = 6,
        //weight = 25
    ),
    Puppy(
        image = R.drawable.d_14,
        //id = "D_14",
        name = "Pluto",
        age = 8,
        //weight = 16
    ),
    Puppy(
        image = R.drawable.d_15,
        //id = "D_15",
        name = "Scrappy",
        age = 1,
        //weight = 8
    )
)



