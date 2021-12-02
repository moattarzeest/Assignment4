package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static Stage stage1;
    @Override
    public void start(Stage stage) throws IOException
    {
        stage1 = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("vm.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Voting Machine");
        stage.setScene(scene);
        stage.show();
    }
    public void changeScene(String fxml) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
        stage1.setTitle("Hwllo");
        stage1.setScene(new Scene(fxmlLoader.load()));
        stage1.show();
    }

    public static void main(String[] args) {
        launch();
    }
}