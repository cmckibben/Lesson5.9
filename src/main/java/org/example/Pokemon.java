package org.example;

public class Pokemon {
    private int attack = 10;
    private String name;

    public Pokemon(int attack, String name) {
      this.attack = attack;
      this.name = name;
    }
    public Pokemon() {

    }

    public String battle(Pokemon poke) {
      if(this.getAttack() > poke.getAttack())
        return "" + this.getName() + " wins";
      else
        return "" + poke.getName() + " wins";
    }

    public String getName() {
      return name;
    }
    public int setAttack(int attack) {
        this.attack = attack;
        return this.attack;
    }
    public int getAttack() {
      return attack;
    }
}
