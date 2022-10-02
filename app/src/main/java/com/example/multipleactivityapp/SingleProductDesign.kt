package com.example.multipleactivityapp

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multipleactivityapp.activity.FinalActivity
import com.example.multipleactivityapp.module.Product

@Composable
fun SingleProductDesign(
    product: Product

) {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(10.dp)) {
        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .size(150.dp, 200.dp)
                .border(
                    2.dp,
                    color = Color.Gray,
                    shape = RoundedCornerShape(5.dp)
                )
                .shadow(
                    10.dp,
                    shape = RoundedCornerShape(5.dp)
                ).clickable {
                    context.startActivity(Intent(context, FinalActivity::class.java))
                }
        ) {
            Column {
                Image(
                    painter = painterResource(
                        id = product.productImage
                    ),
                    contentDescription = "productImage",
                    modifier = Modifier
                        .size(130.dp, 150.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 20.dp)
                        .border(
                            1.dp,
                            color = Color.Blue,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clip(shape = RoundedCornerShape(5.dp))
                )
                Text(
                    text = product.productName,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "₹" + product.productPrice.toString(),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

            }


        }
    }

}