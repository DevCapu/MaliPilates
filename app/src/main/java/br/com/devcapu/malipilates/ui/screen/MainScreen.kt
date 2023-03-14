package br.com.devcapu.malipilates.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.devcapu.malipilates.ui.component.BottomBar
import br.com.devcapu.malipilates.ui.component.TopBar
import br.com.devcapu.malipilates.ui.theme.MaliPilatesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
        floatingActionButton = {
            FloatingActionButton(containerColor = MaterialTheme.colorScheme.primary,
                contentColor = Color.White,
                onClick = { /* TODO: DEAL WITH CLICK */ }
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Adicionar novo cliente",
                )
            }
        },
    ) {
        NewUserScreen(
            modifier = Modifier
                .padding(
                    top = it
                        .calculateTopPadding()
                        .plus(12.dp)
                )
                .padding(
                    bottom = it
                        .calculateBottomPadding()
                        .plus(16.dp)
                )
                .padding(horizontal = 12.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MaliPilatesTheme {
        HomeScreen()
    }
}