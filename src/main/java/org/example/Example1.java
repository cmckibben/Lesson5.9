package org.example;

public class Example1 {
  public static void main(String[] args) {
    Pokemon poke = new Pokemon();
    System.out.println("Attack: " + poke.getAttack());
    System.out.println("Set attack to " + poke.setAttack(100));
    System.out.println("Attack: " + poke.getAttack());
  }
}
