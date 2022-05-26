package Task5.JsonWrapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Json {
    public static void main(String[] args) throws IOException {


        ObjectMapper mapper = new ObjectMapper();
        Car car = mapper.readValue(new File("src/main/java/Task5/JsonWrapper/car.json"),Car.class);
        System.out.println(car);

        car.setBrand("BMW");
        car.setModel("525");
        mapper.writeValue(new File("src/main/java/Task5/JsonWrapper/output.json"), car);
        car = mapper.readValue(new File("src/main/java/Task5/JsonWrapper/car.json"),Car.class);
        System.out.println(car);

        car.setBrand("Audi");
        car.setModel("RS6");
        mapper.writeValue(new File("src/main/java/Task5/JsonWrapper/car.json"), car);
    }
}
