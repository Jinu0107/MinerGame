package views;

import game.MainGame;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainController {
	@FXML
	private Canvas canvas;

	private MainGame game;
	
	@FXML
	private Label label;
	

	@FXML
	private void initialize() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		game = new MainGame(gc);
		game.render();
		System.out.println("안진우");
		

	}

	public void clickHandle(MouseEvent e) {
		game.clickHandle(e, label);
	}

	public void clickButton() {
		game.startButton();

	}
	

}
