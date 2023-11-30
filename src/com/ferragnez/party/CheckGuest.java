package com.ferragnez.party;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // CREO L'ARRAY
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        // RENDO VISIBILE IN CONSOLE L'ARRAY
        System.out.println(Arrays.toString(guests));
        // CHIEDO IL NOME ALL'UTENTE
        System.out.println("Qual è il tuo nome?");
        String userName = scanner.nextLine();
        boolean userFound = false;

          /* VERIFICO SE IL NOME UTENTE E' NELLA LISTA CON IL FOR
        for (int i = 0; i < guests.length; i++) {
            if (userName.equals(guests[i])) {
                userFound = true;
                break;
            }
        }
        if (userFound == true)
            System.out.println("Puoi entrare");
        else {
            System.out.println("Non puoi entrare");
        }

        */
        // CON IL CICLO WHILE
        int i = 0;
        while (!userFound && i < guests.length) {
            if (userName.equals(guests[i])) {
                userFound = true;
                System.out.println("Puoi entrare");
            }
            i++;
        }
        if (!userFound) {
            System.out.println("Non puoi entrare");
        }
    }
}
