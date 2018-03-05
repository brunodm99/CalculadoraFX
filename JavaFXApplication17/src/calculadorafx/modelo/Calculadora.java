package calculadorafx.modelo;
/**
 * @author Bruno DÃ­az MartÃ­n
 */
public class Calculadora {
    private String operando1;
    private String operando2;
    private String operador;
    private double resultado;
    private String ultimaOperacion;

    public Calculadora(){
        limpiar();
    }
    
    /**
     * Carga un numero al operando
     * @param numero El numero a cargar
     */
    public void cargarNumero(String numero){
        if(this.operador.equals("")){
            operando1 += numero;
            resultado = Double.parseDouble(operando1);
        }else{
            operando2 += numero;
            resultado = Double.parseDouble(operando2);
        }
    }

    private boolean hayOperacionPendiente(){
        return !ultimaOperacion.equals("");
    }

    private boolean hay2operandos(){
        return (!operando1.equals("") && !operando2.equals(""));
    }

    private void operaPendiente(){
        switch(ultimaOperacion){
            case "+":
                resultado = Double.parseDouble(operando1) + Double.parseDouble(operando2);
                operando1 = ""+resultado;
                operando2 = "";
                ultimaOperacion = "";
                break;
            case "-":
                resultado = Double.parseDouble(operando1) - Double.parseDouble(operando2);
                operando1 = ""+resultado;
                operando2 = "";
                ultimaOperacion = "";
                break;
            case "*":
                resultado = Double.parseDouble(operando1) * Double.parseDouble(operando2);
                operando1 = ""+resultado;
                operando2 = "";
                ultimaOperacion = "";
                break;
            case "/":
                resultado = Double.parseDouble(operando1) / Double.parseDouble(operando2);
                operando1 = ""+resultado;
                operando2 = "";
                ultimaOperacion = "";
                break;
        }
    }

    /**
     * Opera si hace falta
     * @param operador El operador
     */
    public void operar(String operador){
        if(hay2operandos()){
            if(hayOperacionPendiente()){
                operaPendiente();
                ultimaOperacion = operador;
            }
        }else{
            this.ultimaOperacion = operador;
            this.operador = operador;
        }
    }

    /**
     * limpia los datos en memoria
     */
    public final void limpiar(){
        operando1 = "";
        operando2 = "";
        operador = "";
        resultado = 0;
        ultimaOperacion = "";
    }

    /**
     * Devuelve el esultado de la operación
     * @return El resultado de la operación
     */
    public double getResultado(){
        return resultado;
    }
}

