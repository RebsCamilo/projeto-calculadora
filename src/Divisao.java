public class Divisao extends Calculadora implements strategyCalculos {

    @Override
    public Double calcula(Double numero) {
        if (numero == 0) {
            System.out.println("Não pode dividir o valor por 0");
            return null;
        }
        return super.result /= numero;
    }
    
}

