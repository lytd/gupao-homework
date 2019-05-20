package  com.td.pattern.factory.simplefactory;

public class CarFactory {

    public Car create(){
        Car car=new Car();
        car.setColor("yellow");
        car.setName("benz");

        return car;

    }

}
