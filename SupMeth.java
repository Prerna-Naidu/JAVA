class Rect{
    int length,breadth;
    Rect(int l,int b){
        length=l;
        breadth=b;
    }
}
class Cuboid extends Rect{
    int height;
    Cuboid(int l, int b, int h){
        super(l,b);
        height=h;
    }
    void volume(){
        System.out.println(length*breadth*height);
    }
}
class SupMeth{
    public static void main(String args[]){
        Cuboid c = new Cuboid(1,2,3);
        c.volume();
    }
}
