package com.example.mypuppy.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListItemInfo
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable

@Composable
fun PuppyList(){
    val scrollState = rememberLazyListState()

    LazyColumn(state = scrollState){
        items(15) {
            ListItem(puppy = puppys[it.toInt()])
            Divider()
        }
    }
}

