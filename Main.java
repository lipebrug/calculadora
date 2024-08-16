import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cu = 1;
        while (cu == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bem-vindo a CalcuLipe, a calculadora feita pelo Lipe!");
            System.out.println("Você precisa apenas digitar os dois números e, em seguida, a operação desejada.");
            System.out.println("Digite o primeiro número ");
            int fatA = scanner.nextInt();
            System.out.println("Digite o segundo número ");
            int fatB = scanner.nextInt();
            System.out.println("Digite a operação desejada: \n1: Soma.\n2: Subtracao\n3: Multiplicacao.\n4: Divisao (Cuidado! Não divida por zero, ou... nem queira saber!).\n5: Quero sair dessa calculadora imediatamente!");
            int uc = scanner.nextInt();
            Calculadora calc = new Calculadora();
            if (uc == 1) {
                calc.soma(fatA, fatB);
            }
            else if (uc == 2) {
                calc.sub(fatA, fatB);
            }
            else if (uc == 3) {
                calc.mult(fatA, fatB);
            }
            else if (uc == 4) {
                calc.div(fatA, fatB);
            }
            else if (uc == 5) {
                cu = 2;
            }
        }
    }
}
