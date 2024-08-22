
package Unit6JavaFX;

/**
 *
 * @author HP
 */

import javafx.application.Application;
import javafx.application.Application.*;
import javafx.stage.*;//main window
import javafx.scene.*;//subwinodw
import javafx.scene.control.*;//componrnt like button
import javafx.scene.layout.*;//for layout
import javafx.event.*;
public class FxLayoutDemo extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        Button b1=new Button("Button 1");
        Button b2=new Button("Button 2");
        Button b3=new Button("Button 3");
        Button b4=new Button("Button 4");
        Label l1=new Label("Result");
        //add action event 
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                l1.setText("Button 1 is clicked");
            }
        });
        
        //layout 
        //FlowPane: places the comp from ledt ro right
//        FlowPane fp=new FlowPane();
//        fp.setHgap(20);
//        fp.setVgap(20);
//        fp.getChildren().add(b1);
//        fp.getChildren().add(b2);
//        fp.getChildren().add(b3);
//        fp.getChildren().add(b4);
//        fp.getChildren().add(l1);
//        
        //gridpane places the comp in form of row and columns
//        GridPane gp=new GridPane();
//        gp.add(b1,0,0);
//        gp.add(b2,0,1);
//        gp.add(b3,1,0);
//        gp.add(b4,1,1);
//        gp.add(l1,1,2);
//        
        //Borderpane: places com in direction
        BorderPane bp=new BorderPane();
        bp.setCenter(l1);
        bp.setTop(b1);
        bp.setBottom(b2);
        bp.setRight(b3);
        bp.setLeft(b4);
//        
        //HBox: places the compoinent horizontally
//        HBox hb=new HBox();
//        hb.getChildren().addAll(b1,b2,b3,b4,l1);
        
        //VBox: places the compoinent horizontally
//        VBox vb=new VBox();
//        vb.getChildren().addAll(b1,b2,b3,b4,l1);
//        
//        add layout into scene
//        Scene sc=new Scene(fp,200,200);
//        Scene sc=new Scene(gp,200,200);
        Scene sc=new Scene(bp,200,200);
//        Scene sc=new Scene(hb,500,500);
//        Scene sc=new Scene(vb,500,500);
        //add scene into stage
        stage.setTitle("layout example");
        stage.setScene(sc);
        stage.show();
        
    }
}
