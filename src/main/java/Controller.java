import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Date;


public class Controller {
    String user = "user: ";

    @FXML
    TextArea textArea;
    @FXML
    TextField textField;
    @FXML
    Button button;

    public String time() {
        Date date = new Date();
        return "["+date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds()+"] ";
    }

    public void sendMsg() {
        if(textField.getText().length()>0) {
            textArea.appendText(time() + user + textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }
    }
}
