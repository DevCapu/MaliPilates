package br.com.devcapu.malipilates.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.devcapu.malipilates.ui.theme.MaliPilatesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewUserScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Nome") },
                placeholder = { Text(text = "João Gomes") },
                onValueChange = { }
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Instagram") },
                placeholder = { Text(text = "@user") },
                onValueChange = { }
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Celular") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Bairro onde trabalha") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Bairro onde reside") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Profissão") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                label = { Text(text = "Tempo de profissão") },
                placeholder = { Text(text = "(99) 99999-9999") },
                onValueChange = { }
            )

            Column(Modifier.selectableGroup().fillMaxWidth()) {
                Text(text = "Como nos encontrou")
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    RadioButton(
                        selected = true,
                        onClick = {  },
                        modifier = Modifier.semantics { contentDescription = "Localized Description" }
                    )
                    Text(text = "Indicação")
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    RadioButton(
                        selected = true,
                        onClick = {  },
                        modifier = Modifier.semantics { contentDescription = "Localized Description" }
                    )
                    Text(text = "Localização")
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    RadioButton(
                        selected = true,
                        onClick = {  },
                        modifier = Modifier.semantics { contentDescription = "Localized Description" }
                    )
                    Text(text = "Internet")
                }
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