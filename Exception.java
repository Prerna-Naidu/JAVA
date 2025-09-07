class Exception{
    public static void main(String[] args) {
        try{
            System.out.println("This will not be printed.");
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero.");
        }
        System.out.println("After catch statement.");
    }
}