package test.app.composetestapp.examples

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import test.app.composetestapp.ui.theme.ComposeTestAppTheme

class Example2 {
//
//    class MainActivity : ComponentActivity() {
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContent {
//                ComposeTestAppTheme {
//                    MyApp()
//                }
//            }
//        }
//    }
//
//    @Composable
//    private fun OnBoardingScreen(
//        modifier: Modifier = Modifier,
//        buttonCallBack:() -> Unit,
//    ){
//        Column(
//            modifier = modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        )
//        {
//            Text(text = "Welcome to the Basics Codelab!")
//            Button(onClick = { buttonCallBack() }) {
//                Text(text = "Continue")
//            }
//        }
//
//    }
//
//    @Composable
//    private fun MyApp() {
//        var shouldShowOnBoarding by rememberSaveable { mutableStateOf(true) }
//
//        if (shouldShowOnBoarding)
//            OnBoardingScreen(buttonCallBack = { shouldShowOnBoarding = false })
//        else { Greetings() }
//    }
//
//    @Composable
//    fun Greetings(
//        modifier: Modifier = Modifier,
//        names: List<String> = List(1000) { "$it" },
//    ){
//        LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
//            items(items = names){name ->
//                Greeting(name = name)
//            }
//        }
//    }
//
//    @Composable
//    fun Greeting(name: String) {
//        Surface(
//            color = MaterialTheme.colorScheme.primary,
//            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
//        ) {
//            var extended by remember { mutableStateOf(false) }
//
//            val extraPadding by animateDpAsState(
//                if (extended) 48.dp else 0.dp,
//                animationSpec = spring(
//                    dampingRatio = Spring.DampingRatioHighBouncy,
//                    stiffness = Spring.StiffnessVeryLow,
//                )
//            )
//
//            Row(Modifier.padding(24.dp)) {
//                Column(
//                    Modifier
//                        .weight(1f)
//                        .padding(bottom = extraPadding.coerceAtLeast(0.dp))
//                ) {
//                    Text(text = "Hello")
//                    Text(text = name, style = MaterialTheme.typography.titleLarge)
//                }
//                ElevatedButton(onClick = { extended = !extended }) {
//                    Text(if (extended) "Show less" else "Show more")
//                }
//            }
//        }
//    }
//
//    @Preview(showBackground = true, heightDp = 100, uiMode = Configuration.UI_MODE_NIGHT_YES)
//    @Composable
//    fun DefaultPreview() {
//        ComposeTestAppTheme {
//            MyApp()
//        }
//    }
//
//    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
//    @Composable
//    fun DefaultPreview2() {
//        ComposeTestAppTheme {
//            Greetings()
//        }
//    }
}