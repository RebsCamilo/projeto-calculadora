import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String op = " ";

        System.out.println("##### CALCULADORA #####\n");
        System.out.println("[+] Somar");
        System.out.println("[-] Subtrair");
        System.out.println("[x] Multiplicar");
        System.out.println("[/] Dividir");
        System.out.println("[0] Zerar Calculadora");
        System.out.println("[s] Sair");

        

        Calculadora calc = new Calculadora();
        
        while(op != "0") {
            if (calc.getResult() == 0.0) {
                calc.somar(scan.nextDouble());
                // System.out.println(calc.getResult());
            }
            op = scan.next();
            // System.out.println(op);
            
            Double resultAnterior = calc.getResult();
            Double n = scan.nextDouble();
            switch (op) {
                case "+":
                    calc.somar(n);
                    System.out.print(resultAnterior + " + " + n + " = " + calc.getResult());
                    clearBuffer(scan);
                    break;
                case "-":
                    calc.subtrair(n);
                    System.out.print(resultAnterior + " - " + n + " = " + calc.getResult());
                    clearBuffer(scan);
                    break;
                case "x":
                    calc.multiplicar(n);
                    System.out.print(resultAnterior + " x " + n + " = " + calc.getResult());
                    clearBuffer(scan);
                    break;
                case "/":
                    calc.dividir(n);
                    System.out.print(resultAnterior + " / " + n + " = " + calc.getResult());
                    clearBuffer(scan);
                    break;
                case "0":
                    clearBuffer(scan);
                    System.out.println(calc.getResult());
                    calc.zerar();
                    System.out.println(calc.getResult());
                    System.out.println("Calculadora zerada, reinicie seus cálculos");
                    break;
                case "s":
                    System.out.println("\nEncerrando programa\n");
                    op = "0";
                    break;
                default:
                    System.out.println("\nValor inválido\n");
                    break;
            }
        }        
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
