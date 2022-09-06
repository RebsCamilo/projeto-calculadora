import java.util.HashMap;
import java.util.Map;

public enum EnumOperacoes {
    // ZERAR(0),
    SOMA(new SomaStrategy()),
    SUB(new SubtracaoStrategy()),
    MULT(new MultiplicacaoStrategy()),
    DIV(new DivisaoStrategy());
    // SAIR(5);

    private StrategyCalculos strategy;

    //Criar uma constante estática do tipo HashMap no enum onde a chave será uma String 
    //e o valor será o tipo do Enum.
    private static final Map<String, EnumOperacoes> EnumOperacoesPorValor = new HashMap<>();

    //Logo após, criaremos um inicializador estático, que será executado na primeira vez 
    //que a JVM carregar o enum. Neste bloco de código, iremos iterar sobre os valores 
    //do enum, populando a constante que criamos.
    // static {
    //     for (EnumOperacoes eo : EnumOperacoes.values()) {
    //         EnumOperacoesPorValor.put(eo.getStrategy(), eo);
    //     }
    // }

    EnumOperacoes(StrategyCalculos strat) {
        this.strategy = strat;
    }

    public StrategyCalculos getStrategy() {
        return this.strategy;
    }

    public static EnumOperacoes pegaEnumOperacoesPorValor(String valor) {
        return EnumOperacoesPorValor.get(valor);
    }

    // public Double calcula(Double result, Double numero) {
    //     return null;
    // }

}
