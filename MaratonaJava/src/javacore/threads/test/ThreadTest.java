package javacore.threads.test;

/**
 * Dois tipos de threads
 * 
 * Deamon x User
 * 
 * Uma JVM só finaliza sua execução quando todas as threads User forem
 * finalizadas
 */
public class ThreadTest {
  public static void main(String[] args) {
    System.out.println("Thread executada: " + Thread.currentThread().getName());
    ThreadExamplo t1 = new ThreadExamplo('A');
    ThreadExamplo t2 = new ThreadExamplo('B');
    ThreadExamplo t3 = new ThreadExamplo('C');
    ThreadExamplo t4 = new ThreadExamplo('D');
    ThreadExamplo t5 = new ThreadExamplo('E');

    // t1.run(); Executa o método que roda na thread main
    // t1.start(); Executa uma thread

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    Thread tn1 = new Thread(new ThreadExamploRunnable('A'));
    Thread tn2 = new Thread(new ThreadExamploRunnable('B'));
    Thread tn3 = new Thread(new ThreadExamploRunnable('C'));
    Thread tn4 = new Thread(new ThreadExamploRunnable('D'));
    Thread tn5 = new Thread(new ThreadExamploRunnable('E'));

    tn1.start();
    tn2.start();
    tn3.start();
    tn4.start();
    tn5.start();
  }
}

class ThreadExamplo extends Thread {
  private char c;

  public ThreadExamplo(char c) {
    this.c = c;
  }

  // Aqui onde tudo acontece
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < 1000; i++) {
      System.out.print(c);
      if (i % 100 == 0) {
        System.out.println(c);
      }
    }
  }
}

// Melhor opção seguindo orientação a objetos
class ThreadExamploRunnable implements Runnable {
  private char c;

  public ThreadExamploRunnable(char c) {
    this.c = c;
  }

  // Aqui onde tudo acontece
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < 1000; i++) {
      System.out.print(c);
      if (i % 100 == 0) {
        System.out.println(c);
      }
    }
  }
}