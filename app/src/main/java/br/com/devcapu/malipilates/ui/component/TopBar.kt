package br.com.devcapu.malipilates.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.com.devcapu.malipilates.ui.theme.MaliPilatesTheme

@Composable
fun TopBar() {
    CenterAlignedTopAppBar(
        title = { Text(text = "Mali Pilates") },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = Color.White
        ),
        actions = {
            IconButton(colors = IconButtonDefaults.iconButtonColors(contentColor = Color.White),
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.ExitToApp, contentDescription = null)
            }
        },
        navigationIcon = {
            IconButton(colors = IconButtonDefaults.iconButtonColors(contentColor = Color.White),
                onClick = { /* doSomething() */ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Localized description"
                )
            }
        }
    )
}

@Preview
@Composable
fun TopBarPreview() {
    MaliPilatesTheme {
        TopBar()
    }
}