package fr.parisnanterre.miage.poa.rps;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    RockPaperScissors game;

    @DataProvider(name= "winData")
    public Object[][] createDataWin(){
        return new Object[][] {
                {RPSEnum.PIERRE, RPSEnum.CISEAUX},
                {RPSEnum.CISEAUX, RPSEnum.FEUILLE},
                {RPSEnum.FEUILLE, RPSEnum.PIERRE}
        };
    }

    @DataProvider(name= "lostData")
    public Object[][] createDataLost(){
        return new Object[][] {
                {RPSEnum.PIERRE, RPSEnum.FEUILLE},
                {RPSEnum.CISEAUX, RPSEnum.PIERRE},
                {RPSEnum.FEUILLE, RPSEnum.CISEAUX}
        };
    }

    @DataProvider(name= "tieData")
    public Object[][] createDataTie(){
        return new Object[][] {
                {RPSEnum.PIERRE, RPSEnum.PIERRE},
                {RPSEnum.CISEAUX, RPSEnum.CISEAUX},
                {RPSEnum.FEUILLE, RPSEnum.FEUILLE}
        };
    }



    @BeforeMethod
    public void setUp() throws Exception {
        game = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        game = null;
    }

    @Test(dataProvider = "winData")
    public void testWinPlay(RPSEnum p1, RPSEnum p2) throws Exception {
        assertEquals(game.play(p1, p2), Result.WIN);
    }

    @Test(dataProvider = "lostData")
    public void testLostPlay(RPSEnum p1, RPSEnum p2) throws Exception {
        assertEquals(game.play(p1, p2), Result.LOST);
    }

    @Test(dataProvider = "tieData")
    public void testTiePlay(RPSEnum p1, RPSEnum p2) throws Exception {
        assertEquals(game.play(p1, p2), Result.TIE);
    }

}