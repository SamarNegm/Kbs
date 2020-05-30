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
public class ResultController implements Initializable {
  @FXML
    JFXTextField t1;
    @FXML
    Label l;
    String s2="";
    r obj=new r();
public void setData(r s)
{
  l.setText(s.getS1());
  s2=s.getS2();
    System.out.println("*********s1 is "+s.getS1()+ "  s2 is "+s.s2);
  obj=s;
}
    public void solution(ActionEvent event) {

        try {
            Stage s = (Stage) l.getScene().getWindow();
            s.close();
              FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("solution.fxml"));
                        Parent p = loader.load();

                        Scene tableViewScene = new Scene(p);

                        //access the controller and call a method
                        SolutionController controller = loader.getController();
                        controller.setData(obj);
                           Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                        window.setScene(tableViewScene);
                        window.show();
        } catch (IOException ex) {
            System.out.println("not load");
        }

    }
        public void back(ActionEvent event) {

        try {
            Stage s = (Stage) l.getScene().getWindow();
            s.close();
            Parent parent = FXMLLoader.load(getClass().getResource("Search.fxml"));

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
