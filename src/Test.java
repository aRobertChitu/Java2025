public class Test {

    private int x;
    private String y;

    public Test() {
    }

    public Test(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public Test(int x) {
        this.x = x;
    }

    public Test(String y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void setY(String y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    @Override
    public String toString() {
        return
                "{x=" + x +
                ", y='" + y + '\'' +
                '}';
    }
}
