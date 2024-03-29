package test.app.composetestapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    onCheckedTask: (WellnessTask, Boolean) -> Unit,
    onCloseTask:(WellnessTask) -> Unit,
    list: List<WellnessTask>,
){
    LazyColumn(
        modifier = modifier
    ){
        items(
            items = list,
            key = {task -> task.id}
        )
        { task ->
            WellnessTaskItem(
                taskName = task.label,
                modifier,
                onCheckedChange = ,
                onClose = {onCloseTask(task)},
            )
        }
    }
}