package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.Gray),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.imc),
                contentDescription = ("Icone Calculadora"),
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .padding(top = 10.dp)

            )
            Text(
                text = "Calculadora IMC",
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(15.dp)

            )

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 39.dp)
                .offset(x = 0.dp, y = -32.dp)
                .background(Color.LightGray)

        ) {

            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(start = 85.dp)
            ) {
                Text(
                    text = "Seus Dados",
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )

            }

            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                TextField(
                    value = "Seu peso em kg",
                    onValueChange = {},
                    label = {
                        Text(text = "Seu peso:")
                    }
                )

                Spacer(modifier = Modifier.height(25.dp))

                OutlinedTextField(
                    value = "Sua altura em cm",
                    onValueChange = {},
                    label = {
                        Text(text = "Sua altura:")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Red
                    )
                )

                Spacer(modifier = Modifier.height(50.dp))

                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth()
                ) {
                    Text(text = "Calcular", fontWeight = FontWeight.ExtraBold, fontSize = 19.sp)
                }
            }

        }

        Column(
            modifier = Modifier
                .width(300.dp)
                .height(50.dp)
                .padding(start = 110.dp)
                .background(Color.Green)
        ) {
            Spacer(modifier = Modifier.height(5.dp))
            Text (
                text = "Resultado",
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(start = 38.dp)
            )
        }
    }


}

// Cor da atividade 2 - #7177C1


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraTheme {
        Greeting()
    }
}