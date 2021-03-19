package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DiceRoleSnake extends Application {

    public int rand;
    public Label randResults;

    public int cirPos[] [] = new int[10] [10];
    public int leadderPostion[] [] = new int [6] [3];

    public static final int Tile_Size = 80;
    public static final int width = 10;
    public static final int height = 10;
    public Circle player1;
    public Circle player2;

    public int playerPosition1 = 1;
    public int PlayerPosition2 = 1;

    public boolean player1Turn = true;
    public boolean player2Turn = true;

    public static int player1XPos = 40;
    public static int player1YPos = 740;

    public static int player2XPos = 40;
    public static int player2YPos = 740;

    public boolean gameStart = false;


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
                tilegroup.getChildren().add(tile); // once compiler has finished with this line, it goes back to beginning of for loop and make sure it keeps running until the value of J and i is equal to the width and height which is 10 and is true.
            }
        }

        player1 = new Circle(40);
        player1.setId("player1");
        player1.getStyleClass().add("style.css");
        player1.setTranslateX(player1XPos);
        player1.setTranslateY(player1YPos);



        tilegroup.getChildren().addAll(player1);
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
