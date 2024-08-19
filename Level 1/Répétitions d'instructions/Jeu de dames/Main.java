class Main {
    public static void main(String[] args) {
        // Boucle extérieure pour 20 répétitions
        for (int i = 0; i <= 20; i++) {
            // Boucle intérieure pour imprimer "OX" 20 fois
            for (int j = 0; j <= 20; j++) {
                System.out.print("OX");
            }
            // Passe à la ligne suivante
            System.out.println();

            // Boucle intérieure pour imprimer "XO" 20 fois
            for (int j = 0; j <= 20; j++) {
                System.out.print("XO");
            }
            // Passe à la ligne suivante
            System.out.println();
        }
    }
}