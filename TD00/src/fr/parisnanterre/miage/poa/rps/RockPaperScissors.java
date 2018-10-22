package fr.parisnanterre.miage.poa.rps;

public class RockPaperScissors {
    Result play(RPSEnum p1, RPSEnum p2){
        if(p1 == RPSEnum.PIERRE && p2 == RPSEnum.CISEAUX
                || p1 == RPSEnum.FEUILLE && p2 == RPSEnum.PIERRE
                || p1 == RPSEnum.CISEAUX && p2 == RPSEnum.FEUILLE) {
            return Result.WIN;
        }
        if(p1 == RPSEnum.PIERRE && p2 == RPSEnum.FEUILLE
                || p1 == RPSEnum.FEUILLE && p2 == RPSEnum.CISEAUX
                || p1 == RPSEnum.CISEAUX && p2 == RPSEnum.PIERRE) {
            return Result.LOST;
        }

        return Result.TIE;
    }

    /*void play(Player p1, Player p2){
        RockPaperScissors game = new RockPaperScissors();
        if(game.play(p1.getNextMove(0), p2.getNextMove(0)) == Result.WIN){
            System.out.println("winn");
            p1.setScore(p1.getScore() + 1);
        }
        if(game.play(p1.getNextMove(0), p2.getNextMove(0)) == Result.LOST){
            System.out.println("lost");
            p2.setScore(p2.getScore() + 1);
        }
    }*/
}
