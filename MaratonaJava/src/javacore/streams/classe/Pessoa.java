package javacore.streams.classe;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Pessoa
 */
public class Pessoa {

  private String nome;
  private int idade;
  private double salario;

  public Pessoa(String nome, int idade, double salario) {
    this.nome = nome;
    this.idade = idade;
    this.salario = salario;
  }

  public static List<Pessoa> bancoDePessoas() {
    return asList(new Pessoa("Leandro Dias", 19, 2112.41), new Pessoa("Rhaira Gabrielle", 32, 1241.41),
        new Pessoa("Thaísa Castro", 11, 1452.41), new Pessoa("Leonardo Mendonça", 31, 1412.41),
        new Pessoa("Ana Beatriz", 14, 23461.41), new Pessoa("Beatriz Castro", 21, 543343.41));
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getSalario() {
    return this.salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}