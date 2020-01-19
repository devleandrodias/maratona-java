package javacore.defaults.classes;

import javacore.defaults.interfaces.MyList;

/**
 * InterfaceTest
 */
public class InterfaceTest implements MyList {

  public static void main(String[] args) {
    MyList.sort();

    // Isso é um método (remove)
    new InterfaceTest().remove();
  }

  @Override
  public void add() {

  }
}