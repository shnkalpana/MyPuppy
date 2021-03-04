package com.example.mypuppy.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun PuppyCard(image:Int,Name:String,age:Int){
    Row(
        modifier = Modifier
            .padding(8.dp)
    ){
        Surface(
            modifier = Modifier.size(50.dp),
            color = Color.Gray,
            shape = CircleShape
        )
         {
            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier
                    .height(80.dp)
                    .clip(shape = RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(
            modifier = Modifier
                .padding(6.dp)
        )
        Column(
            modifier = Modifier
                .padding(start = 4.dp)
                .align(Alignment.CenterVertically)
        ) {
             Text(text = Name,style = MaterialTheme.typography.h4)
            Text("Age : ${age.toString()}")
        }
    }
}