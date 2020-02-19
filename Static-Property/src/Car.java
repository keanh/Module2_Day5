public class Car {
    private String name;
    private String egine;

    public static int numberOfCar;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEgine() {
//        return egine;
//    }
//
//    public void setEgine(String egine) {
//        this.egine = egine;
//    }

    public Car(String name, String egine) {
        this.name = name;
        this.egine = egine;
        numberOfCar++;

    }
}
    class TestStaticProperty{
        public static void main(String[] args) {
            Car car1 = new Car("Mazda 3","Skyactiv 3");
            System.out.println(Car.numberOfCar);
            Car car2 = new Car("Mazda 6","Skyactiv 6");
            System.out.println(Car.numberOfCar);
        }
    }

