package Game;

public class Main {

    public static void main (String[] args){
        int numPlayer = 1;
        Main player1 = creerPlayer(numPlayer); // Création du player 1
        System.out.println(player1.toString());
        numPlayer ++;
        Main player2 = creerPlayer(numPlayer); // Creation du player 2
        System.out.println(player2.toString());

    }

    private static Main creerPlayer (int numPlayer) {
        Personnages P;
        int persoName,niveau,force,agilite,intelligence;
        System.out.println("Création du Player " + numPlayer);
        persoName = demande ("Choisisez votre personnage : (1 : Guerrier, 2 : Rôdeur , 3 : Mage)",1 , 3);
        do {
            niveau = demande("Choisissez le niveau de vôtre personnage : ", 1,100);
            force = demande("Maintenant la force de vôtre personnage : " ,0,100);
            agilite = demande("Au tour de l'agilité de votre personnage :" , 0,100);
            intelligence = demande("Et enfin, l'intelligence de vôtre personnage", 0 ,100);
            if (force+agilite+intelligence != niveau)
                System.out.println("Attention votre total de force + agilité + intelligence ne doit pas DÉPASSER votre niveau !!!!");
        }while (force+agilite+intelligence != niveau);
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

    public static int demande (String string, int min, int max){

        return;
    }



}
