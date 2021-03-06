import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

public class Controller {
    @FXML
    public ComboBox combo;
    public ChoiceBox choice;

    public void initialize() {
        choice.getItems().addAll("Test1", "Test2", "Test3");
        combo.getItems().addAll("Test1", "Test2", "Test3");
    }

}
