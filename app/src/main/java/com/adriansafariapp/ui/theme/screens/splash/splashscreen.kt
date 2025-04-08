package com.adriansafariapp.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.adriansafariapp.R
import com.adriansafariapp.navigation.ROUTE_HOME
import kotlinx.coroutines.delay


@Composable
fun splashscreen(navController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate(ROUTE_HOME)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier= Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.s2),
            contentDescription = "Splash Screen Logo",
            modifier = Modifier.size(5000.dp)
            
        )
    }


}

@Preview
@Composable
private fun splashprev() {
    splashscreen(rememberNavController())
}