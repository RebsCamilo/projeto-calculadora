public class Calculadora {

    // enum operacao {SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO}

    protected Double result;


    public Calculadora() {
        result = 0.0;
        System.out.println("Calculadora iniciada");
    }

    public Double getResult() {
        return result;
    }

    public Double calcular(StrategyCalculos strategy, Double numero) {
        return this.result = strategy.calcula(this.result, numero);
    }
    
    public Double zerar() {
        return this.result = 0.0;
    } 

/*     public Double somar(Double n1) {
        return result += n1;
    }

    public Double subtrair(Double n1) {
        return result -= n1;
    }

    public Double multiplicar(Double n1) {
        return result *= n1;
    }    

    public Double dividir(Double n1) {
        return result /= n1;
    }  */

    
}
