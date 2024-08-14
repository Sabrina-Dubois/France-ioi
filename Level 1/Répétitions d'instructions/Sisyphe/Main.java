import static algorea.Robot.*;
class Main {
   public static void main (String [] args) {
      for(int i = 1; i <= 21 ; i = i + 1){
      haut();
      droite();
      }
       for(int i = 1; i <= 21 ; i = i + 1){
      gauche();
      bas();
      }
   }
}