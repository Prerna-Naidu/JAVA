class A{
    final void meth(){
        System.out.println("This is a final method.");
    }
}
class B extends A{
    void meth1(){
        System.out.println("Illegal!");
    }
}
class FinalKey{
    public static void main(String[] args) {
        B sub=new B();
        sub.meth();
    }
}
