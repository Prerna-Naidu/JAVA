class Box2 {
    double width;
    double height;
    double depth;
    Box2(double width, double height,double depth){
    this.width=width;
    this.height=height;
    this.depth=depth;
    }
    double volume(){
        return width*height*depth;
    }
}
class Main{
    public static void main(String args[]){
        Box2 b1=new Box2(10,20,15);
        double vol;
        vol=b1.volume();
        System.out.println("Volume of b1 is: " +vol);
    }
}