public class Generic<T> {
    private T t;
    public void add(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args) {
        Generic<Integer> rectangle=new Generic<Integer>();
        Generic<Double> circle=new Generic<Double>();
        rectangle.add(10);
        circle.add(2.5);
        System.out.println(rectangle.get());
        System.out.println(circle.get());
    }
}
