package javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ConexaoFactory
 */
public class ConexaoFactory {

  public Connection getConnection() {
    String url = "jdbc:mysql://localhost:3306/agencia";
    String user = "root";
    String password = "@devLeandroLuizaLabs!#";

    try {
      Connection connection = DriverManager.getConnection(url, user, password);
      return connection;
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return null;
  }
}