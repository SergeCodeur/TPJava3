import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez un nombre entier : ");
            int nombre = scanner.nextInt();

            System.out.print("Divisez " + nombre + " par combien ? ");
            int diviseur = scanner.nextInt();

            int resultat = nombre / diviseur;
            System.out.println("Résultat : " + resultat);

        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro interdite !");
        } catch (Exception e) {
            System.out.println("Erreur : Entrée invalide, veuillez entrer un nombre entier.");
        } finally {
            System.out.println("Fin du programme. Merci d'avoir testé !");
        }
    }
}
