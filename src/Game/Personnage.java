package Game;

/**
 * Création de la classe abstraite Personnage;
 */
public abstract class Personnage {
    protected String persoNum;
    protected String persoName;
    protected String persoCrideguerre;
    private int niveau;
    protected int vieMax;
    protected  int vie;
    private int force;
    private int agilite;
    private int intelligence;
    protected Personnage adversaire;
    protected Personnage joueurActif;


    public Personnage(int numPlayer, int force, int agilite, int intelligence) {
        persoNum = "Joueur " + numPlayer;
        niveau += force + agilite + intelligence;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        vieMax = niveau*5;
        vie = vieMax;
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

    public int getVieMax() {
        return vieMax;
    }

    public void setVieMax(int vieMax) {
        this.vieMax = vieMax;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Personnage getAdversaire() {
        return adversaire;
    }

    protected void activePersonnage() {
        int choice;
        if (vie > 0) {
                choice = PersonnageFabrique.demande(persoNum +" " + persoName + "( " + vie + " points de vie ), veuillez choisir votre attaque 1 : attaque basqiue, 2: attaque spéciale", 1, 2);
                play(choice);
                this.adversaire.activePersonnage();
        }
        else if (vie == 0){         //Utilisation de == car le nombre de point de vie restant peut être strictement égale 0
            System.out.println("Le "+persoNum+ " " + persoName + " a perdu !");
        }
        else if (vie <= 0){         //Utilisation de <= car le nombre de point de vie restant peut être inférieur à 0
        System.out.println("Le "+persoNum+ " " + persoName + " a perdu !");
        }
    }



    protected abstract String play (int choice);

    public void setAdversaire (Personnage adversaire) {
        this.adversaire = adversaire;
    }

    protected void enleverVie(int pointsAenlever) {
        vie = vie - pointsAenlever;
    }

    public void setJoueurActif (Personnage joueurActif){
        this.joueurActif = joueurActif;
    }

    protected void ajouterVie (int pointsAajouter){
        vie = vie + pointsAajouter;
    }

    protected void ajouterAgilite (int pointsAajouter){
        agilite = agilite + pointsAajouter;
    }

    public String toString() {
        return getPersoCrideguerre() + " Je suis le " + getPersoNum() + ". Je suis un " + getPersoName() + " de niveau " + niveau + ". Je possède " + getVieMax() + " de points de vie. J'ai " + getForce() + " de points de force, " + getAgilite() + " de points d'agilté, et " + getIntelligence() + " de points d'intelligence !!!";
    }
}
