import java.util.ArrayList;
import java.util.List;

public class Memento {
	private char shape;
	private int row;
	private int column;

	public Memento(char shape, int row, int column) {
		this.shape = shape;
		this.row = row;
		this.column = column;
	}

	public char getShape() {
		return this.shape;
	}

	public int getRow() {
		return this.row;
	}

	public int getColumn() {
		return this.column;
	}
}

class Originator {
	private char shape;
	private int row;
	private int column;

	public void setState(char shape, int row, int column) {
		this.shape = shape;
		this.row = row;
		this.column = column;
	}

	public Memento saveStateToMemento() {
		return new Memento(this.shape, this.row, this.column);
	}

	public void getStateFromMemento(Memento memento) {
		if (memento != null) {
			this.shape = memento.getShape();
			this.row = memento.getRow();
			this.column = memento.getColumn();
		}
	}

	public char getShape() {
		return this.shape;
	}

	public int getRow() {
		return this.row;
	}

	public int getColumn() {
		return this.column;
	}
}

class CareTaker {
	
}