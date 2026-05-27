package models;

import java.util.Arrays;

public class Club {
  private String Name;
  private Athlete[] athletes;
  
  public Club(String name, Athlete[] athletes) {
    Name = name;
    this.athletes = athletes;
  }
  public String getName() {
    return Name;
  }
  public void setName(String name) {
    Name = name;
  }
  public Athlete[] getAthletes() {
    return athletes;
  }
  public void setAthletes(Athlete[] athletes) {
    this.athletes = athletes;
  }
  @Override
  public String toString() {
    return "Club [Name=" + Name + ", athletes=" + Arrays.toString(athletes) + "]";
  }

  
  
}
