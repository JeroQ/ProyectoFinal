/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modelo.Comp_Portatil;
import modelo.Dispositivos;
import modelo.ListaSimplementeEnlazada;
import modelo.Smartphone;
import modelo.Smartwatch;
import modelo.Tablet;

/**
 * FXML Controller class
 *
 * @author Jeronimo
 */
public class CrearDispositivoControlador implements Initializable {

    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnCancelar;
    @FXML
    private ComboBox<String> cbxListDisp;
    @FXML
    private Pane dispositivoPanel;
    @FXML
    private Pane AuricularesPanel;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtNombre;
    @FXML
    private CheckBox checkBoxVisible;
    @FXML
    private CheckBox checkBoxEnsendido;

    private Dispositivos dispos;

    private ObservableList<Dispositivos> dispositivo;
    @FXML
    private Pane SmartphonePanel;
    @FXML
    private TextField txtNomAuriculares;
    @FXML
    private ListView<?> lstvDispositivosSincro;
    @FXML
    private TextField txtCorreoSmartPhone;
    @FXML
    private TextField txtNombreSmarphone;
    @FXML
    private CheckBox checkBoxVisiblecel;
    @FXML
    private CheckBox checkBoxEnsendidocel;
    @FXML
    private TextField txtNumTelSmartphone;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> listaDis = FXCollections.observableArrayList("Computadora Portatil", "Tablet", "Smartwatch", "Smartphone", "Auriculares inalámbricos");
        cbxListDisp.setItems(listaDis);
        // TODO
    }

    public void iniciarAt(ObservableList<Dispositivos> dispositivo, Dispositivos disp) {
        this.dispositivo = dispositivo;
        this.dispos = disp;
        this.txtNombre.setText(disp.getNombre());
        this.txtCorreo.setText(disp.getCorreo());

    }

    public void iniciarAt(ObservableList<Dispositivos> dispositivo) {
        this.dispositivo = dispositivo;

    }

    public String estado(boolean estado) {
        String estado1 = "Encendido";
        if (estado == false) {
            return estado1 = "Apagado";
        }

        return estado1;
    }

    @FXML
    private void btnGuardar_click(ActionEvent event) {
        String tipo = this.cbxListDisp.getSelectionModel().getSelectedItem();
        String nombre = this.txtNombre.getText();
        String correo = this.txtCorreo.getText();
        String nombreCel = this.txtNombreSmarphone.getText();
        String correoCel = this.txtCorreoSmartPhone.getText();
        String nomAuri = this.txtNomAuriculares.getText();
        boolean estado = this.checkBoxEnsendido.isSelected();
        boolean visible = this.checkBoxVisible.isSelected();
//        int numcel = Integer.parseInt(this.txtNumTelSmartphone.getText());
//        String numtel = Integer.parseInt(this.txtCorreoSmartPhone.getText());
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();
        String compu = "Computadora Portatil";
        String tablet = "Tablet";
        String smartw = "Smartwatch";
        String smartp = "Smartphone";
        String auri = "Auriculares inalámbricos";

        if (compu.equals(this.cbxListDisp.getSelectionModel().getSelectedItem())) {
            Dispositivos dis = new Comp_Portatil(tipo, nombre, correo, estado, visible);
            lista.insertarInicio(dis);

            if (!dispositivo.contains(dis)) {
                this.dispos = dis;
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText(null);
                alert.setTitle("Confirmación");
                alert.setContentText("Se ha añadido correctamente");
                alert.showAndWait();
                Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
                stage.close();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Dispositivo ya existe");
                alert.showAndWait();
                Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
                stage.close();

            }
        }
        if (tablet.equals(this.cbxListDisp.getSelectionModel().getSelectedItem())) {
            Dispositivos dis = new Tablet(tipo, nombre, correo, estado, visible);

            if (!dispositivo.contains(dis)) {
                this.dispos = dis;
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText(null);
                alert.setTitle("Confirmación");
                alert.setContentText("Se ha añadido correctamente");
                alert.showAndWait();
                Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
                stage.close();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Dispositivo ya existe");
                alert.showAndWait();
                Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
                stage.close();

            }
        }
        if (smartw.equals(this.cbxListDisp.getSelectionModel().getSelectedItem())) {
            Dispositivos dis = new Smartwatch(tipo, nombre, correo, estado, visible);
            if (!dispositivo.contains(dis)) {
                this.dispos = dis;
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText(null);
                alert.setTitle("Confirmación");
                alert.setContentText("Se ha añadido correctamente");
                alert.showAndWait();
                Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
                stage.close();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Dispositivo ya existe");
                alert.showAndWait();
                Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
                stage.close();

            }
        }
        if (smartp.equals(this.cbxListDisp.getSelectionModel().getSelectedItem())) {
            Dispositivos dis = new Smartphone(tipo, nombreCel, correoCel, Integer.parseInt(this.txtNumTelSmartphone.getText()), estado, visible);
            if (!dispositivo.contains(dis)) {
                this.dispos = dis;
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText(null);
                alert.setTitle("Confirmación");
                alert.setContentText("Se ha añadido correctamente");
                alert.showAndWait();
                Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
                stage.close();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Dispositivo ya existe");
                alert.showAndWait();
                Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
                stage.close();

            }
        }

    }

    @FXML
    private void btnCancelar_click(ActionEvent event) {
        this.dispos = null;
        Stage stage = (Stage) this.btnCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void cbxListDisp_Select(ActionEvent event) {

        if (cbxListDisp.getValue().equals("Computadora Portatil")) {
            SmartphonePanel.setVisible(false);
            AuricularesPanel.setVisible(false);
            dispositivoPanel.setVisible(true);
        } else if (cbxListDisp.getValue().equals("Tablet")) {
            SmartphonePanel.setVisible(false);
            AuricularesPanel.setVisible(false);
            dispositivoPanel.setVisible(true);
        } else if (cbxListDisp.getValue().equals("SmartWatch")) {
            SmartphonePanel.setVisible(false);
            AuricularesPanel.setVisible(false);
            dispositivoPanel.setVisible(true);

        } else if (cbxListDisp.getValue().equals("Smartphone")) {
            AuricularesPanel.setVisible(false);
            dispositivoPanel.setVisible(false);
            SmartphonePanel.setVisible(true);

        } else if (cbxListDisp.getValue().equals("Auriculares inalámbricos")) {
            dispositivoPanel.setVisible(false);
            SmartphonePanel.setVisible(false);
            AuricularesPanel.setVisible(true);

        }

        Object evt = event.getSource();
//        if (evt.equals(cbxListDisp)){
//            this.
//        }

    }

    public Dispositivos getDispositivo() {
        return dispos;
    }

}
