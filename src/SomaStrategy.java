public class SomaStrategy implements StrategyCalculos {

    // public Double result = super.resultado;

    @Override
    public Double calcula(Double n1, Double n2) {
        System.out.println(n1 + " + " + n2);
        return n1 + n2;
    }
    
}
