package jachampagne;

// Mise en évidence de la notion "Interface"

public class InterfaceMain {
    public static void main(String[] args) {
        Parlable chien = new Chien();
        Parlable oiseau = new Oiseau();

        chien.parler();

        System.out.println();

        oiseau.parler();
    }
}