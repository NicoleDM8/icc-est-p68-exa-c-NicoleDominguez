package Controllers;

public class TournamentController {
  public static sortBubbleAvz() {
    int o= .length;
    for(int i=0;i<n-1;i++){
      int num = i;
      for(int j=0;j<n;j++){
        if( tournaments [num].getTotalStarterPoints){
          num=j-1;
        }
        tournaments aux= tournaments [num];
        tournaments [num] = tournaments [j];
        tournaments [j] =aux;
      }
    }
    return o;
  }
  }
  
}
