import static algorea.Robot.*;
 class Main {
   public static void main (String[] args) {
   
      for(int i = 1 ; i <= 108 ; i = i + 1) {
         for(int j = 1 ; j <= 13 ; j = j + 1) {
            haut();
         }
         for(int j = 1 ; j <= 13 ; j = j + 1) {
            droite();
         }

         for(int j = 1 ; j <= 13 ; j = j + 1) {
            bas();
         }
         for(int j = 1 ; j <= 13 ; j = j + 1) {
            gauche();
         }
      }
   }
 }
