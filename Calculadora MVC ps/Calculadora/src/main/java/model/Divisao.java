package model;

public class Divisao implements Operacao {
  public int calcular(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Divisão por zero não permitida.");
    }
    return a / b;
  }
}
