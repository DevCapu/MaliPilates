package br.com.devcapu.malipilates.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.com.devcapu.malipilates.ui.theme.MaliPilatesTheme

@Composable
fun BottomBar() {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.primary, contentColor = Color.White
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

@Preview
@Composable
fun BottomBarPreview() {
    MaliPilatesTheme {
        BottomBar()
    }
}