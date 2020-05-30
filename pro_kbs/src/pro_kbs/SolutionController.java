/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_kbs;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class SolutionController implements Initializable {

    @FXML
    Label l;
    String s2 = "";
    r obj = new r();

    public void setData(r s) {

        l.setText(s.getS2());

    }

    public void back(ActionEvent event) {

        try {
            Stage s = (Stage) l.getScene().getWindow();
            s.close();
            Parent parent = FXMLLoader.load(getClass().getResource("result.fxml"));

            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Headech classification");

            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException ex) {
            System.out.println("not load");
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
