package Game;

/**
 * Création de la classe abstraite Personnages; Elle sera utilisée pour les différents rôles
 */
public abstract class Personnages {
    protected String persoName;
    private int niveau;
    private int vie = niveau*5;
    private int force;
    private int agilite;
    private int intelligence;
    private int sortBasique;
    private int sortSpecial;


public Personnages() {
}

public Personnages (String persoName, int niveau, int vie, int force, int agilite, int intelligence, int sortBasique, int sortSpecial) {
            this.persoName = persoName;
            this.niveau = niveau;
            this.vie = vie;
            this.force = force;
            this.agilite = agilite;
            this.intelligence = intelligence;
            this.sortBasique = sortBasique;
            this.sortSpecial = sortSpecial;
}

    public String getPersoName() {
        return persoName;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSortBasique() {
        return  sortBasique;
    }

    public int getSortSpecial() {
        return  sortSpecial;
    }

}
