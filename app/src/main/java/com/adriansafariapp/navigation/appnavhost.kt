package com.adriansafariapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.adriansafariapp.ui.theme.screens.dashboard.Dashboard_Screen
import com.adriansafariapp.ui.theme.screens.home.homescreen
import com.adriansafariapp.ui.theme.screens.login.loginscreen
import com.adriansafariapp.ui.theme.screens.register.registerscreen
import com.adriansafariapp.ui.theme.screens.splash.splashscreen

@Composable
fun appnavhost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String=ROUTE_SPLASH) {
    NavHost(navController= navController,
        modifier = modifier,
        startDestination =startDestination, ){
        composable(ROUTE_HOME){
            homescreen(navController)
        }
        composable(ROUTE_LOGIN){
            loginscreen(navController)
        }
        composable(ROUTE_REGISTER){
            registerscreen(navController)
        }
        composable (ROUTE_SPLASH){
            splashscreen(navController)
        }
        composable (ROUTE_DASHBOARD){
            Dashboard_Screen()
        }
    }

}

    

    

    
