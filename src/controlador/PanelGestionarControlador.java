/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import static java.lang.Math.E;
import java.net.URL;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import modelo.Dispositivos;
import modelo.ListaSimplementeEnlazada;

/**
 * FXML Controller class
 *
 * @author Jeronimo
 */
public class PanelGestionarControlador implements Initializable {

    @FXML
    private Button BtnCrearDis;
    @FXML
    private TableView<Dispositivos> tblDispositivo;
    @FXML
    private TableColumn colIdent;
    @FXML
    private TableColumn colTipo;
    @FXML
    private TableColumn ColNombre;
    @FXML
    private TableColumn ColCorreo;
    @FXML
    private TableColumn ColEstado;

    private ObservableList<Dispositivos> dispositivo;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificarDis;
    @FXML
    private Button btnCargMasivDis;
    @FXML
    private Button btnCargaMasAdmin;
    @FXML
    private Button btnDatosNodo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dispositivo = FXCollections.observableArrayList();
        this.tblDispositivo.setItems(dispositivo);
        this.colIdent.setCellValueFactory(new PropertyValueFactory("Identificador"));
        this.colTipo.setCellValueFactory(new PropertyValueFactory("Tipo"));
        this.ColNombre.setCellValueFactory(new PropertyValueFactory("Nombre"));
        this.ColCorreo.setCellValueFactory(new PropertyValueFactory("Correo Electronico"));
        this.ColEstado.setCellValueFactory(new PropertyValueFactory("Estado"));

        // TODO
    }

    @FXML
    private void BtnCrearDis_click(ActionEvent event) {
        try {
//            Parent root = FXMLLoader.load(getClass().getResource("/vista/CrearDispositivoVista.fxml"));
//            Scene scene = new Scene(root);
//            Stage newStage = new Stage();
//            newStage.setScene(scene);
//            newStage.show();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CrearDispositivoVista.fxml"));
            Parent root = loader.load();
            CrearDispositivoControlador controlador = loader.getController();
            controlador.iniciarAt(dispositivo);
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

            Dispositivos p = controlador.getDispositivo();
            if (p != null) {
                this.dispositivo.add(p);
                this.tblDispositivo.refresh();

            }

        } catch (IOException ex) {
            Logger.getLogger(PanelGestionarControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void btnEliminar_click(ActionEvent event) {
        Dispositivos dis = this.tblDispositivo.getSelectionModel().getSelectedItem();
        if (dis == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Selecciones un dispositivo");
            alert.showAndWait();
        } else {
            this.dispositivo.remove(dis);
            this.tblDispositivo.refresh();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Informacion");
            alert.setContentText("Se a eliminado el dispositivo");
            alert.showAndWait();
        }

    }

    @FXML
    private void btnModificarDis_click(ActionEvent event) throws IOException {
        Dispositivos disp = this.tblDispositivo.getSelectionModel().getSelectedItem();
        if (disp == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Selecciones un dispositivo");
            alert.showAndWait();
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/ModificarDispVista.fxml"));
            Parent root = loader.load();
//            CrearDispositivoControlador controlador = loader.getController();
//            controlador.iniciarAt(dispositivo, disp);
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

            

        }

    }

    @FXML
    private void btnCargMasivDis_click(ActionEvent event) {
    }

    @FXML
    private void btnCargaMasAdmin_click(ActionEvent event) {
    }
    

    @FXML
    private void btnDatosNodo_click(ActionEvent event) {
        
        
    }
   
    

}
