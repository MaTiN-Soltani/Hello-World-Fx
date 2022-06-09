import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class App extends Application {

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        Group root = new Group();
        Scene myScene = new Scene(root, Color.BLACK);
        
        stage.setTitle("Stage Demo - Hello, World");

        Image icon = new Image("icon.png");
        stage.setHeight(420);
        stage.setWidth(420);
        stage.setResizable(false);
        
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Hit q to quit Full Screen");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.getIcons().add(icon);
        stage.setScene(myScene);
        stage.show();

        
    }

 }