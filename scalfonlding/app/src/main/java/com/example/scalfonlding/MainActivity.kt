package com.example.scalfonlding

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.scalfonlding.ui.theme.ScalfonldingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScalfonldingTheme {
                Aplicacion(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Preview(showBackground = true)

@Composable
fun prevista(){
    Aplicacion(modifier = Modifier.fillMaxSize())
}

@Composable
fun Aplicacion(modifier: Modifier) {
    Scaffold(modifier = modifier,
        topBar = {
           BarraSuperior()
        },
        bottomBar = {
            BarraInferior()
        },
        floatingActionButton = {
         BotonFlotante (al_pulsar = {})
        })
    { pading_interior ->
        Column(modifier = Modifier.padding(pading_interior).background(Color.Cyan)) {
            Text("Este es un mensaje",
                modifier=Modifier
                    .fillMaxSize(0.1f)
                    .background(color = Color.CYAN)
            )
            Greeting("Esta es una columna", modifier = modifier)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperior(){
    TopAppBar(title = {
        Text("Titulo de la barra", modifier = Modifier)
    })
}

@Composable
fun BarraInferior(){
    BottomAppBar {
        Text("Aqui va una opcion")
    }
}

@Composable
fun BotonFlotante(al_pulsar: () -> Unit){
    FloatingActionButton(onClick = {}) {
        Icon(Icons.Rounded.ShoppingCart, contentDescription = "")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = Modifier

    )
}

