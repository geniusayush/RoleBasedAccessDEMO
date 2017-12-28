package locus;

public enum Action {
    READ(0), WRITE(1), CREATE(2);
    int num;

    Action(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
