package com.example.mypuppy.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun ListItem(puppy:Puppy){
    Column() {
         PuppyCard(image = puppy.image, Name = puppy.name, age = puppy.age) }
    }

