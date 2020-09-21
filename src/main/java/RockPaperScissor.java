public class RockPaperScissor {
    public RockPaperScissor() {

    }

    public Result play(Play p1, Play p2) {
        Result r=Result.LOST;
        switch(p1){
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
    }
}