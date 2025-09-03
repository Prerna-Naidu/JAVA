interface Animal{
    public void makesound();
}
class Dog implements Animal{
    public void makesound(){
        System.out.println("\"Bark!\"");
    }
}
class Interface3 extends Dog{
    public static void main(String[] args) {
        Interface3 obj = new Interface3();
        obj.makesound();
    }

}
