import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.AppModule

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App(appModule = AppModule())
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App(appModule = AppModule())
}