package com.sula.sport4.screens.FakeScreen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sula.sport4.R
import com.sula.sport4.ui.theme.DeepBlue
import com.sula.sport4.ui.theme.IndigoДегайTheme
import com.sula.sport4.ui.theme.Purple200

@Composable
fun FakeScreen(navController: NavController) {
    IndigoДегайTheme {
        Log.d("Screen", "FakeScreen")
        Column {
            GreetingSection()
            listColumn()
        }
    }
}

@Composable
fun GreetingSection() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 40.dp, bottom = 20.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = "Health Care",
                style = MaterialTheme.typography.h2,
                fontSize = 30.sp,
                color = colorResource(id = R.color.blackw2),
                fontWeight = FontWeight.Bold
            )
        }
    }

}

@Composable
fun listColumn() {
    LazyColumn {
        item {
            OverlayRoundedBox(
                shape = RoundedCornerShape(28.dp),
                color = DeepBlue,
                size = 160.dp,
                overlayIcon = R.drawable.img,
                contentDescription = "title"
            )
        }
        item {
            OverlayRoundedBox(
                shape = RoundedCornerShape(28.dp),
                color = DeepBlue,
                size = 160.dp,
                overlayIcon = R.drawable.img,
                contentDescription = "title"
            )
        }
        item {
            OverlayRoundedBox(
                shape = RoundedCornerShape(28.dp),
                color = DeepBlue,
                size = 160.dp,
                overlayIcon = R.drawable.img,
                contentDescription = "title"
            )
        }
        item {
            OverlayRoundedBox(
                shape = RoundedCornerShape(28.dp),
                color = DeepBlue,
                size = 160.dp,
                overlayIcon = R.drawable.img,
                contentDescription = "title"
            )
        }
        item {
            OverlayRoundedBox(
                shape = RoundedCornerShape(28.dp),
                color = DeepBlue,
                size = 160.dp,
                overlayIcon = R.drawable.img,
                contentDescription = "title"
            )
        }
        item {
            OverlayRoundedBox(
                shape = RoundedCornerShape(28.dp),
                color = DeepBlue,
                size = 160.dp,
                overlayIcon = R.drawable.img,
                contentDescription = "title"
            )
        }
        item {
            OverlayRoundedBox(
                shape = RoundedCornerShape(28.dp),
                color = DeepBlue,
                size = 160.dp,
                overlayIcon = R.drawable.img,
                contentDescription = "title"
            )
        }
    }
}

@Composable
fun OverlayRoundedBox(
    shape: Shape,
    color: Color,
    size: Dp,
    overlayIcon: Int,
    contentDescription: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 20.dp)

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape)
                .background(color)
                .clip(shape)
                .background(color)
                .size(size)
        ) {
            Image(
                painter = painterResource(id = overlayIcon),
                contentDescription = contentDescription,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillBounds
            )

            Button(
                onClick = { },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Purple200),
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 6.dp)
            ) {
                Text(text = "New", color = Color.White)

            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f)
                    .background(color = colorResource(id = R.color.gray))
                    .align(Alignment.BottomCenter)
            ) {
                Text(
                    text = "Protein Milk Shake",
                    Modifier.padding(start = 25.dp),
                    fontSize = 16.sp,
                    color = colorResource(id = R.color.black_gray)
                )
                Text(
                    text = "Monday, July 31",
                    Modifier.padding(start = 25.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp,
                    color = colorResource(id = R.color.black_gray)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IndigoДегайTheme {
        Column {
            GreetingSection()
            listColumn()
        }
    }
}