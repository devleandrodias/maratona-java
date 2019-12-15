package introducao.controles;

/**
 * OperadoresLogicos
 */
public class OperadoresLogicos {

  public static void main(String[] args) {
    boolean resposta = 10 > 5 && 10 < 20;
    int anos = 19;
    float salario = 2024.25f;
    boolean respostaPodeEntrar = anos > 20 || salario > 2000f;

    System.out.println("10 é maior que 5 e menor que 20?: " + resposta);
    System.out.println("Só pode entrar pessoas maiores que 20 anos ou sálário maior R$2000,00. Você pode entrar?: "
        + respostaPodeEntrar);
  }
}

// Opeadores lógios, (Tabela Verdade)
// && - E;
// || - OU;
// & - E a bit;
// || - OU a bit;