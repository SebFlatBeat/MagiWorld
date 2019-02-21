package Game;

/**
 * classe des personnages de type Mage
 */
public class Mage extends Personnage implements Attaques {

    protected Mage(int numPlayer, int force, int agilite, int intelligence) {
        super(numPlayer, force, agilite, intelligence);
        setPersoName("Mage");
        setPersoCrideguerre("Inanimatus Apparitus");
        getVieMax();
    }

    @Override
    protected String play(int choice) {
        if (choice == 1) {
            attaqueBasique("Boule de feu");
        } else if (choice == 2) {
            attaqueSpecial("Soin");
        }
        return String.valueOf(choice);
    }

    @Override
    public void attaqueBasique(String basicName) {
        adversaire.enleverVie(getIntelligence());
        vie = vie - getIntelligence();
        System.out.println(persoName + " utilise l'attaque Boule de Feu et inflige " + getIntelligence() + " points de dégâts ");
    }

    @Override
    public void attaqueSpecial(String specialName) {

        if (getVie() < getVieMax()) {
            joueurActif.ajouterVie(getIntelligence() * 2);
        }
            { if (getVie() >= getVieMax()) {
                System.out.println(persoName + " utilise son pouvoir de régéneration et gagne " + ((getVieMax()+(getIntelligence()*2)-getVie())) + "  points de vie !! ");
                vieMax = vie;
            } else if (getVie() < getVieMax()) {
                System.out.println(persoName + " utilise son pouvoir de régéneration et gagne " + (getIntelligence() * 2) + "  points de vie !! ");
            }
        }
    }
}