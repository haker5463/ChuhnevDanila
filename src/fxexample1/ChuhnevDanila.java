package fxexample1;

import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ChuhnevDanila extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage theStage) {
        Button Play = new Button();
        Play.setText("Play");
        Button Help = new Button();
        Help.setText("Help");
        Button Exit = new Button();

        Exit.setText("Exit");
        Play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              //  System.out.println("Hi, welcom to Diablo VII,the game is currently under development");
              
             Label secondLabel = new Label("Hi, welcom to Diablo VII,the game is currently under development");
              
                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(secondLabel);
 
                Scene secondScene = new Scene(secondaryLayout, 800, 130);
 
                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Second Stage");
                newWindow.setScene(secondScene);
 
                // Set position of second window, related to primary window.
                newWindow.setX(theStage.getX() + 200);
                newWindow.setY(theStage.getY() + 100);
                secondLabel.getStylesheets().add("css/Game.css");
                newWindow.show();
            }
        });

        Help.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             Label secondLabel = new Label("Hi, welcom to Diablo VII,the game is currently under development");
              
                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(secondLabel);
 
                Scene secondScene = new Scene(secondaryLayout, 800, 130);
 
                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Second Stage");
                newWindow.setScene(secondScene);
 
                // Set position of second window, related to primary window.
                newWindow.setX(theStage.getX() + 200);
                newWindow.setY(theStage.getY() + 100);
                secondLabel.getStylesheets().add("css/ButtonStyle2.css");
            
                newWindow.show();
            }
        });

        Exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = (Stage) Exit.getScene().getWindow();
                stage.close();
            }

        });

        theStage.setTitle("Diablo VII");

        Group root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);

        Canvas canvas = new Canvas(1920, 1080);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        Image pic = new Image("Diablo-Immortal_2.png");
        gc.drawImage(pic, 0, 0);
        gc.setFill(Color.RED);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        Font theFont = Font.font("Times New Roman", FontWeight.BOLD, 48);
        gc.setFont(theFont);
        gc.fillText("Diablo VII", 930, 50);
        gc.strokeText("Diablo VII", 930, 50);
        Image pic1 = new Image("(7).png");
        gc.drawImage(pic1, -100, 0);
        Image pic2 = new Image("(28).png");
        gc.drawImage(pic2, 1100, 0);
        root.getChildren().add(Play);
        root.getChildren().add(Help);
        root.getChildren().add(Exit);
        Play.relocate(960, 340);
        Help.relocate(960, 440);
        Exit.relocate(960, 540);
        root.getStylesheets().add("css/Game.css");

        theStage.show();

    }

}
