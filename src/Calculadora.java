public class Calculadora {

    // enum operacao {SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO}

    protected Double result;


    public Calculadora() {
        result = 0.0;
    }

    public Double getResult() {
        return result;
    }

    public Double calcular(EnumOperacoes enumStrategy, Double numero) {
        return this.result = enumStrategy.getStrategy().calcula(this.result, numero);
    }
    
    public Double zerar() {
        System.out.println("Calculadora zerada");
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
