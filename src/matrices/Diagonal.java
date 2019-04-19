package matrices;

public class Diagonal {

    int diag1;
    int diag2;

    Diagonal(int diag1, int diag2) {
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    int resultado() {
        return (Math.abs(diag1 - diag2));
    }

}
