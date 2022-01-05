package com.example.hellocompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                HelloCompose()
            }
        }
    }
}

@Composable
fun HelloCompose(){
        Card(
            elevation = 4.dp,
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.padding(8.dp)
        ) {
            Column (
                modifier = Modifier.padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painterResource(id = R.drawable.rosaria),
                    null,
                )
                Text(text = "Rosaria Genshin Impact", style = MaterialTheme.typography.h5)
                Text(text = "Curso de Jetpack Compose", style = MaterialTheme.typography.body1)
                Button(onClick = {

                }, modifier = Modifier.padding(top = 16.dp),
                    shape = MaterialTheme.shapes.large)
                {
                    Text(text = "Click me")
                }
            }
        }
}

@Preview(
    showBackground = true
)
@Composable
fun HelloComposePreview() {
    HelloComposeTheme {
        HelloCompose()
    }
}