package application;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.*;


public class Main extends Application {
	private Stage stage;
	private Scene scene;
	private FlowPane pane;
	private Label label;
	
	public void start(Stage stage){
	this.stage=stage;
	pane=new FlowPane();
	label=new Label("hello world");
	pane.getChildren().add(label);
	scene=new Scene(pane,640,480);
	stage.setScene(scene);
	stage.show();
	}


	private Stage extracted() {
		return this.stage=stage;
	}

	
	public static void main(String[] args) {
		launch(args);

	}

}
