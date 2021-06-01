/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author Jeronimo
 */
public class LoginControlador implements Initializable {

    @FXML
    private TextField txtusuario;
    @FXML
    private PasswordField txtcontraseña;
    @FXML
    private Button btnlogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void eventokey(KeyEvent event) {
        Object evento = event.getSource();

        if (evento.equals(txtusuario)) {

            if (event.getCharacter().equals(" ")) {
                event.consume();
            }

        } else if (evento.equals(txtcontraseña)) {

            if (event.getCharacter().equals(" ")) {
                event.consume();
            }

        }
    }

    @FXML
    private void ingresar(ActionEvent event) {

        if (!txtcontraseña.getText().isEmpty() && !txtcontraseña.getText().isEmpty()) {
            String usuario = this.txtusuario.getText();
            String contraseña = this.txtcontraseña.getText();
            String usu = "admin";
            String contra = "admin";

            if (usuario.equals(usu) && contraseña.equals(contra)) {

                loadStage("/vista/VistaPanelPrincipal.fxml", event);

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Su usuario o contraseña es incorrecto");
                alert.showAndWait();
                txtusuario.setText("");
                txtcontraseña.setText("");

            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Campo Vacio");
            alert.setContentText("Campos Vacios");
            alert.showAndWait();
        }
    }

    private void loadStage(String url, Event event) {
        try {
            Object eventSource = event.getSource();
            Node sourceAsNode = (Node) eventSource;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window;
            stage.hide();

            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
