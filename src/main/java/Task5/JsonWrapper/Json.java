package Task5.JsonWrapper;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class Json {
    public static void main(String[] args) throws IOException {


        ObjectMapper mapper = new ObjectMapper();
        Car car = mapper.readValue(new File("src/main/java/Task5/JsonWrapper/car.json"),Car.class);
        System.out.println(car);

        changeField(car,"brand", "BMW");
        changeField(car,"model","RS4");
        mapper.writeValue(new File("src/main/java/Task5/JsonWrapper/car.json"), car);
        car = mapper.readValue(new File("src/main/java/Task5/JsonWrapper/car.json"),Car.class);
        System.out.println(car);

        changeField(car,"brand", "Audi");
        changeField(car,"model","RS6");
        mapper.writeValue(new File("src/main/java/Task5/JsonWrapper/car.json"), car);
    }
}
