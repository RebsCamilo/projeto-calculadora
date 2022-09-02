public class Calculadora {

    private Double result;

    public Calculadora() {
        result = 0.0;
        System.out.println("Calculadora iniciada");
    }

    public Double getResult() {
        return result;
    }

    public Double somar(Double n1) {
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
    } 

    public Double zerar() {
        return result = 0.0;
    } 

    
}
