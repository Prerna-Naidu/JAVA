interface msg{
    void message1();
    void message2();
}
class Interface implements msg{
    void message1(){
        System.out.println("Good Morning");
    }
    void message2(){
        System.out.println("Good Evening");
    }
    public static void main(String[] args) {
        Interface a=new Interface();
        a.message1();
        a.message2();
    }
}
