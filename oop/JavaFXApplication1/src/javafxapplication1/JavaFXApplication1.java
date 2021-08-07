/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author RTKS
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Color color = Color.AQUA;
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        Button btnOne = new Button();
        btnOne.setText("hello");
        Rectangle rect = new Rectangle(20, 20, 100, 100);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        rect.setFill(Color.SALMON);
        rect.setStroke(Color.BLACK);
//        StackPane root = new StackPane();
        HBox root = new HBox();
//        VBox root = new VBox();
        
        root.getChildren().addAll(btn, btnOne);
//        root.getChildren().add(btnOne);
        Group rootGroup = new Group();
        rootGroup.getChildren().addAll(root, rect);
        root.setLayoutY(200);
        Scene scene = new Scene(rootGroup, 400, 250, Color.AQUA);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
