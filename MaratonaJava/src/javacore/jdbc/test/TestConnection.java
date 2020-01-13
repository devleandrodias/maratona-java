package javacore.jdbc.test;

import javacore.jdbc.conn.ConexaoFactory;

/**
 * TestConnection
 */
public class TestConnection {

  public static void main(String[] args) {
    ConexaoFactory connection = new ConexaoFactory();

    connection.getConnection();
  }
}