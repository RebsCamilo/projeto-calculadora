import java.util.Scanner;

public class AppCalculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        menu();

        Calculadora calc = new Calculadora();
        
        String operacao = "0";
        while (operacao != "S") {

            //Capturar do user algo que indique minha strategy
            System.out.print("Digite a operação: ");
            operacao = scan.next().toUpperCase();
            if (operacao.equals("0")) {
                calc.zerar();
            } else if (operacao.equals("S")) {
                operacao = "S";
                System.out.println("Fim do programa");
                scan.close();
                System.exit(0);
            } else {
                EnumOperacoes strategy = EnumOperacoes.getEnumOperacoesPorSimbolo(operacao);
                System.out.print("Digite o valor: ");
                calc.calcular(strategy, Double.parseDouble(scan.next()));
            }        

            System.out.println("Resultado = " + calc.result);
            
        }

    }

    private static void menu() {
        System.out.println("##### CALCULADORA #####");
        System.out.println("[0] Zerar Calculadora");
        System.out.println("[+] Somar");
        System.out.println("[-] Subtrair");
        System.out.println("[*] Multiplicar");
        System.out.println("[/] Dividir");
        System.out.println("[S] Sair");
    }

}
