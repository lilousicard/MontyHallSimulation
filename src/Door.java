public class Door {
    private boolean winner;
    private boolean close;

    public Door (boolean winner) {
        this.winner = winner;
        this.close = true;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean isClosed() {
        return close;
    }

    public void open() {
        close = false;
    }
}
