package com.example.multipleactivityapp.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multipleactivityapp.R
import com.example.multipleactivityapp.SingleProductDesign
import com.example.multipleactivityapp.module.Product
import com.example.multipleactivityapp.ui.theme.MultipleActivityAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultipleActivityAppTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProductDesign()
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ProductDesign() {
    val productList = arrayListOf(
        Product(
            1,
            R.drawable.img_1,
            350,
            "Cheese Pizza"
        ), Product(
            1,
            R.drawable.img_2,
            300,
            "Veggie Pizza"
        ), Product(
            1,
            R.drawable.img_3,
            300,
            "Pepperoni Pizza"
        ), Product(
            1,
            R.drawable.img_4,
            400,
            "Meat Pizza"
        ), Product(
            1,
            R.drawable.img_5,
            300,
            "Margherita Pizza"
        ), Product(
            1,
            R.drawable.img_6,
            250,
            "BBQ Chicken Pizza"
        ), Product(
            1,
            R.drawable.img_7,
            280,
            "Hawaiian Pizza"
        ), Product(
            1,
            R.drawable.img_8,
            300,
            "Supreme Pizza"
        ), Product(
            1,
            R.drawable.img_9,
            250,
            "The Works Pizza"
        ), Product(
            1,
            R.drawable.img_10,
            400,
            "Neapolitan Pizza"
        ), Product(
            1,
            R.drawable.img_11,
            450,
            "New York-Style Pizza"
        ), Product(
            1,
            R.drawable.img_12,
            500,
            "Chicago Style Pizza"
        ), Product(
            1,
            R.drawable.img_13,
            450,
            "Greek Pizza"
        ), Product(
            1,
            R.drawable.img_14,
            350,
            "Detroit Style Pizza"
        )
        )

    Design(list = productList)
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Design(list: ArrayList<Product>) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            content = {
                items(list.size) { index ->
                    val product = list[index]

                    SingleProductDesign(product)


                }
            }
        )

    }
}
