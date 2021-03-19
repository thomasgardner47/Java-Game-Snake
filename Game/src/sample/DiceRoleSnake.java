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



        for(int i = 0; i < height; i++) { // firstly we have the condition inside the loop the variable 'i' is less than equal to 'height' and height has a value of 10 which is shown above
            for (int j = 0; j < width; j++){ // it sees that that 'j' is equal to 0 which is a variable we initialise to 0 and then j less than equal to width and width has the value of 10 also,
                // which means that this condition is true because j is less than width which means 0 is less than 10
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
