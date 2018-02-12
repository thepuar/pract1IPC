/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author frapecha
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Button bt_C;
    @FXML
    private Button bt_7;
    @FXML
    private Button bt_4;
    @FXML
    private Button bt_1;
    @FXML
    private Button bt_0;
    @FXML
    private Button bt_8;
    @FXML
    private Button bt_div;
    @FXML
    private Button bt_mult;
    @FXML
    private Button bt_5;
    @FXML
    private Button bt_2;
    @FXML
    private Button bt_9;
    @FXML
    private Button bt_6;
    @FXML
    private Button bt_3;
    @FXML
    private Button bt_dot;
    @FXML
    private Button bt_minus;
    @FXML
    private Button bt_add;
    @FXML
    private Button bt_equals;
    @FXML
    private TextField text_field;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void pulsadoNumero(ActionEvent event) {
        String numero = ((Button) event.getSource()).getText();
        if (this.text_field.getText().length() == 0 || this.text_field.getText().equals("0")|| this.text_field.getText().equals("0.0")) {
            this.text_field.setText(numero);
        } else {
            this.text_field.setText(this.text_field.getText() + numero);
        }
    }

    @FXML
    private void pulsandoC(ActionEvent event) {
        this.text_field.setText("0");
    }
    
    //Tambien contempla el punto
     @FXML
    private void pulsandoOperador(ActionEvent event) {
        this.text_field.setText(this.text_field.getText()+(((Button)event.getSource()).getText()));
    }
    
      @FXML
    private void pulsandoDot(ActionEvent event) {
         this.text_field.setText(this.text_field.getText()+".");
    }

  
    @FXML
    private void pulsandoEquals(ActionEvent event) {
        String cadena = this.text_field.getText();
        String[] valores;
        valores = cadena.split("\\D");
        String operador[] = cadena.split("\\d?\\d");
        double valor1 = 0;
        double valor2 = 0;
        if(valores.length>1){
         valor1 = Double.parseDouble(valores[0]);
         valor2 = Double.parseDouble(valores[1]);
        }
        double resultado = 0;
        if(operador.length!=0)
        switch (operador[operador.length - 1]) {
            case "+":
                resultado = valor1 + valor2;
                 this.text_field.setText(resultado + "");
                break;
            case "-":
                resultado = valor1 - valor2;
                 this.text_field.setText(resultado + "");
                break;
            case "/":
                resultado = valor1 / valor2;
                 this.text_field.setText(resultado + "");
                break;
            case "X":
                resultado = valor1 * valor2;
                 this.text_field.setText(resultado + "");
                break;
            default :
               
                break;

        }

      

    }

  

   

}
