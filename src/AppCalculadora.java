import java.util.Scanner;

public class AppCalculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        menu();

        Calculadora calc = new Calculadora();
        
        String operacao = "0";
        while (operacao != "S") {

            //Capturar do user algo que indique minha strategy
            System.out.println("Digite a operação");
            operacao = scan.next().toUpperCase();
            if (operacao.equals("0")) {
                calc.zerar();
                System.out.println("Novo valor: " + calc.result);
                continue;
            } else if (operacao.equals("S")) {
                operacao = "S";
                System.exit(0);
                break;
            } else {
                EnumOperacoes strategy = EnumOperacoes.getEnumOperacoesPorSimbolo(operacao);
                System.out.println("Digite o valor");
                calc.calcular(strategy, Double.parseDouble(scan.next()));
            }
            // StrategyCalculos strategy = scan.next();            

            System.out.println(calc.result);

            
        }

        /* Calculadora calc = new Soma();
        Calculadora calc = new Calculadora();

        EnumOperacoes ep = EnumOperacoes.pegaEnumOperacoesPorValor("+");

        EnumOperacoes ep2 = EnumOperacoes.SOMA;

        System.out.println(ep);
        System.out.println(ep2.getOperacao());

        System.out.println(EnumOperacoes.values()); */

        
/*         while(continua != "N") {
            if (calc.getResult() == 0.0) {
                System.out.println("Digite o primeiro número: ");
                // calc.somar(scan.nextDouble());
                // System.out.println(calc.getResult());
            }

            EnumOperacoes op = EnumOperacoes.pegaEnumOperacoesPorValor(scan.next().toUpperCase());
            
            Double resultAnterior = calc.getResult();
            Double n = scan.nextDouble(); */


/* 
            switch (op) {
                case SOMA:
                    calc.somar(n);
                    System.out.print(resultAnterior + " + " + n + " = " + calc.getResult());
                    clearBuffer(scan);
                    break;
                case SUBTRACAO:
                    calc.subtrair(n);
                    System.out.print(resultAnterior + " - " + n + " = " + calc.getResult());
                    // clearBuffer(scan);
                    break;
                case MULTIPLICACAO:
                    calc.multiplicar(n);
                    System.out.print(resultAnterior + " x " + n + " = " + calc.getResult());
                    // clearBuffer(scan);
                    break;
                case DIVISAO:
                    calc.dividir(n);
                    System.out.print(resultAnterior + " / " + n + " = " + calc.getResult());
                    // clearBuffer(scan);
                    break;
                case ZERAR:
                    // clearBuffer(scan);
                    calc.zerar();
                    System.out.println("Calculadora zerada, reinicie seus cálculos");
                    break;
                case SAIR:
                    System.out.println("\nEncerrando programa\n");
                    continua = "N";
                    break;
                default:
                    System.out.println("\nValor inválido\n");
                    break;
            } 
             */
        // }        
    
    }

    private static void menu() {
        System.out.println("##### CALCULADORA #####");
        System.out.println("[0] Zerar Calculadora");
        System.out.println("[SOMA] Somar");
        System.out.println("[SUB] Subtrair");
        System.out.println("[MULT] Multiplicar");
        System.out.println("[DIV] Dividir");
        System.out.println("[S] Sair");
    }

/*     private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNext()) {
            scanner.nextDouble();
        }
    } */

}
