package test.app.composetestapp

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import test.app.composetestapp.ui.theme.ComposeTestAppTheme

class Example1 {
//
//    class MainActivity : ComponentActivity() {
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContent {
//                ComposeTestAppTheme {
//                    // A surface container using the 'background' color from the theme
//                    Surface(
//                        modifier = Modifier.fillMaxSize(),
//                        color = MaterialTheme.colorScheme.onPrimary,
//                    ) {
//                        Conversation(listOf("Me", "Android", "Rabbit", "Bel", "Soup"))
//                    }
//                }
//            }
//        }
//    }
//
//    @Composable
//    fun Conversation(messages: List<String>) {
//        LazyColumn {
//            items(messages) { message ->
//                Greeting(message){
//
//                }
//            }
//        }
//    }
//
//    @Composable
//    fun Greeting(name: String, callback: () -> Unit) {
//        Row(
//            modifier = Modifier.padding(8.dp)
//        ) {
//
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_background),
//                contentDescription = "test image",
//                modifier = Modifier
//                    .size(40.dp)
//                    .clip(CircleShape)
//                    .border(width = 5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
//            )
//
//            Spacer(modifier = Modifier.width(8.dp))
//
//            var isExpanded by remember { mutableStateOf(false) }
//
//            Column(
//                modifier = Modifier.clickable { isExpanded = !isExpanded }
//            ) {
//                Text(
//                    text = "Hello $name!",
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.fillMaxWidth(),
//                )
//                if (isExpanded) Text(
//                    text = "Bye $name!",
//                    textAlign = TextAlign.End,
//                    modifier = Modifier.fillMaxWidth(),
//                )
//            }
//        }
//    }
//
//    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
//    @Composable
//    fun DefaultPreview() {
//        ComposeTestAppTheme {
//            Conversation(listOf("Me", "Android", "Rabbit", "Bel", "Soup"))
//        }
//    }

}