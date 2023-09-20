import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
    @FXML
    private TextField nameTextField;
    @FXML
    private Label nameSetLabel;
    @FXML
    private Label randomNumberSetLabel;
    @FXML
    private Label attemptsLabel;
    @FXML
    private Label scoreLabel;
    @FXML
    private Group gameGroup;
    @FXML
    private Group scoreGroup;

    private int randomNumber;
    private String name;
    private int attempts;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        name = "";
        randomNumberSetLabel.setText("Press The Button To Generate Number");
        attempts = 2;
        randomNumber = -1;
    }

    @FXML
    public void submitName() {
        name = nameTextField.getText();
        nameSetLabel.setText("Hello, " + name);
    }

    @FXML
    public void generateNumber() {
        randomNumber = (int) (Math.random() * 3) + 1;
        randomNumberSetLabel.setText("Random number generated Please Choose One");
        attemptsLabel.setText("Attempts Left: " + attempts);
        attemptsLabel.setVisible(true);
    }

    @FXML
    public void circle1() {
        if (randomNumber == -1) {
            randomNumberSetLabel.setText("Please Generate Number First");
            return;
        }
        if (randomNumber == 1) {
            if (name.isBlank())
                scoreLabel.setText("You Win!!!");
            else
                scoreLabel.setText(name + " You Won!!!");
            gameGroup.setVisible(false);
            scoreGroup.setVisible(true);
            return;
        }
        if (attempts == 1) {
            gameGroup.setVisible(false);
            if (name.isBlank())
                scoreLabel.setText("You Lost!!!");
            else
                scoreLabel.setText(name + " You Lost!!!");
            scoreGroup.setVisible(true);
            return;
        }
        attempts--;
        attemptsLabel.setText("Attempts Left: " + attempts);
        randomNumberSetLabel.setText("Wrong Guess");
    }

    @FXML
    public void circle2() {
        if (randomNumber == -1) {
            randomNumberSetLabel.setText("Please Generate Number First");
            return;
        }
        if (randomNumber == 2) {
            if (name.isBlank())
                scoreLabel.setText("You Win!!!");
            else
                scoreLabel.setText(name + " You Won!!!");
            gameGroup.setVisible(false);
            scoreGroup.setVisible(true);
            return;
        }
        if (attempts == 1) {
            gameGroup.setVisible(false);
            if (name.isBlank())
                scoreLabel.setText("You Lost!!!");
            else
                scoreLabel.setText(name + " You Lost!!!");
            scoreGroup.setVisible(true);
            return;
        }
        attempts--;
        attemptsLabel.setText("Attempts Left: " + attempts);
        randomNumberSetLabel.setText("Wrong Guess");
    }

    @FXML
    public void circle3() {
        if (randomNumber == -1) {
            randomNumberSetLabel.setText("Please Generate Number First");
            return;
        }
        if (randomNumber == 3) {
            if (name.isBlank())
                scoreLabel.setText("You Win!!!");
            else
                scoreLabel.setText(name + " You Won!!!");
            gameGroup.setVisible(false);
            scoreGroup.setVisible(true);
            return;
        }
        if (attempts == 1) {
            gameGroup.setVisible(false);
            if (name.isBlank())
                scoreLabel.setText("You Lost!!!");
            else
                scoreLabel.setText(name + " You Lost!!!");
            scoreGroup.setVisible(true);
            return;
        }
        attempts--;
        attemptsLabel.setText("Attempts Left: " + attempts);
        randomNumberSetLabel.setText("Wrong Guess");
    }

    @FXML
    public void exit() {
        System.exit(0);
    }
}
