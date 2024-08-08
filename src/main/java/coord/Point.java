package coord;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = checkPoint(x);
        this.y = checkPoint(y);
    }

    private int checkPoint(int p){
        if(p < 0 || p > 24) throw new IllegalArgumentException("범위 초과");
        return p;
    }
}
