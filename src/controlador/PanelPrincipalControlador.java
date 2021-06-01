/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Jeronimo
 */
public class PanelPrincipalControlador implements Initializable {

    @FXML
    private MenuItem GestionarDisp;
    @FXML
    private MenuItem AccionDisp;
    @FXML
    private MenuItem AccionExterDisp;
    @FXML
    private MenuItem BitacoraReport;
    @FXML
    private MenuItem DisAsoUsuReport;
    @FXML
    private MenuItem BitacoraProgramReport;
    @FXML
    private MenuItem ReporteArchivo;
    @FXML
    private MenuItem GestionarUsu;
    @FXML
    private Pane contenedor;

    private Pane GestionarDis;

    private Pane AccionDis;

    private Pane AccionExDis;

    private Pane ReportBitacora;

    private Pane ReportDisAsoUsu;

    private Pane BitIngSistem;

    private Pane ReportArchDis;

    private Pane GestUsu;

    public PanelPrincipalControlador() throws IOException {
        this.GestionarDis = FXMLLoader.load(getClass().getResource("/vista/VistaPanelGestionar.fxml"));
        this.AccionDis = FXMLLoader.load(getClass().getResource("/vista/VistaAccionDispositivos.fxml"));
        this.AccionExDis = FXMLLoader.load(getClass().getResource("/vista/VistaAccionExDisp.fxml"));
        this.ReportBitacora = FXMLLoader.load(getClass().getResource("/vista/VistaBitacora.fxml"));
        this.ReportDisAsoUsu = FXMLLoader.load(getClass().getResource("/vista/VistaDisAsoUsu.fxml"));
        this.BitIngSistem = FXMLLoader.load(getClass().getResource("/vista/VistaBitaIngSistem.fxml"));
        this.ReportArchDis = FXMLLoader.load(getClass().getResource("/vista/VistaReportArchAlmaceDis.fxml"));
        this.GestUsu = FXMLLoader.load(getClass().getResource("/vista/VistaGestionarUsu.fxml"));
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void GestionarDisp_click(ActionEvent event) {
        contenedor.getChildren().remove(AccionDis);
        contenedor.getChildren().remove(AccionExDis);
        contenedor.getChildren().remove(ReportBitacora);
        contenedor.getChildren().remove(ReportDisAsoUsu);
        contenedor.getChildren().remove(BitIngSistem);
        contenedor.getChildren().remove(ReportArchDis);
        contenedor.getChildren().remove(GestUsu);
        contenedor.getChildren().add(GestionarDis);
    }

    @FXML
    private void AccionDisp_click(ActionEvent event) {
        contenedor.getChildren().remove(GestionarDis);
        contenedor.getChildren().remove(AccionExDis);
        contenedor.getChildren().remove(ReportBitacora);
        contenedor.getChildren().remove(ReportDisAsoUsu);
        contenedor.getChildren().remove(BitIngSistem);
        contenedor.getChildren().remove(ReportArchDis);
        contenedor.getChildren().remove(GestUsu);
        contenedor.getChildren().add(AccionDis);
    }

    @FXML
    private void AccionExterDisp_click(ActionEvent event) {
        contenedor.getChildren().remove(GestionarDis);
        contenedor.getChildren().remove(AccionDis);
        contenedor.getChildren().remove(ReportBitacora);
        contenedor.getChildren().remove(ReportDisAsoUsu);
        contenedor.getChildren().remove(BitIngSistem);
        contenedor.getChildren().remove(ReportArchDis);
        contenedor.getChildren().remove(GestUsu);
        contenedor.getChildren().add(AccionExDis);
    }

    @FXML
    private void BitacoraReport_click(ActionEvent event) {
        contenedor.getChildren().remove(GestionarDis);
        contenedor.getChildren().remove(AccionDis);
        contenedor.getChildren().remove(AccionExDis);
        contenedor.getChildren().remove(ReportDisAsoUsu);
        contenedor.getChildren().remove(BitIngSistem);
        contenedor.getChildren().remove(ReportArchDis);
        contenedor.getChildren().remove(GestUsu);
        contenedor.getChildren().add(ReportBitacora);
    }

    @FXML
    private void DisAsoUsuReport_click(ActionEvent event) {
        contenedor.getChildren().remove(GestionarDis);
        contenedor.getChildren().remove(AccionDis);
        contenedor.getChildren().remove(AccionExDis);
        contenedor.getChildren().remove(ReportBitacora);
        contenedor.getChildren().remove(BitIngSistem);
        contenedor.getChildren().remove(ReportArchDis);
        contenedor.getChildren().remove(GestUsu);
        contenedor.getChildren().add(ReportDisAsoUsu);
    }

    @FXML
    private void BitacoraProgramReport_click(ActionEvent event) {
        contenedor.getChildren().remove(GestionarDis);
        contenedor.getChildren().remove(AccionDis);
        contenedor.getChildren().remove(AccionExDis);
        contenedor.getChildren().remove(ReportBitacora);
        contenedor.getChildren().remove(ReportDisAsoUsu);
        contenedor.getChildren().remove(ReportArchDis);
        contenedor.getChildren().remove(GestUsu);
        contenedor.getChildren().add(BitIngSistem);
    }

    @FXML
    private void ReporteArchivo_click(ActionEvent event) {
        contenedor.getChildren().remove(GestionarDis);
        contenedor.getChildren().remove(AccionDis);
        contenedor.getChildren().remove(AccionExDis);
        contenedor.getChildren().remove(ReportBitacora);
        contenedor.getChildren().remove(ReportDisAsoUsu);
        contenedor.getChildren().remove(BitIngSistem);
        contenedor.getChildren().remove(GestUsu);
        contenedor.getChildren().add(ReportArchDis);
    }

    @FXML
    private void GestionarUsu_click(ActionEvent event) {
        contenedor.getChildren().remove(GestionarDis);
        contenedor.getChildren().remove(AccionDis);
        contenedor.getChildren().remove(AccionExDis);
        contenedor.getChildren().remove(ReportBitacora);
        contenedor.getChildren().remove(ReportDisAsoUsu);
        contenedor.getChildren().remove(BitIngSistem);
        contenedor.getChildren().remove(ReportArchDis);
        contenedor.getChildren().add(GestUsu);
    }

}
