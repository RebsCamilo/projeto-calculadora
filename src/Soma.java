public class Soma extends Calculadora implements strategyCalculos {

    @Override
    public Double calcula(Double numero) {
        return super.result += numero;
    }
    
}