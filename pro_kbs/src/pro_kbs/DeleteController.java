/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_kbs;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class DeleteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    JFXTextField t1;
    @FXML
    JFXButton b;

    public void submit(ActionEvent event) {
        String s = t1.getText();
        String result = "";
        System.out.println(s + "  ");
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("E:\\4 first term\\KBS\\pro_kbs\\src\\tamplet\\c.clp"));
            String line = reader.readLine();

            while (line != null) {

                System.out.println(line);
                // read next line
                if (line.equals("(defrule " + s)) {

                    System.out.println("hhiii");
                    while (line != null && line != ("=>")) {
                        System.out.println(" mafrod 4 bayn ");
                        line = reader.readLine();
                    }
                    if (line == "=>") {
                        line = reader.readLine();
                    }

                }

                if (line != null) {
                    result += line;
                }
                line = reader.readLine();
                result += "\n";
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("E:\\4 first term\\KBS\\pro_kbs\\src\\tamplet\\c.clp");
        } catch (IOException ex) {
            Logger.getLogger(DeleteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fileWriter.append(result);
        } catch (IOException ex) {
            Logger.getLogger(DeleteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(DeleteController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void back(ActionEvent event) {

        try {
            Stage s = (Stage) b.getScene().getWindow();
            s.close();
            Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Headech classification");

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
