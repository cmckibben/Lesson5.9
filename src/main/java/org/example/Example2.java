package org.example;

public class Example2 {
  public static void main(String[] args) {
    Pokemon charizard = new Pokemon(530,"Charizard");
    Pokemon salamance = new Pokemon(600,"Salamance");

    System.out.println(charizard.battle(salamance));
    System.out.println(salamance.battle(charizard));
    System.out.println(charizard.battle(charizard));
  }
}
