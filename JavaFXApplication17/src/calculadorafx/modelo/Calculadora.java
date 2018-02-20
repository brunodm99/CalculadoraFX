package calculadorafx.modelo;

/**
 *
 * @author bruno
 */
public class Calculadora {

    private double[] nums;
    private String temp = "";
    private String operador;
    private double res;
    private int i;

    public Calculadora() {
        nums = new double[2];
        res = 0;
        i = 0;
    }

    public void cargarNumero(double numero) {
        //temp += numero;
        nums[i] = numero;
        res = numero;
        i++;
    }

    public void operar(String operador) {
        if (i == 2) {
            switch (this.operador) {
                case "+":
                    res = nums[0] + nums[1];
                    nums[0] = res;
                    this.operador = operador;
                    i--;
                    break;
                case "-":
                    res = nums[0] - nums[1];
                    nums[0] = res;
                    this.operador = operador;
                    i--;
                    break;
                case "*":
                    res = nums[0] * nums[1];
                    nums[0] = res;
                    this.operador = operador;
                    i--;
                    break;
                case "/":
                    res = nums[0] / nums[1];
                    nums[0] = res;
                    this.operador = operador;
                    i--;
                    break;
            }
        } else {
            this.operador = operador;
        }

        if (operador.equals("=")) {
            switch (this.operador) {
                case "+":
                    res = nums[0] + nums[1];
                    break;
                case "-":
                    res = nums[0] - nums[1];
                    break;
                case "*":
                    res = nums[0] * nums[1];
                    break;
                case "/":
                    res = nums[0] / nums[1];
                    break;
            }
            limpiar();
        }
    }

    public double getResultado() {
        return res;
    }

    public void limpiar() {
        nums = new double[2];
        operador = "";
        i = 0;
        temp="";
    }

}
