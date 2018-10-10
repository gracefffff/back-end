package main.it.sevenbits;

public class Segment {
    private Dot first_dot;
    private Dot second_dot;

    public Segment(Dot dot1, Dot dot2){
        setFirst_dot(dot1);
        setSecond_dot(dot2);
    }
    public double getLength(){
        return Math.abs(Math.sqrt((Math.pow(second_dot.getX()-first_dot.getX(),2)+Math.pow(second_dot.getY()-
                first_dot.getY(),2))));
    }
    public Dot getFirst_dot() {
        return first_dot;
    }

    public Dot getSecond_dot() {
        return second_dot;
    }

    public void setFirst_dot(Dot first_dot) {
        this.first_dot = first_dot;
    }

    public void setSecond_dot(Dot second_dot) {
        this.second_dot = second_dot;
    }
}
