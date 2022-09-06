import java.util.HashMap;
import java.util.Map;

public enum EnumOperacoes {
    // ZERAR(0),
    SOMA(new SomaStrategy(), "+"),
    SUBTRACAO(new SubtracaoStrategy(), "-"),
    MULTIPLICACAO(new MultiplicacaoStrategy(), "*"),
    DIVISAO(new DivisaoStrategy(), "/");
    // SAIR(5);

    private StrategyCalculos strategy;
    private String simbolo;

    //Criar uma constante estática do tipo HashMap no enum onde a chave será uma String 
    //e o valor será o tipo do Enum.
    private static final Map<String, EnumOperacoes> getEnumOperacoesPorSimbolo = new HashMap<>();

    //Logo após, criaremos um inicializador estático, que será executado na primeira vez 
    //que a JVM carregar o enum. Neste bloco de código, iremos iterar sobre os valores 
    //do enum, populando a constante que criamos.
    static {
        for (EnumOperacoes eop : EnumOperacoes.values()) {
            getEnumOperacoesPorSimbolo.put(eop.getSimbolo(), eop);
        }
    }

    EnumOperacoes(StrategyCalculos strat, String simbol) {
        this.strategy = strat;
        this.simbolo = simbol;
    }

    public StrategyCalculos getStrategy() {
        return this.strategy;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public static EnumOperacoes getEnumOperacoesPorSimbolo(String simbolo) {
        return getEnumOperacoesPorSimbolo.get(simbolo);
    }


}
