package br.com.devcapu.malipilates.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
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
            CenterAlignedTopAppBar(
                title = { Text(text = "Mali Pilates") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White
                ),
                actions = {
                   IconButton(
                       colors = IconButtonDefaults.iconButtonColors(contentColor = Color.White),
                       onClick = { /*TODO*/ }
                   ) {
                       Icon(imageVector = Icons.Default.ExitToApp, contentDescription = null)
                   }
                },
                navigationIcon = {
                    IconButton(
                        colors = IconButtonDefaults.iconButtonColors(contentColor = Color.White),
                        onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = MaterialTheme.colorScheme.primary,
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
                containerColor = MaterialTheme.colorScheme.primary,
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
                        indicatorColor = MaterialTheme.colorScheme.primary
                    )
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.Event, contentDescription = "Cliente") },
                    label = { Text("Aula") },
                    selected = true,
                    onClick = { },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        unselectedIconColor = Color.LightGray,
                        selectedTextColor = Color.White,
                        unselectedTextColor = Color.LightGray,
                        indicatorColor = MaterialTheme.colorScheme.primary
                    )
                )
            }
        }
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