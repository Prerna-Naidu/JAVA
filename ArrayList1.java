import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        List <String> nameList=new ArrayList <String>();
        String[] names={"Ann","Bob","Carol"};
        for(int k=0;k<names.length;k++)
        nameList.add(names[k]);
        for(int k=0;k<nameList.size();k++){
            System.out.println(nameList.get(k));
        }
    }
}
