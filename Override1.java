class Parent{
    public void Func(){
        System.out.println("Function of Parent called!");
    }
}
class Child extends Parent{
    public void Func(){
        System.out.println("Function of Child called!");
    }
    public void callFunc(){
        Func();
        super.Func();
    }
}
class Override1{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.callFunc();
    }
}