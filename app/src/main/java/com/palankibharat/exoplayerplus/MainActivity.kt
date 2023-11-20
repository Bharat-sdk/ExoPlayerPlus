package com.palankibharat.exoplayerplus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.palankibharat.exo_compose_player.PipInitializer
import com.palankibharat.exo_compose_player.ComposePlayPauseButton
import com.palankibharat.exo_compose_player.ExoComposePlayer
import com.palankibharat.exoplayerplus.ui.theme.ExoPlayerPlusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pip = PipInitializer(this)
        pip.initialize()

        setContent {
            ExoPlayerPlusTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Column {
                        ExoComposePlayer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(16f / 9f),
                            mediaUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
                        )
                        Box(modifier = Modifier.height(150.dp).width(150.dp).padding(5.dp)
                           // onPlayPauseToggle(isPlaying)
                        ) {
                            ComposePlayPauseButton(modifier = Modifier.fillMaxSize(), iconColor = Color.Black, isVideoPlaying = false){

                            }
                        }


                    }

                }
            }
        }
    }
}
