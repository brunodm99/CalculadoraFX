package calculadorafx.viewcontroller;

import calculadorafx.modelo.Calculadora;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class FXMLDocumentController implements Initializable {

    private Calculadora calc;

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

        try {
        calc.cargarNumero(btn.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No puedes introducir más de un punto.\nSe limpiará la memoria de la calculadora.", "Error", JOptionPane.ERROR_MESSAGE);
            calc.limpiar();
        }
        

        if(btn.getText().equals("0"))
            txtResultado.setText(txtResultado.getText() + "0");
        else
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
