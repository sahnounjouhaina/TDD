import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int score;
    private List<Play> mouvements;
    int index;

    public Player(String name, List<Play> mouvements) {
        this.mouvements = mouvements;
        this.name = name;
        this.score = 0;
        this.index = 0;
    }

    public Player(String name) {
        this.name = name;
        this.mouvements = new ArrayList<Play>();
        this.score = 0;
        int nbrMv = 0;
        this.index = 0;

        for (int i = 0; i < 20; i++) {
            nbrMv = (int) Math.random() % 3;
            switch (nbrMv) {
                case 0:
                    mouvements.add(Play.PAPER);
                    break;
                case 1:
                    mouvements.add(Play.SCISSOR);
                    break;
                case 2:
                    mouvements.add(Play.ROCK);
                    break;
                default:
                    mouvements.add(Play.ROCK);
                    break;
            }
        }
    }
    public int getScore() {
        return this.score;
    }

    public int getNbMoves() {
        return mouvements.size();
    }

    public Play getNextMove() {
        Play p = mouvements.get(index);
        index++;
        return p;
    }

    public void resetMoves() {
        this.index = 0;
    }

    public void setScore(int score) {
        this.score = score;
    }

}