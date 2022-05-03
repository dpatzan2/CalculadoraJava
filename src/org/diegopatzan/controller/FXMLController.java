package org.diegopatzan.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.diegopatzan.model.Division;
import org.diegopatzan.model.Multiplicacion;
import org.diegopatzan.model.Operaciones;
import org.diegopatzan.model.Porcentaje;
import org.diegopatzan.model.Resta;
import org.diegopatzan.model.Suma;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.diegopatzan.model.*;



/**
 * FXML Controller class
 *
 * @author Diego Fernando Patzán Marroquín
 */
public class FXMLController implements Initializable {
    private float resultado;
    private float numero;
    private int contadorOperadores = 0;
    private String operadorAnterior;
    private boolean ingresoNuevo = false;
    @FXML
    private Label lblMostrar;

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public int getContadorOperadores() {
        return contadorOperadores;
    }

    public void setContadorOperadores(int contadorOperadores) {
        this.contadorOperadores = contadorOperadores;
    }

    public String getOperadorAnterior() {
        return operadorAnterior;
    }

    public void setOperadorAnterior(String operadorAnterior) {
        this.operadorAnterior = operadorAnterior;
    }

    public boolean isIngresoNuevo() {
        return ingresoNuevo;
    }

    public void setIngresoNuevo(boolean ingresoNuevo) {
        this.ingresoNuevo = ingresoNuevo;
    }

    public Label getLblRegistro() {
        return lblRegistro;
    }

    public void setLblRegistro(Label lblRegistro) {
        this.lblRegistro = lblRegistro;
    }

    public Label getLblPantalla() {
        return lblPantalla;
    }

    public void setLblPantalla(Label lblPantalla) {
        this.lblPantalla = lblPantalla;
    }

    public Button getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(Button btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public Button getBtnNegativo() {
        return btnNegativo;
    }

    public void setBtnNegativo(Button btnNegativo) {
        this.btnNegativo = btnNegativo;
    }

    public Button getBtnPorcentaje() {
        return btnPorcentaje;
    }

    public void setBtnPorcentaje(Button btnPorcentaje) {
        this.btnPorcentaje = btnPorcentaje;
    }

    public Button getBtnDivision() {
        return btnDivision;
    }

    public void setBtnDivision(Button btnDivision) {
        this.btnDivision = btnDivision;
    }

    public Button getBtnSiete() {
        return btnSiete;
    }

    public void setBtnSiete(Button btnSiete) {
        this.btnSiete = btnSiete;
    }

    public Button getBtnOcho() {
        return btnOcho;
    }

    public void setBtnOcho(Button btnOcho) {
        this.btnOcho = btnOcho;
    }

    public Button getBtnNueve() {
        return btnNueve;
    }

    public void setBtnNueve(Button btnNueve) {
        this.btnNueve = btnNueve;
    }

    public Button getBtnMultiplicacion() {
        return btnMultiplicacion;
    }

    public void setBtnMultiplicacion(Button btnMultiplicacion) {
        this.btnMultiplicacion = btnMultiplicacion;
    }

    public Button getBtnCuatro() {
        return btnCuatro;
    }

    public void setBtnCuatro(Button btnCuatro) {
        this.btnCuatro = btnCuatro;
    }

    public Button getBtnCinco() {
        return btnCinco;
    }

    public void setBtnCinco(Button btnCinco) {
        this.btnCinco = btnCinco;
    }

    public Button getBtnSeis() {
        return btnSeis;
    }

    public void setBtnSeis(Button btnSeis) {
        this.btnSeis = btnSeis;
    }

    public Button getBtnMenos() {
        return btnMenos;
    }

    public void setBtnMenos(Button btnMenos) {
        this.btnMenos = btnMenos;
    }

    public Button getBtnUno() {
        return btnUno;
    }

    public void setBtnUno(Button btnUno) {
        this.btnUno = btnUno;
    }

    public Button getBtnDos() {
        return btnDos;
    }

    public void setBtnDos(Button btnDos) {
        this.btnDos = btnDos;
    }

    public Button getBtnTres() {
        return btnTres;
    }

    public void setBtnTres(Button btnTres) {
        this.btnTres = btnTres;
    }

    public Button getBtnMas() {
        return btnMas;
    }

    public void setBtnMas(Button btnMas) {
        this.btnMas = btnMas;
    }

    public Button getBtnCero() {
        return btnCero;
    }

    public void setBtnCero(Button btnCero) {
        this.btnCero = btnCero;
    }

    public Button getBtnPunto() {
        return btnPunto;
    }

    public void setBtnPunto(Button btnPunto) {
        this.btnPunto = btnPunto;
    }

    public Button getBtnIgual() {
        return btnIgual;
    }

    public void setBtnIgual(Button btnIgual) {
        this.btnIgual = btnIgual;
    }
    
    
    
    private Label lblRegistro; 
    @FXML
    private Label lblPantalla;
    @FXML
    private Button btnBorrar;
    @FXML
    private Button btnNegativo;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btnDivision;
    @FXML
    private Button btnSiete;
    @FXML
    private Button btnOcho;
    @FXML
    private Button btnNueve;
    @FXML
    private Button btnMultiplicacion;
    @FXML
    private Button btnCuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnUno;
    @FXML
    private Button btnDos;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnMas;
    @FXML
    private Button btnCero;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnIgual;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void clicBorrar(ActionEvent event) {
        Borrar();
    }

    @FXML
    private void clicNegativo(ActionEvent event) {
        float cambio;
        cambio = Float.parseFloat(lblPantalla.getText());
        lblPantalla.setText("");
        cambio = cambio * -1;
        lblPantalla.setText(Double.toString(cambio));
    }

    @FXML
    private void clicPorcentaje(ActionEvent event) {
        calcular("%");
    }

    @FXML
    private void clicDivision(ActionEvent event) {
        calcular("/");
    }

    @FXML
    private void clicSiete(ActionEvent event) {
        actualizarPantalla("7");
    }

    @FXML
    private void clicOcho(ActionEvent event) {
        actualizarPantalla("8");
    }

    @FXML
    private void clicNueve(ActionEvent event) {
        actualizarPantalla("9");
    }

    @FXML
    private void clicMultiplicacion(ActionEvent event) {
        calcular("*");
    }

    @FXML
    private void clicCuatro(ActionEvent event) {
        actualizarPantalla("4");
    }

    @FXML
    private void clicCinco(ActionEvent event) {
        actualizarPantalla("5");
    }

    @FXML
    private void clicSeis(ActionEvent event) {
        actualizarPantalla("6");
    }

    @FXML
    private void clicMenos(ActionEvent event) {
        calcular("-");
    }

    @FXML
    private void clicUno(ActionEvent event) {
        actualizarPantalla("1");
    }

    @FXML
    private void clicDos(ActionEvent event) {
        actualizarPantalla("2");
    }

    @FXML
    private void cliclTres(ActionEvent event) {
        actualizarPantalla("3");
    }

    @FXML
    private void clicMas(ActionEvent event) {
        calcular("+");
    }

    @FXML
    private void clicCero(ActionEvent event) {
        actualizarPantalla("0");
    }

    @FXML
    private void clicPunto(ActionEvent event) {
        if(ingresoNuevo){
            lblPantalla.setText("");
        }
        if(lblPantalla.getText().equals("")){
            actualizarPantalla("0.");
            ingresoNuevo = false;
        }else if(!(lblPantalla.getText().contains("."))){
            actualizarPantalla(".");
        }
    }

    @FXML
    private void clicIgual(ActionEvent event) {
        calcular(String.valueOf(this.operadorAnterior));
        lblPantalla.setText(String.valueOf(this.resultado));
    }
    public void actualizarPantalla(String digito){
        if(ingresoNuevo){
            lblPantalla.setText("");
        }
        
        lblPantalla.setText(lblPantalla.getText().concat(digito));
        ingresoNuevo = false;
    }
    
     private void calcular(String operador) {
        if(!(lblPantalla.getText().equals(""))){
            String strPantalla = lblPantalla.getText();
            
            if(ingresoNuevo == false){
                this.numero = Float.parseFloat(strPantalla);
                contadorOperadores++;
                
                if(contadorOperadores == 1){
                    this.resultado = numero;
                }else if(contadorOperadores >= 2){
                    Operaciones calc;
                    switch(this.operadorAnterior){
                        case "+":
                            calc =  new Suma();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            lblMostrar.setText(calc.toString());
                        break;
                        case "-":
                            calc = new Resta();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            lblMostrar.setText(calc.toString());
                        break;
                        case "*":
                            calc = new Multiplicacion();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            lblMostrar.setText(calc.toString());
                        break;
                        case "/":
                            calc = new Division();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            lblMostrar.setText(calc.toString());
                        break;
                        case "%":
                            calc = new Porcentaje();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            lblMostrar.setText(calc.toString());
                        break;
                    }
                    
                    lblPantalla.setText(String.valueOf(this.resultado));
                }
                
            }
            this.operadorAnterior = operador;
            
        }//fin
        ingresoNuevo = true;
     }
     public void Borrar(){
        lblPantalla.setText("");
        lblMostrar.setText("");
        resultado = 0.0f;
        numero = 0.0f;
        contadorOperadores = 0;
        operadorAnterior = " ";
        ingresoNuevo = false;
     }
  
     
}
