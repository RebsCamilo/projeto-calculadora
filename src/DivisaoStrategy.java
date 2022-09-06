public class DivisaoStrategy extends Calculadora implements StrategyCalculos {

    @Override
    public Double calcula(Double n1, Double n2) {
        if (n2 == 0) {
            System.out.println("Não pode dividir o valor por 0");
            return n1;
        }
        return n1 /= n2;
    }
    
}

