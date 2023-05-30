/**
 Owner-Prabhash-wijerathna
 Date-2023/05/28

 **/
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserLoginFormController {
    public AnchorPane loginFormContext;
    public TextField txtUserName;
    static String userName;

    public void LogInAction(ActionEvent actionEvent) throws IOException {
      userName=txtUserName.getText();
      Stage stage = new Stage();
      stage.setScene(new Scene(FXMLLoader.load(UserLoginFormController.class.getResource("../view/ClientForm.fxml"))));
      stage.close();
      stage.centerOnScreen();
      stage.show();
    }
}
