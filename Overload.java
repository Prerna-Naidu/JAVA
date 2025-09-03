class Overload{
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Overload obj=new Overload();
        System.out.println("Sum of two numbers: " +obj.add(10,20));
        System.out.println("Sum of three number: " +obj.add(10,20,30));
    }
}
