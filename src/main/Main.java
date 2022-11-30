import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Component p = SimplePane.getInstance(true);
		if (p != null) {
			p.decorate(); 
			Pane pane = p.getPane();
			BorderPane borderPane = new BorderPane();
			borderPane.setCenter(pane);
			Scene scene = new Scene(borderPane, 300, 250);
			primaryStage.setTitle("TicTacToe");
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setAlwaysOnTop(true);
		} else
			System.out.println("Singleton Violation");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
