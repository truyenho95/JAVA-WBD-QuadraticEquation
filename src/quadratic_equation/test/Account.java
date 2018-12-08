package quadratic_equation.test;

import quadratic_equation.model.QuadraticEquation;

import java.util.Scanner;

public class Account {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Phương trình bậc 2 có dạng: a*x^2 + b*x + c = 0");
    System.out.println("Mời nhập a: ");
    double a = scanner.nextInt();
    System.out.println("Mời nhập b: ");
    double b = scanner.nextInt();
    System.out.println("Mời nhập c: ");
    double c = scanner.nextInt();

    QuadraticEquation userQuadraticEquation = new QuadraticEquation(a,b,c);
    double delta = userQuadraticEquation.getDiscriminant();
    if (delta > 0) {
      System.out.printf("The equation has two roots: %.2f and %.2f", userQuadraticEquation.getRoot1(), userQuadraticEquation.getRoot2());
    } else if (delta == 0) {
      System.out.printf("The equation has one roots: %.2f", userQuadraticEquation.getRoot1());
    } else {
      System.out.println("The equation has no roots");
    }
  }
}
