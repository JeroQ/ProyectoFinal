/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modelo.Dispositivos;

/**
 * FXML Controller class
 *
 * @author Jeronimo
 */
public class ModificarDispVistaController implements Initializable {

    @FXML
    private Pane panelEditar;
    @FXML
    private TextField txtNuevoCorreo;
    @FXML
    private TextField txtNuevoNombre;
    @FXML
    private CheckBox checkBoxVisible;
    @FXML
    private CheckBox checkBoxEnsendido;
    @FXML
    private Button btnGuardarModif;
    @FXML
    private Button btnCancelarmodif;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
  

    @FXML
    private void btnGuardarModif_click(ActionEvent event) {
    }

    @FXML
    private void btnCancelarmodif_click(ActionEvent event) {
//        this.dispos = null;
        Stage stage = (Stage) this.btnCancelarmodif.getScene().getWindow();
        stage.close();
    }
    
}
