package calculadorafx.viewcontroller;

import calculadorafx.modelo.Calculadora;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author bruno
 */
public class FXMLDocumentController implements Initializable {

    private Calculadora calc;

//    @FXML
//    TextField txtResultado;
//    
//    @FXML
//    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
//    
//    @FXML
//    Button btnIgual, btnAC, btnDiv, btnPor, btnMenos, btnMas;
//    
//    @FXML
//    private void operando(MouseEvent evt){
//        Button btn = (Button)evt.getSource();
//        double operando = Double.parseDouble(btn.getText());
//        calc.cargarNumero(operando);
//        txtResultado.setText(String.valueOf(calc.getResultado()));
//    }
//    
//    @FXML
//    private void operador(MouseEvent evt){
//        Button btn = (Button)evt.getSource();
//        String op = btn.getText();
//        calc.operar(op);
//        txtResultado.setText(String.valueOf(calc.getResultado()));
//    }
//    
//    @FXML
//    private void limpiar(MouseEvent evt){
//        calc.limpiar();
//        txtResultado.setText(String.valueOf(calc.getResultado()));
//    }
//    
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        calc = new Calculadora();
//    }    
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnMas;
    @FXML
    private Button btn4;
    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn3;
    @FXML
    private Button btn2;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btn6;
    @FXML
    private Button btn5;
    @FXML
    private Button btnPor;
    @FXML
    private Button btnAC;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnDiv;
    
    @FXML
    private void operando(ActionEvent event) {
        Button btn = (Button) event.getSource();
        
        String s = txtResultado.getText() + btn.getText();
        
        calc.cargarNumero(btn.getText());
        txtResultado.setText("" + calc.getResultado());

    }

    @FXML
    private void operador(ActionEvent event) {
        Button btn = (Button) event.getSource();
        calc.operar(btn.getText());
        txtResultado.setText(String.valueOf(calc.getResultado()));
    }

    @FXML
    private void limpiar(ActionEvent event) {
        calc.limpiar();
        txtResultado.setText("0");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        calc = new Calculadora();
    }

}
