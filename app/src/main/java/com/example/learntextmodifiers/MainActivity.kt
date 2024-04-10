package com.example.learntextmodifiers

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntextmodifiers.ui.theme.LearnTextModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTextModifiersTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LaernTextAndModifiers()

                }
            }
        }
    }
}

@Composable
fun LaernTextAndModifiers(){

    val clickOnText = {}//просто действие для примера

    Text(//функция для создания TextView
        //Модификатор - это часть параметров составной функции,
        //с помощью которого можно осуществить отступы, высоту, ширину
        text= "Hello World",
        //=stringResource(id = R.string.hello_text),
        color= Color.Red,
        fontSize = 32.sp,
        fontStyle = FontStyle.Italic,
        modifier = Modifier
            .padding(22.dp)
            .background(Color.Black)
            .clickable(onClick = clickOnText)
    )
}
@Preview(showBackground = true)
@Composable
fun LaernTextAndModifiersPreview(){
    LearnTextModifiersTheme {
        Surface(//так можно просмотреть полностью экран
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            LaernTextAndModifiers()

        }
    }
}