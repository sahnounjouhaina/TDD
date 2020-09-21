public class RockPaperScissor {
    public RockPaperScissor() {

    }

    public Result play(Play p1, Play p2) {
        Result r = Result.LOST;

        switch (p1) {
            case PAPER:
                switch (p2) {
                    case PAPER:
                        r = Result.TIE;
                        break;
                    case ROCK:
                        r = Result.WIN;
                        break;
                    case SCISSOR:
                        r = Result.LOST;
                        break;

                    default:
                        break;
                }

                break;

            case ROCK:
                switch (p2) {
                    case ROCK:
                        r = Result.TIE;
                        break;
                    case PAPER:
                        r = Result.LOST;
                        break;
                    case SCISSOR:
                        r = Result.WIN;
                        break;
                    default:
                        break;
                }
                break;

            case SCISSOR:
                switch (p2) {
                    case SCISSOR:
                        r = Result.TIE;
                        break;
                    case PAPER:
                        r = Result.WIN;
                        break;
                    case ROCK:
                        r = Result.LOST;
                        break;
                    default:
                        break;
                }
                break;

            default:
                break;
        }
        return r;
    }


        public Result play(Player p1, Player p2) {
            Result r = Result.LOST;
            p1.resetMoves();
            p2.resetMoves();

            int minMoves = Math.min(p1.getNbMoves(), p2.getNbMoves());
            for (int i = 0; i < minMoves; i++) {
                switch (play(p1.getNextMove(), p2.getNextMove())) {
                    case WIN:
                        p1.setScore(p1.getScore() + 1);
                        break;
                    case LOST:
                        p2.setScore(p1.getScore() + 1);
                        break;
                    case TIE:
                        p1.setScore(p1.getScore() + 1);
                        p2.setScore(p1.getScore() + 1);
                        break;
                }
            }
            if (p1.getScore() > p2.getScore()) {
                r = Result.WIN;
            } else {
                r = Result.LOST;
            }

            return r;
        }


    }


