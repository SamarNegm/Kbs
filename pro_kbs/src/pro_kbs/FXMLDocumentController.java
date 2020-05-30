/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_kbs;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author lenovo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXButton s,u,d,insert;
    
    @FXML
    private void search(ActionEvent event) {
            try {
              Stage st=(Stage)s.getScene().getWindow();
              st.close();
            Parent parent = FXMLLoader.load(getClass().getResource("Search.fxml"));

            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("define the type of your headech");
        

            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException ex) {
            System.out.println("not load");
        }
     
    }
        @FXML
       private void update(ActionEvent event) {
            try {
              Stage st=(Stage)s.getScene().getWindow();
              st.close();
            Parent parent = FXMLLoader.load(getClass().getResource("update.fxml"));

            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("update");
        

            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException ex) {
            System.out.println("not load");
        }
     
    }
           @FXML
          private void delete(ActionEvent event) {
            try {
              Stage st=(Stage)s.getScene().getWindow();
              st.close();
            Parent parent = FXMLLoader.load(getClass().getResource("delete.fxml"));

            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("delete");
        

            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException ex) {
            System.out.println("not load");
        }
     
    }
              @FXML
       private void insert(ActionEvent event) {
            try {
              Stage st=(Stage)s.getScene().getWindow();
              st.close();
            Parent parent = FXMLLoader.load(getClass().getResource("insert.fxml"));

            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("insert");
        

            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException ex) {
            System.out.println("not load");
        }
     
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
