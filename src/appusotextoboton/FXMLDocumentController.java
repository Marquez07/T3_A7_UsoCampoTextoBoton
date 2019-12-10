/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import campotextoboton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author usuario
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private CampoTextoBoton campo1;
    @FXML
    private CampoTextoBoton campo2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        campo1.addEventHandler(EventType.ROOT, e->{
            if(e.getEventType().getName().equalsIgnoreCase("Action"))
                if(campo1.getText().equals(""))
                    label.setText("No se ha introducido ningun dato.");
                else
                    label.setText("Se ha grabado: " +campo1.getText());
        });
        
        campo2.addEventHandler(EventType.ROOT, e->{
            if(e.getEventType().getName().equalsIgnoreCase("Action"))
                if(campo2.getText().equals(""))
                    label.setText("No se ha introducido ningun dato.");
                else
                    label.setText("Se ha grabado: " +campo2.getText());
        });
    }    
    
}
