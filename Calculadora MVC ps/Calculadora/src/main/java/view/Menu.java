package view;
import java.util.Scanner;
import controller.Controlador;

public class Menu {
  public void exibir() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a operação (soma, subtracao, multiplicacao, divisao):");
    String operacao = sc.nextLine().toLowerCase();

    System.out.println("Digite o primeiro valor:");
    int a = sc.nextInt();

    System.out.println("Digite o segundo valor:");
    int b = sc.nextInt();

    Controlador control = new Controlador();

    try {
      int resultado = control.calcular(operacao, a, b);
      System.out.println("Resultado: " + resultado);
    } catch (IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Erro inesperado: " + e.getMessage());
    }

    sc.close();
  }
}
