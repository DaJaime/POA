package fr.parisnanterre.miage.poa.rps;

public class RockPaperScissors {
    Result play(RPSEnum p1, RPSEnum p2){
        if(p1 == RPSEnum.PIERRE && p2 == RPSEnum.CISEAUX) {
            return Result.WIN;
        }
        if(p1 == RPSEnum.PIERRE && p2 == RPSEnum.FEUILLE) {
            return Result.LOST;
        }

        if(p1 == RPSEnum.FEUILLE && p2 == RPSEnum.PIERRE) {
            return Result.WIN;
        }
        if(p1 == RPSEnum.FEUILLE && p2 == RPSEnum.CISEAUX) {
            return Result.LOST;
        }

        if(p1 == RPSEnum.CISEAUX && p2 == RPSEnum.FEUILLE) {
            return Result.WIN;
        }
        if(p1 == RPSEnum.CISEAUX && p2 == RPSEnum.PIERRE) {
            return Result.LOST;
        }

        return Result.TIE;
    }
}
