package main.it.sevenbits;

public class Main {
    public static void main(String[] args) {
        Segment[] segments = new Segment[4];
        double max_length=0;
        segments[0] = new Segment(new Dot(4,3), new Dot(7,3));
        segments[1] = new Segment(new Dot(4,5), new Dot(20,8));
        segments[2] = new Segment(new Dot(2,10), new Dot(1,1));
        segments[3] = new Segment(new Dot(2,5), new Dot(4,17));
        for (int i = 0; i < 4; i++){
            System.out.printf("length of " + (i+1) + " segment = " + segments[i].getLength()+"\n");
            if (segments[i].getLength() > max_length)
                max_length = segments[i].getLength();
        }
        System.out.printf("max length of segments = "+ max_length);
    }
}
