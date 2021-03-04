package com.example.mypuppy

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mypuppy.ui.components.ListItem
import com.example.mypuppy.ui.components.PuppyCard
import com.example.mypuppy.ui.components.PuppyList
import com.example.mypuppy.ui.components.puppys
import com.example.mypuppy.ui.theme.MyPuppyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold {
                PuppyList()
                }
            }
        }
    }


