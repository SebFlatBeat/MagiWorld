package Game;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Création de la classe abstraite Personnages;
 */
public abstract class Personnages extends Main {
    protected String persoNum;
    protected String persoName;
    protected String persoCrideguerre;
    private int niveau;
    protected int vie;
    private int force;
    private int agilite;
    private int intelligence;
    protected Personnages adversaire;


    public Personnages (int numPlayer, int force, int agilite, int intelligence) {
        persoNum = "Joueur " + numPlayer;
        niveau += force + agilite + intelligence;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        vie = niveau*5;
    }

    public String getPersoNum() {
        return persoNum;
    }

    public void setPersoNum(String persoNum) {
        this.persoNum = persoNum;
    }

    public String getPersoName() {
        return persoName;
    }

    public void setPersoName(String persoName) {
        this.persoName = persoName;
    }

    public String getPersoCrideguerre() {
        return persoCrideguerre;
    }

    public void setPersoCrideguerre(String persoCrideguerre) {
        this.persoCrideguerre = persoCrideguerre;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Personnages getAdversaire() {
        return adversaire;
    }

    protected static Personnages creerPlayer (int numPlayer) {
        Personnages P;
        int persoName,niveau,force,agilite,intelligence;
        System.out.println("Création du Player " + numPlayer);
        persoName = demande ("Choisisez votre personnage : (1 : Guerrier, 2 : Rôdeur , 3 : Mage)",1 , 3);
        do {
            niveau = demande("Choisissez le niveau de vôtre personnage : ", 1,100);
            force = demande("Maintenant la force de vôtre personnage : " ,0,100);
            agilite = demande("Au tour de l'agilité de votre personnage :" , 0,100);
            intelligence = demande("Et enfin, l'intelligence de vôtre personnage", 0 ,100);
            if (force+agilite+intelligence > niveau)
                System.out.println("Attention votre total de force + agilité + intelligence ne doit pas DÉPASSER votre niveau !!!!");
        }while (force+agilite+intelligence > niveau);
        switch (persoName) {
            case 1 :
                P = new Guerrier(numPlayer,force,agilite,intelligence);
                break;
            case 2 :
                P = new Rodeur(numPlayer,force,agilite,intelligence);
                break;
            case 3 :
                P = new Mage(numPlayer,force,agilite,intelligence);
                break;
            default:
                P = new Mage(numPlayer,force,agilite,intelligence);
        }
        return P;
    }

    protected void activePersonnage() {
        int choice;
        if (vie > 0) {
            do {
                choice = Personnages.demande((persoName + "(" + vie + " vitalité ), veuillez choisir votre attaque (1 : attaque basqiue, 2: attaque spéciale"), 1, 2);
            if (choice != 1 && choice != 2)
                System.out.println("Vous n'avez par rentré le bon choix !");
        } while (choice != 1 && choice != 2);
            System.out.println(this.play(choice));
        if (vie <= 0) return;
        this.adversaire.activePersonnage();}
        else {
        System.out.println("Le " + persoName + " à perdu !");
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

    protected abstract String play (int choice);

    public void setAdversaire (Personnages adversaire) {
        this.adversaire = adversaire;
    }

    protected void enleverVie(int pointsAenlever) {
        vie = vie - pointsAenlever;
    }

    public String toString() {
        return getPersoCrideguerre() + " je suis le " + getPersoNum() + ". Je suis un " + getPersoName() + " de niveau " + niveau + ". Je possède " + vie + " points de vitalité. J'ai " + getForce() + " points de force, " + getAgilite() + " points d'agilté, et " + getIntelligence() + " points d'intelligence !!!";
    }
}
