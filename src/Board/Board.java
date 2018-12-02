package Board;

import java.util.ArrayList;
import Event.*;
import Field.*;
import GUI.*;
import Player.*;
import TUI.*;
import reader.boardReader;

public class Board {
	
	private ArrayList<Field> fields = new ArrayList<Field>();
	private int x;
	private int y;
	
	public Board(int x, int y) throws Exception {
		this.x = x;
		this.y = y;
		this.fields = boardReader.getDefaultBoard();
	}
	
	public Field getField(int pos) {
		return fields.get(pos);
	}
	
	public boolean[] changePosition(int pos) {
		return fields.get(pos).getWalls();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
