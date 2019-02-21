package Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonnageFabrique{

    protected static Personnage creerPlayer (int numPlayer) {
        int persoName,niveau,force,agilite,intelligence;
        System.out.println("Création du Player " + numPlayer);
        persoName = demande ("Choisisez votre personnage : (1 : Guerrier, 2 : Rôdeur , 3 : Mage)",1 , 3);
        do {
            niveau = demande("Choisissez le niveau de votre personnage entre 1 et 100 : ", 1,100);
            force = demande("Maintenant la force de votre personnage entre 0 et 100 : " ,0,100);
            agilite = demande("Au tour de l'agilité de votre personnage entre 0 et 100 :" , 0,100);
            intelligence = demande("Et enfin, l'intelligence de votre personnage entre 0 et 100 :", 0 ,100);
            if (force+agilite+intelligence > niveau)
                System.out.println("Attention votre total de force + agilité + intelligence ne doit pas DÉPASSER votre niveau !!!!");
        }while (force+agilite+intelligence > niveau);
        switch (persoName) {
            case 1 :
                return new Guerrier(numPlayer,force,agilite,intelligence);
            case 2 :
                return new Rodeur(numPlayer,force,agilite,intelligence);
            case 3 :
                return new Mage(numPlayer,force,agilite,intelligence);
            default:
                return new Mage(numPlayer,force,agilite,intelligence);
        }
    }

    public static int demande (String string, int min) {
        int choice;
        boolean rightChoice;
        Scanner sc = new Scanner(System.in);
        do {
            choice = 0;
            System.out.println(string);
            try {
                rightChoice = true;
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                rightChoice = false;
            }
            if (rightChoice) {
                if (!(choice >= min)) rightChoice = false;
            }
        }while (!rightChoice) ;
        return choice;
    }

    public static int demande (String string, int min, int max){
        int choice;
        do {
            choice = demande(string,min);
        }while (choice>max);
        return choice;
    }
}
