public class demenagement {
    public static void main (String[] args) {
        int nombreColis = 34;
        int capaciteCamions = 9;
        int cartonsRestants = nombreColis;
        int nombreVoyages = 0;

        while (cartonsRestants > 0) {
            nombreVoyages++;

            if (cartonsRestants >= capaciteCamions) {
            System.out.println("un voyage de " + capaciteCamions + " cartons.");
            cartonsRestants = cartonsRestants - capaciteCamions;
            } else {
                System.out.println("un voyage de " + cartonsRestants + " cartons.");
                cartonsRestants = 0;
            }
        }
        System.out.println("En tout il y a eu " + nombreVoyages + " voyages");
    }
}

// cartons = 34
// capacité camion = 9 cartons
// total de cartons et contenance du camion donnés en valeurs " en dur "
// afficher pour chaque voyage effectué le message " un voyage de x cartons"
// sois 9+9+9+7 = 34 cartons = 4 voyages