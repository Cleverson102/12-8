import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    System.out.print("O número digitado foi:");
    System.out.println(numero);

    if (numero > 0) {
      System.out.println("Esse é um número positivo.");
    }
    if (numero < 0) {
      System.out.println("Esse é um número negativo.");
    }
    if (numero == 0) {
      System.out.println("O número é nulo.");
    }

    sc.close();

  }

}