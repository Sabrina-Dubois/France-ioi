import static algorea.Robot.*;

class Main {
   public static void main(String[] args) {
      for(int i = 1 ; i <= 20 ; i = i + 1) {
         ramasser();
         for(int j = 1 ; j <= 15 ; j = j + 1) {
            droite();
         } 
         deposer();
         for(int j = 1 ; j <= 15 ; j = j + 1) {
            gauche();
         }
      }
   }
}
