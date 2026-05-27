package models;

import java.util.Arrays;

public class Tournament {
  private String name;
  private Club[] clubs;

  public Tournament(String name, Club[] clubs) {
    this.name = name;
    this.clubs = clubs;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Club[] getClubs() {
    return clubs;
  }

  public void setClubs(Club[] clubs) {
    this.clubs = clubs;
  }

  @Override
  public String toString() {
    return "Tournament [name=" + name + ", clubs=" + Arrays.toString(clubs) + "]";
  }
  
  public int getTotalStarterPoints(){
    int n=0;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n;j++){
        int num= i + 1 ;
      }
    }
    return n;
  } 
    public void sortBubbleAvz(){
     int o=clubs .length;
      for(int i=0;i<o-1;i++){
       int num = i;
        for(int j=0;j<o;j++){
          if( clubs [num].getTotalStarterPoints){
            num=j-1;
          }
           clubs aux= clubs [num];
           clubs [num] = clubs [j];
           clubs [j] =aux;
        }
      } 
      return ;
    }
}
