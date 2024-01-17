package com.kevinhomorales.recyclerjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.kevinhomorales.recyclerjetpackcompose.ui.theme.RecyclerJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecyclerJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    setList()
                }
            }
        }
    }
}

@Composable
fun setList() {
    LazyColumn {
        items((1..100).toList()) {
            Text(text = "Número $it", fontSize = 22.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecyclerJetpackComposeTheme {
        setList()
    }
}