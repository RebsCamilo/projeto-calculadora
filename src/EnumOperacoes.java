import java.util.HashMap;
import java.util.Map;

public enum EnumOperacoes {
    ZERAR(0),
    SOMA(1),
    SUBTRACAO(2),
    MULTIPLICACAO(3),
    DIVISAO(4),
    SAIR(5);

    private Integer operacao;

    //Criar uma constante estática do tipo HashMap no enum onde a chave será uma String 
    //e o valor será o tipo do Enum.
    private static final Map<String, EnumOperacoes> EnumOperacoesPorValor = new HashMap<>();

    //Logo após, criaremos um inicializador estático, que será executado na primeira vez 
    //que a JVM carregar o enum. Neste bloco de código, iremos iterar sobre os valores 
    //do enum, populando a constante que criamos.
    static {
        for (EnumOperacoes eo : EnumOperacoes.values()) {
            EnumOperacoesPorValor.put(eo.getOperacao(), eo);
        }
    }

    EnumOperacoes(Integer valor) {
        this.operacao = valor;
    }

    public Integer getOperacao() {
        return operacao;
    }

    public static EnumOperacoes pegaEnumOperacoesPorValor(String valor) {
        return EnumOperacoesPorValor.get(valor);
    }

}
