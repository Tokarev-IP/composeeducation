package test.app.composetestapp

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column {
        StatefulCounter()

        WellnessTasksList(
            modifier,
            onCheckedTask = ,
            onCloseTask = { task -> wellnessViewModel.remove(task) },
            list = wellnessViewModel.tasks,
        )
    }
}
