package models;

public class Athlete {
   private String Name;
   private int points;
   private boolean isStarter;
   
   public String getName() {
     return Name;
   }
   public void setName(String name) {
     Name = name;
   }
   public int getPoints() {
     return points;
   }
   public void setPoints(int points) {
     this.points = points;
   }
   public boolean isStarter() {
     return isStarter;
   }
   public void setStarter(boolean isStarter) {
     this.isStarter = isStarter;
   }
   public Athlete(String name, int points, boolean isStarter) {
    Name = name;
    this.points = points;
    this.isStarter = isStarter;
   }
   @Override
   public String toString() {
    return "Athlete [Name=" + Name + ", points=" + points + ", isStarter=" + isStarter + "]";
   }
   
}
