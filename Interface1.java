interface SharedConstants{
    int X=0;
    int Y=1;
}
class Interface1 implements SharedConstants{
    static void show(){
        System.out.println("X=" +X +" and Y=" +Y);
    }
    public static void main(String[] args) {
        Interface1 a = new Interface1();
        a.show();
    }
}
