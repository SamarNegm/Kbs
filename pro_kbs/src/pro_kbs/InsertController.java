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
import jess.JessException;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class InsertController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    JFXButton b;
    @FXML
    JFXTextField t1, t2, t3;

    public void submit(ActionEvent event) {
        BufferedReader reader;
        String result = "";
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
//        String st="";
//        String sr="";
        try {
            reader = new BufferedReader(new FileReader("E:\\4 first term\\KBS\\pro_kbs\\src\\tamplet\\c.clp"));
            String line = reader.readLine();
            int f = 0;
            while (line != null) {

                System.out.println(line);
                // read next line

                result += line;

                result += "\n";
                if (f == 0) {
                    result += ("(slot " + s2 + ")\n");
                    f = 1;
                }

                line = reader.readLine();
            }
            result+="\n"+"(defrule "+s1+"\n(Symptoms {"+s2+" == true} )\n=> (assert (Type (type "+s3+"))))\n";
            

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("E:\\4 first term\\KBS\\pro_kbs\\src\\tamplet\\c.clp");
        } catch (IOException ex) {
            Logger.getLogger(InsertController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fileWriter.append(result);
        } catch (IOException ex) {
            Logger.getLogger(InsertController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(InsertController.class.getName()).log(Level.SEVERE, null, ex);
        }
        String t = t3.getText();
//        for(int i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)!=' ')
//            st+=s.charAt(i);
//        }
//        s=st;
//        for(int i=0;i<r.length();i++)
//        {
//            if(r.charAt(i)!=' ')
//            sr+=r.charAt(i);
//        }
//        r=sr;
//    
//        String rule="(defrule "+r+"\n(Symptoms {"+s+" == true} )\n=>\n(assert (Type (type "+t+"))))\n";
//        
//                     FileWriter fileWriter = null;
//                try {
//                    fileWriter = new FileWriter("E:\\4 first term\\KBS\\pro_kbs\\src\\tamplet\\c.clp",true);
//                } catch (IOException ex) {
//                    Logger.getLogger(InsertController.class.getName()).log(Level.SEVERE, null, ex);
//                }
//        try {
//            fileWriter.append(rule);
//        } catch (IOException ex) {
//            Logger.getLogger(InsertController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            fileWriter.close();
//        } catch (IOException ex) {
//            Logger.getLogger(InsertController.class.getName()).log(Level.SEVERE, null, ex);
//        }

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
