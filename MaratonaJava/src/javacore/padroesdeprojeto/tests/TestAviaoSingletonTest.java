package javacore.padroesdeprojeto.tests;

import javacore.padroesdeprojeto.enums.AviaoSingletonEnum;

/**
 * TestAviaoSingletonTest
 */
public class TestAviaoSingletonTest {

  public static void main(String[] args) {
    // TreadSave e não pode alterar usando Reflex
    AviaoSingletonEnum.agendarAssento("1A");
    AviaoSingletonEnum.agendarAssento("1B");
  }
}