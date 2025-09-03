interface Calculator{
    void add(int a,int b);
    void subtract(int a,int b);
    void multiply(int a,int b);
    void divide(int a,int b);
}
class Cal implements Calculator{
    public void add(int a,int b){
        System.out.println("Result:" +(a+b));
    }
    public void subtract(int a,int b){
        System.out.println("Result:" +(a-b));
    }
    public void multiply(int a,int b){
        System.out.println("Result:" +(a*b));
    }
    public void divide(int a,int b){
        if(b==0){
            System.out.println("Error");
        }
        else{
            System.out.println("Result:" +(a/b));
        }
    }
}
class Interface4{
    public static void main(String[] args) {
        Cal c=new Cal();
        c.add(1,2);
        c.subtract(5,10);
        c.multiply(10,10);
        c.divide(5,5);
    }
}
