package fr.parisnanterre.miage.poa.rps;

public class Player {
    private String nom;
    private int score;
    private RPSEnum[] listeMouvement;

    public Player(String nom) {
        this.nom = nom;
        this.score = 0;
        this.listeMouvement = new RPSEnum[10];
        for (int i=0;i<listeMouvement.length; i++){
            double a = Math.random();
            if (a<1/3){
                listeMouvement[i] = RPSEnum.CISEAUX;
            }
            else if (a>1/3 && a<2/3){
                listeMouvement[i] = RPSEnum.PIERRE;
            }
            else {
                listeMouvement[i] = RPSEnum.FEUILLE;
            }
        }
    }

    public Player(String nom, RPSEnum[] listeMouvement) {
        this.nom = nom;
        this.score = 0;
        this.listeMouvement = listeMouvement;
    }

    public RPSEnum getNextMove(int iteration){
        return this.listeMouvement[iteration];
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
