import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

public class SimplePane extends BorderPane implements Component {
	private Cell[][] cell = new Cell[3][3];
	private char playerTurn = 'X';

	private GridPane cellPane;
	private FlowPane jpButton;

	private boolean isAdvanceMode;

	private Label lblStatus = new Label("X's turn to play");

	public EventHandler<ActionEvent> ae = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent a) {
			((ICommand) a.getSource()).Execute();
		}
	};

	public static Component getInstance(boolean isAdvanceMode) {
		if (isAdvanceMode) {
			return new PaneWithUpdate(new SimplePane(isAdvanceMode));
		} else {
			return new PaneWithoutUpdate(new SimplePane(isAdvanceMode));
		}
	}

	private SimplePane(boolean bool) {
		isAdvanceMode = bool;
	}

	@Override
	public void decorate() {

		cellPane = new GridPane();
		for (int i = 0; i < cell.length; i++) {
			for (int j = 0; j < cell.length; j++) {
				cell[i][j] = new Cell(i, j);
				cellPane.add(cell[i][j], i, j);
			}
		}

		this.setCenter(cellPane);
		this.setBottom(lblStatus);
		
	}
	
	@Override
	public void addButtons(CommandButton... buttons) {
		jpButton = new FlowPane();
		jpButton.getChildren().addAll(buttons);

		for (CommandButton b : buttons) {
			b.setPane(this);
			b.setOnAction(ae);
		}

		this.setTop(jpButton);
	}

	public void newGame() {
		lblStatus = new Label("X's turn to play");
		playerTurn = 'X';

		CommandButton.careTaker.getUndoArrayList().clear();
		CommandButton.careTaker.getRedoArrayList().clear();

		decorate();
	}

	public void setPane(char shape, int i, int j) {
		playerTurn = (playerTurn == 'X') ? 'O' : 'X';
		// Display whose turn
		lblStatus.setText(playerTurn + "'s turn");
	}

	public boolean checkCells() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (cell[i][j] != null)
					return false;
			}
		}
		return true;
	}

	@Override
	public Pane getPane() {
		return this;
	}

	public Label getLblStatus() {
		return lblStatus;
	}

	// An inner class for a cell
	private class Cell extends Pane { // Token used for this cell
		private char token = ' ';
		private int row;
		private int column;

		public Cell(int i, int j) {
			this.row = i;
			this.column = j;

			setStyle("-fx-border-color: black");
			this.setPrefSize(2000, 2000);
		}

	}

}
