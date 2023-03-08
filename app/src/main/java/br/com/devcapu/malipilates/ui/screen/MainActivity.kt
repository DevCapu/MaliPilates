package br.com.devcapu.malipilates.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.devcapu.malipilates.ui.theme.MaliPilatesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text(text = "Mali Pilates") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color(0xFF60678E),
                    titleContentColor = Color.White
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color(0xFF60678E),
                contentColor = Color.White,
                onClick = {
                    //TODO: DEAL WITH CLICK
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Edit, contentDescription = "Adicionar novo cliente",
                )
            }
        },
        bottomBar = {
            NavigationBar(
                containerColor = Color(0xFF60678E),
                contentColor = Color.White
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.Person, contentDescription = "Cliente") },
                    label = { Text("Clientes") },
                    selected = true,
                    onClick = { },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        unselectedIconColor = Color.LightGray,
                        selectedTextColor = Color.White,
                        unselectedTextColor = Color.LightGray,
                        indicatorColor = Color(0xFF60678E)
                    )
                )
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(
                    top = it
                        .calculateTopPadding()
                        .plus(16.dp)
                )
                .padding(
                    bottom = it
                        .calculateTopPadding()
                        .plus(16.dp)
                )
                .padding(horizontal = 8.dp)
        ) {
            item {
                Text(text = "Cliente")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MaliPilatesTheme {
        HomeScreen()
    }
}