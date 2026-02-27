import java.util.Scanner;

/**
 * TransportManager is a simple console program that calculates
 * how many trips are required to transport a given number of boxes
 * using a truck with a specific capacity.
 *
 * The user is asked to enter:
 * - The total number of boxes
 * - The truck capacity
 *
 * The program then displays each trip and the total number of trips.
 */

public class TransportManager {
    /**
     * Prints a message to the console.
     *
     * @param message The message to display.
     */
    static void print(String message) {
        System.out.println(message);
    }

    /**
     * Reads an integer from the user with input validation.
     * The method ensures that the user enters a valid integer.
     *
     * @param scanner The Scanner object used to read input.
     * @param prompt The message displayed to the user.
     * @return The valid integer entered by the user.
     */
    public static int readInt (Scanner scanner, String prompt) {
        print(prompt);

        while (!scanner.hasNextInt()) {
            print("Error. Please enter a number.");
            scanner.nextLine();
        }

        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    /**
     * Main method of the program.
     * It controls user input and manages the transport calculation.
     *
     * @param args Command-line arguments (not used).
     */

    public static void main (String[] args) {

        int totalBoxes;
        int truckCapacity;
        int remainingBoxes;
        int tripCount = 0;

        Scanner scanner = new Scanner(System.in);
        totalBoxes = readInt(scanner, "Saisir votre nombre de colis : ");
        truckCapacity = readInt(scanner, "Saisir la capacité du camion : ");

        remainingBoxes = totalBoxes;

         while (remainingBoxes > 0) {
            tripCount++;

            if (remainingBoxes >= truckCapacity) {
                print("un voyage de " + truckCapacity + " cartons.");
                remainingBoxes = remainingBoxes - truckCapacity;
            } else {
                print("un voyage de " + remainingBoxes + " cartons.");
                remainingBoxes = 0;
            }
        }
        print("En tout il y a eu " + tripCount + " voyages");
    }
}

// cartons = 34
// capacité camion = 9 cartons
// total de cartons et contenance du camion donnés en valeurs " en dur "
// afficher pour chaque voyage effectué le message " un voyage de x cartons"
// sois 9+9+9+7 = 34 cartons = 4 voyages


// autre entreprise avec nombres de cartons et taille de camion différente
//adapter afin que le nombre de cartons totaux et la capacité du camions deviennent des variables
// demander a l'user via un texte dans la console le nombre de carton a déménager et la capacité du camion
// récuperer le nombre saisi par l'users afin de stocker les variables
// vérifier qu'il sagit bien d'un nombre et de ne pas passer a la suite tant que ce n'est pas le cas

/* Créer un Scanner

Demander nombre de cartons

Vérifier que c’est un nombre

Demander capacité camion

Vérifier que c’est un nombre

Lancer la boucle de déménagement

Afficher le total de voyages */