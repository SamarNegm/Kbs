/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_kbs;

import com.jfoenix.controls.JFXBadge;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jess.JessException;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class SearchController implements Initializable {

    @FXML
    JFXCheckBox ch1, ch2, ch3, ch4, ch5;
    @FXML
    JFXBadge s;
      @FXML
      JFXRadioButton c1,c2,c3,c4,c5;
    /**
     * Initializes the controller class.
     */
    public void submit(ActionEvent event) {

        String r1 = "(assert (Symptoms (One_sided_pain " + ch1.isSelected() + ")"
                + " (Blind_spots " + ch2.isSelected() + ")"
                + "(Sensation_of_tightness  " + ch3.isSelected() + ")"
                + "(Pain_that_throbs_or_pulses  " + ch4.isSelected() + ")"
                + "(Changes_in_vision  " + ch5.isSelected() + ")"
                + "(Pain_usually_on_one_side_of_your_head " + ch5.isSelected() + ")"
                + "))";
          String r2 = "(assert (Symptoms (30_to_90_minutes " + c1.isSelected() + ")"
                + " (4_hours_to_3_days " + c2.isSelected() + ")"
                + "(less_than_an_hour " + c3.isSelected() + ")"
                + "(30_min_to_week " + c4.isSelected() + ")"
                + "(3_months_without_shifting_sides_or_pain_free_periods " + c5.isSelected() + ")"
               
                + "))";
        //        String r2 = "(assert (Symptoms (Constipation " + jComboBox11.getSelectedItem() + ")"
        //                + "(Mood_changes_from_depression_to_euphoria " + jComboBox12.getSelectedItem() + ")"
        //                + "(Food_cravings " + jComboBox13.getSelectedItem() + ")"
        //                + "(Neck_stiffness " + jComboBox14.getSelectedItem() + ")"
        //                + "(Increased_thirst_and_urination " + jComboBox15.getSelectedItem() + ")"
        //                + "(Frequent_yawning " + jComboBox16.getSelectedItem() + ")"
        //                + "(Visual_phenomena " + jComboBox17.getSelectedItem() + ")"
        //                + "(Vision_loss " + jComboBox18.getSelectedItem() + ")"
        //                + "(Pins_and_needles_sensations_in_an_arm_or_leg " + jComboBox19.getSelectedItem() + ")"
        //                + "(Weakness_or_numbness " + jComboBox20.getSelectedItem() + ")"
        //                + "(Difficulty_speaking " + jComboBox21.getSelectedItem() + ")"
        //                + "(Hearing_noises_or_music " + jComboBox22.getSelectedItem() + ")"
        //                + "(jerking " + jComboBox23.getSelectedItem() + ")"
        //                + "(Pain_usually_on_one_side_of_your_head " + jComboBox24.getSelectedItem() + ")"
        //                + "( Pain_that_throbs_or_pulses " + jComboBox25.getSelectedItem() + ")"
        //                + "(Sensitivity_to_light_sound_and_sometimes_smell_and_touch " + jComboBox26.getSelectedItem() + ")"
        //                + "(Nausea_and_vomiting " + jComboBox27.getSelectedItem() + ")"
        //                + "))";
        //        String r3 = "(assert (Symptoms (Blind_spots " + jComboBox28.getSelectedItem() + ")"
        //                + "(Zigzag_lines  " + jComboBox29.getSelectedItem() + ")"
        //                + "(Shimmering_spots " + jComboBox30.getSelectedItem() + ")"
        //                   + "(Changes_in_vision " + jComboBox31.getSelectedItem() + ")"
        //                    + "(Flashes_of_light " + jComboBox32.getSelectedItem() + ")"
        //                    + "(Numbness " + jComboBox33.getSelectedItem() + ")"
        //                    + "(Speech_or_language_difficulty " + jComboBox34.getSelectedItem() + ")"
        //                    + "(Muscle_weakness " + jComboBox35.getSelectedItem() + ")"
        //                + "))";
        //        ;
        //            String r4 = "(assert (Symptoms (Dull_ching_head_pain " + jComboBox41.getSelectedItem() + ")"
        //                + "(Sensation_of_tightness  " + jComboBox42.getSelectedItem() + ")"
        //                + "(pressure_across_your_forehead " + jComboBox43.getSelectedItem() + ")"
        //                   + "(on_the_sides_and_back_of_your_head " + jComboBox44.getSelectedItem() + ")"
        //                    + "(Tenderness_on_your_scalp_neck_and_shoulder_muscles " + jComboBox45.getSelectedItem() + ")"
        //                
        //                + "))";
        ;
         String result="";
         r obj=new r();
        try {
             obj = jess.queryInferenceEngine(r1+r2);
        } catch (JessException ex) {
            Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
               
            Stage s = (Stage) ch1.getScene().getWindow();
            s.close();
            
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("result.fxml"));
                        Parent p = loader.load();

                        Scene tableViewScene = new Scene(p);

                        //access the controller and call a method
                        ResultController controller = loader.getController();
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
            Stage s = (Stage) ch1.getScene().getWindow();
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
