package com.example.multipleactivityapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.multipleactivityapp.R
import com.example.multipleactivityapp.ui.theme.MultipleActivityAppTheme

class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultipleActivityAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SplashScreen()
                }
            }
        }
    }
}

@Composable
fun SplashScreen() {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(20.dp)) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "", modifier = Modifier
                .size(600.dp, 600.dp)
                .align(Alignment.CenterHorizontally)
        )
        Button(
            onClick = {

                val intent =
                    Intent(
                        context,
                        MainActivity::class.java
                    )
                context.startActivity(intent)
            }, Modifier
                .width(250.dp)
                .height(80.dp)
                .align(Alignment.CenterHorizontally), colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Let's buy Pizzas 🍕🍕 ",
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}
