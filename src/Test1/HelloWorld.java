package Test1;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String [] args){
     //   Constructor<Double> dob = null;
        Map<String , Integer>  map = new HashMap<>();
        map.put("123",321);
        map.put("333",222);
        Boolean  i = map.containsKey("333");
        System.out.println(i);
        System.out.println("第一第一地动仪");

    }
}
