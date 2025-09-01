public class Box1 {
    double width;
    double height;
    double depth;
    Box1(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    Box1(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box1(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }
}
class Overload{
    public static void main(String args[]){
        Box1 b1=new Box1(10,20,15);
        Box1 b2=new Box1();
        Box1 b3=new Box1(7);
        double vol;
        vol=b1.volume();
        System.out.println("Volume of b1 is " +vol);
        vol=b2.volume();
        System.out.println("Volume of b2 is " +vol);
        vol=b3.volume();
        System.out.println("Volume of b3 is " +vol);
    }
}
