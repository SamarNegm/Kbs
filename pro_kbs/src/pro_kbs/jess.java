/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_kbs;

import java.awt.Dialog;
import java.io.IOException;
import java.io.StringWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
import jess.JessException;

import jess.Rete;

/**
 *
 * @author lenovo
 */
class jess {

    public static Rete engine;
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    public  static r queryInferenceEngine(String s) throws JessException {

        SearchController sc = new SearchController();
        // Create a Jess rule engine
        engine = new Rete();
        engine.reset();
        StringWriter o = new StringWriter();
   StringWriter o2 = new StringWriter();
        engine.addOutputRouter("t", o);
        engine.addOutputRouter("t2", o2);
        String result = "";
          String t = "";
        // Load the pricing rules

        engine.batch("tamplet/c.clp");
        engine.eval(s);
        engine.run();

        result = o.toString();
        t=o2.toString();
        System.out.println(t);
        engine.clear();
        if (result == null ? "" == null : result.equals("")) {
            result = "No headeche was diagnosed"
                    + " Please try again";
        }
       r obj=new r();
       obj.setS1(result);
       obj.setS2(t);

return obj;
    }
}
