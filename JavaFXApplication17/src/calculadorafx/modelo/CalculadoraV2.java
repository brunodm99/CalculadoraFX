 package calculadorafx.modelo;

/**
 *
 * @author bruno
 */
public class CalculadoraV2 {
    private String operando1;
    private String operando2;
    private String operador;
    
    private double res;
    
    public CalculadoraV2(){
        operando1 = "";
        operando2 = "";
        operador = "";
        
    }
     
    public void cargarNumero(String num){
        if(operador.equals("")){
            operando1 += num;
            res = Double.parseDouble(operando1);
        }else{
            operando2 += num;
            res = Double.parseDouble(operando2);

        }
        
    }
    
    public void operar(String operador){
        if( !operando1.equals("") && !operando2.equals("")){ //Si hay datos en los dos operandos opera
            switch(operador){
                case "+":
                    res = Double.parseDouble(operando1) + Double.parseDouble(operando2);
                    operando1 = String.valueOf(res);
                    this.operador = operador;
                    break;
                case "-":
                    res = Double.parseDouble(operando1) - Double.parseDouble(operando2);
                    operando1 = String.valueOf(res);
                    this.operador = operador;
                    break;
                case "*":
                    res = Double.parseDouble(operando1) * Double.parseDouble(operando2);
                    operando1 = String.valueOf(res);
                    this.operador = operador;
                    break;  
                case "/":
                    res = Double.parseDouble(operando1) / Double.parseDouble(operando2);
                    operando1 = String.valueOf(res);
                    this.operador = operador;
                    break;
                case "=":
                    switch(this.operador){
                        case "+": res = (Double.parseDouble(operando1) + Double.parseDouble(operando2)); break;
                        case "-": res = Double.parseDouble(operando1) - Double.parseDouble(operando2); break;
                        case "*": res = Double.parseDouble(operando1) * Double.parseDouble(operando2); break;
                        case "/": res = Double.parseDouble(operando1) / Double.parseDouble(operando2); break;
                    }
                    break;
            }
            
        }else{ //En caso de que haya 0 o 1 solo operando igualamos los operadores
            this.operador = operador; 
        }
        
    }
    
    public void limpiar(){
        operando1 = "";
        operando2 = "";
        operador = "";
        res = 0;
    }
    
    public double getResultado(){
        return res;
    }

}
