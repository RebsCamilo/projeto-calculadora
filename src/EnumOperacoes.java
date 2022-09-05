import java.util.HashMap;
import java.util.Map;

public enum EnumOperacoes {
    SOMA("+"),
    SUBTRACAO("-"),
    MULTIPLICACAO("*"),
    DIVISAO("/"),
    ZERAR("0"),
    SAIR("S");

    private String operacao;

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

    EnumOperacoes(String valor) {
        this.operacao = valor;
    }

    public String getOperacao() {
        return operacao;
    }

    public static EnumOperacoes pegaEnumOperacoesPorValor(String valor) {
        return EnumOperacoesPorValor.get(valor);
    }

}
