package com.example.felizcumpleaos


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.felizcumpleaos.ui.theme.FelizCumpleañosTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import com.example.felizcumpleaos.R.drawable.androidparty
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FelizCumpleañosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        mensaje = stringResource(R.string.happy_birthday_text),
                        from = stringResource(R.string.from_text)
                    )
                }
            }
        }
    }
}


@Composable
fun GreetingImage(mensaje: String,from: String,modifier: Modifier = Modifier){
    val image = painterResource(androidparty)
    Box (modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GrettingText(
            mensaje = mensaje,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Composable
fun GrettingText(mensaje: String,from: String, modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = mensaje,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally),
        )
    }
}



@Preview(showBackground = true)
@Composable
fun FuncionCartaCumple() {
    FelizCumpleañosTheme {
        GreetingImage(
            mensaje = "Happy Birthday Sam!",
            from = "From Emma"
        )
    }

}

// Do: This function is a descriptive PascalCased noun as a non-visual element
// with presence in the composition
//@Composable
//fun BackButtonHandler() {}

// Don't: This function is a noun but is not PascalCased!
//@Composable
//fun fancyButton(text: String) {}

// Don't: This function is PascalCased but is not a noun!
//@Composable
//fun RenderFancyButton(text: String) {}

// Don't: This function is neither PascalCased nor a noun!
//@Composable
//fun drawProfileImage(image: ImageAsset) {}

