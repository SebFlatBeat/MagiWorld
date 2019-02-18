package Game;

/**
 * Création de la classe abstraite Personnages; Elle sera utilisée pour les différents rôles
 */
public abstract class Personnages extends Main {
    protected String persoNum;
    protected String persoName;
    protected String persoCrideguerre;
    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;


    public Personnages (int numPlayer, int force, int agilite, int intelligence) {
        persoNum = "Joueur " + numPlayer;
        niveau = force+agilite+intelligence;
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

    public void avtivePersonnage() {
        int choice;
        if (vie>0) {
            do {
                choice = Main.demande((persoName + "(" + vie + " vitalité ), veuillez choisir votre attaque (1 : attaque basqiue, 2: attaque spéciale"),1,2);
            }if (choice != 1 && choice != 2)
                System.out.println("Vous n'avez par rentré le bon choix !");
        }while ()
    }
}
