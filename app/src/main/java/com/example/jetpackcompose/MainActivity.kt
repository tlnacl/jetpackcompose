package com.example.jetpackcompose

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.material.MaterialTheme
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MaterialTheme {
//                Greeting("Android")
//            }
            NewsStory()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun NewsStory() {
    val image = +imageResource(R.drawable.header)
    Column(modifier = Spacing(16.dp)) {
        Container(modifier = Height(180.dp) wraps Expanded) {
            Clip(shape = RoundedCornerShape(8.dp)) {
                DrawImage(image)
            }
        }
        HeightSpacer(16.dp)

        Text("Try Android compose")
        Text("Happy UI")
        Text("2020 Jan 03")
    }
}


@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}
