package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DiceRoleSnake extends Application {

    public static final int Tile_Size = 80;
    public static final int width = 10;
    public static final int height = 10;


    private Group tilegroup = new Group();
    private Parent createContent() {
        StackPane root = new StackPane();
        root.setPrefSize(width*Tile_Size, (height* Tile_Size) + 80);
        root.getChildren().addAll(tilegroup);




        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++){
                Tile tile = new Tile(Tile_Size, Tile_Size);
                tile.setTranslateX(j * Tile_Size);
                tile.setTranslateY(i * Tile_Size);
                tilegroup.getChildren().add(tile);
            }
        }
        return root;
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
