package main.it.sevenbits;

public class Dot {
    private int y;
    private int x;
public Dot(int x, int y) {
    setX(x);
    setY(y);
    }
    public void setY(int y){
    this.y=y;
    }
    public void setX(int x){
    this.x=x;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
