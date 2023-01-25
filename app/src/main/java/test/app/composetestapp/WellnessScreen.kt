package test.app.composetestapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import test.app.composetestapp.examples.WaterCounter

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    WaterCounter(modifier)
}