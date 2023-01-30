package com.example.superhero

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.superhero.components.HeroCard
import com.example.superhero.model.HeroData.heroes
import com.example.superhero.ui.theme.SuperheroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                  App()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview(showSystemUi = true)
@Composable
fun App() {
    Scaffold(
        topBar = { AppBar() }
    ) {
        LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background)){
            items(heroes){
HeroCard(hero = it)
            }
        }
    }
}

@Composable
fun AppBar(modifier: Modifier = Modifier) {
    Row (modifier = Modifier , horizontalArrangement = Arrangement.Center){
        Text(stringResource(R.string.app_name),style = MaterialTheme.typography.h1,
           fontSize = 40.sp)
    }
}