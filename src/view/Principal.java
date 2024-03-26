package view;

import model.Circulo;

public class Principal {
 public static void main(String[] args) {

     Circulo circulo1 = new Circulo(5);
     System.out.println("Círculo 1:");
     System.out.println("Raio: " + circulo1.getRaio());
     System.out.println("Perímetro: " + circulo1.getPerimetro());
     System.out.println("Área: " + circulo1.getArea());
     System.out.println("--------------------------------------------------------------------------------");

     Circulo circulo2 = new Circulo(10);
     System.out.println("\nCírculo 2:");
     System.out.println("Raio: " + circulo2.getRaio());
     System.out.println("Perímetro: " + circulo2.getPerimetro());
     System.out.println("Área: " + circulo2.getArea());
 }
}
