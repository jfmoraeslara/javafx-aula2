package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btTest;
	
	@FXML
	private void onBtTestAction() {
		System.out.println("Click");
	}
}
