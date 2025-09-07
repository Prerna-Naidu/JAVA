import java.util.*;
class car {
    private String vin;
    private String description;

    public car(String vin, String description) {
        this.vin = vin;
        this.description = description;
    }

    public String getVin() {
        return vin;
    }
    public String toString() {
        return "car [VIN=" + vin + ", Description=" + description + "]";
    }
}

public class HashMap1 {
    public static void main(String[] args) {
        Map<String, car> carMap=new HashMap<String, car>();
        car vw=new car("227H54", "1997 Volkswagen");
        car mustang=new car("448A69", "1965 Mustang");
        car porsche=new car("453B55", "1997 Porsche");
        car bmw=new car("177R60", "1997 BMW");
        carMap.put(vw.getVin(),vw);
        carMap.put(mustang.getVin(),mustang);
        carMap.put(porsche.getVin(),porsche);
        carMap.put(bmw.getVin(),bmw);
        System.out.println("\nSearching for the car with " +"VIN " +mustang.getVin());
        car foundCar=carMap.get(mustang.getVin());
        if(foundCar !=null)
        System.out.println(foundCar);
        else
        System.out.println("That car is not in the set.");
    }
}
