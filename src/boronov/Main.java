package boronov;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {


    private double xOffset;
    private double yOffset;

    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("FXML/Main.fxml")), 400, 500);
        stage.getIcons().add(new Image(String.valueOf(Main.class.getResource("FXML/icon.png"))));

        scene.setOnMousePressed(event -> {
            xOffset = stage.getX() - event.getScreenX();
            yOffset = stage.getY() - event.getScreenY();
        });

        scene.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() + xOffset);
            stage.setY(event.getScreenY() + yOffset);
        });

        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
