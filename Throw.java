class Throw{
    public static void main(String[] args) {
        int y=0;
        try{
            if(y==0)
            throw new ArithmeticException(); 
        }
        catch(ArithmeticException e){
            System.out.println("Exception Occured: Division by 0" +e);
        }
    }
}
