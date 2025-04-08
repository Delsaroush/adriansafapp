package com.adriansafariapp.ui.theme.screens.home

import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.adriansafariapp.R
import com.adriansafariapp.navigation.ROUTE_DASHBOARD
import com.adriansafariapp.navigation.ROUTE_LOGIN
import com.adriansafariapp.navigation.ROUTE_REGISTER
import com.adriansafariapp.ui.theme.screens.login.loginscreen

@Composable
fun homescreen(navController: NavHostController) {

    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("Welcome To Sarousch's domain",
            color = Color.Blue,
            fontSize = 30 .sp
            , fontFamily = FontFamily.Cursive)
        Spacer(modifier = Modifier.height(40. dp))
        Image(painter = painterResource(id = R.drawable.sarousch),
        contentDescription = "sarousch",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp))
        Text("The app is named after Sarousch a narcissistic, " +
                "uncompromising, presumptuous, and completely in love with himself," +
                " he is seen admiring his reflection in the mirror and even says " +
                "\"I'd kiss me but then I'd fall in love\" which is a homage to the Greek God Narcissus" +
                " who actually fell in love with his own reflection in the river all the time. The app is made to enable one to find their inner beauty",
            color = Color.Blue,
            fontFamily = FontFamily.Cursive,
            fontSize = 15. sp
             )
        Spacer(modifier = Modifier.height(40. dp))
        Button(onClick = { navController.navigate(ROUTE_LOGIN)},
            modifier= Modifier.width(300. dp)) {
            Text(text="Login",
                fontSize = 30. sp)
        }
        Spacer(modifier = Modifier.height(40. dp))
        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier.width(300 .dp)) {
            Text(text = "Register",
                fontSize = 30. sp)

        }
        Spacer(modifier = Modifier.height(40. dp))
        Button(onClick = {navController.navigate(ROUTE_DASHBOARD)},
            modifier = Modifier.width(300 .dp)) {
            Text(text = "Dashboard",
                fontSize = 30. sp)

        }


}

    @Preview
    @Composable
    fun homepreview() {
        homescreen(navController)
    }
}