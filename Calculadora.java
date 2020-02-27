import java.util.Scanner;

class Calculadora {
  private static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem vindo à Calculadora.java!");
    System.out.println("Digite: 1 - Soma");
    int opr = scanner.nextInt();

    System.out.println("Insira o primeiro valor");
    int n1 = scanner.nextInt();

    System.out.println("Insira o segundo valor");
    int n2 = scanner.nextInt();

    switch (opr) {
      case 1:
        System.out.println("Soma: " + Calculadora.soma(n1, n2));
        break;
    }
  }

  public static int soma(int n1, int n2) {
    return n1 + n2;
  }
}