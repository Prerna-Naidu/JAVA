import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        Set<String> fruitSet=new HashSet<String>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Pear");
        fruitSet.add("Strawberry");
        System.out.println("Here are the elements:");
        for(String element:fruitSet)
        System.out.println(element);
        System.out.println("\nTrying to add Banana to" +" the set again.");
        if(!fruitSet.add("Banana"))
        System.out.println("Banana was not added again.");
        System.out.println("\nHere are the elements once more.");
        for(String element:fruitSet)
        System.out.println(element);
    }
}
