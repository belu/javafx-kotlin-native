package hellofx

import javafx.application.Application
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import javafx.scene.layout.HBox
import javafx.scene.paint.Color
import javafx.scene.text.Font.font
import javafx.stage.Stage

class Main : Application() {

    override fun start(stage: Stage) {
        stage.title = "Hello, JavaFX native!"
        stage.scene = createScene()
        stage.show()
    }

    private fun createScene(): Scene {
        val root = createRoot()
        return Scene(root, 800.0, 600.0)
    }

    private fun createRoot(): Parent {
        return HBox().apply {
            background = Background(BackgroundFill(Color.AQUA, CornerRadii.EMPTY, Insets.EMPTY))
            alignment = Pos.CENTER
            children += Label("Hello, JavaFX native!").apply {
                font = font(40.0)
            }
        }
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}