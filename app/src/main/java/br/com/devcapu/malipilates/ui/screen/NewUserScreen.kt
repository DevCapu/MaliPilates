package br.com.devcapu.malipilates.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.devcapu.malipilates.ui.theme.MaliPilatesTheme
import br.com.devcapu.malipilates.ui.theme.robotoSerif

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewUserScreen(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        item {
            Text(
                text = "Dados pessoais",
                fontFamily = robotoSerif,
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF3F3F3F)
            )
        }
        item {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Nome") },
                placeholder = { Text(text = "João Gomes") },
                onValueChange = { }
            )
        }

        item {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Instagram") },
                placeholder = { Text(text = "@user") },
                onValueChange = { }
            )
        }

        item {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Celular") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )
        }
        item {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Bairro onde trabalha") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )
        }

        item {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Bairro onde reside") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )
        }

        item {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Profissão") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )
        }
        item {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Tempo de profissão") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )
        }

        item {
            Surface(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth()
                    .pointerInput(Unit) {
                        detectTapGestures(onTap = { expanded = !expanded })
                    },
                shape = RoundedCornerShape(4.dp),
                border = BorderStroke(1.dp, Black)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Como nos encontrou?")
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Ver opções de como nos encontrou"
                    )
                }
            }

            DropdownMenu(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text("Indicação") },
                    onClick = { /* Handle edit! */ },
                )
                DropdownMenuItem(
                    text = { Text("Localização") },
                    onClick = { /* Handle settings! */ },
                )
                DropdownMenuItem(
                    text = { Text("Internet") },
                    onClick = { /* Handle send feedback! */ },
                )
                DropdownMenuItem(
                    text = { Text("Outros") },
                    onClick = { /* Handle send feedback! */ },
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewUserScreenPreview() {
    MaliPilatesTheme {
        NewUserScreen()
    }
}