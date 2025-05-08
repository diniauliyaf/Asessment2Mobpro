package com.diniauliya0015.asessment2mobpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.diniauliya0015.asessment2mobpro.navigation.SetupNavGraph
import com.diniauliya0015.asessment2mobpro.ui.theme.Asessment2MobproTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Asessment2MobproTheme {
               SetupNavGraph()
            }
        }
    }
}
