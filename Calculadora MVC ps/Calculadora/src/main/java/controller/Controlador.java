package controller;
import model.Operacao;

public class Controlador {
  public int calcular(String operacao, int a, int b) throws Exception {
    String className = "model." + operacao.substring(0, 1).toUpperCase() + operacao.substring(1);
    Class<?> clazz = Class.forName(className);
    Operacao op = (Operacao) clazz.getDeclaredConstructor().newInstance();
    return op.calcular(a, b);
  }
}
