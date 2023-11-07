import cars.Car; //bara synlig när class Car är public

public class App {
    public static void main(String[] args) throws Exception { //public är en access modifier. Public betyder att man kommer åt den vart vi än är i projektet.
        
        Car car = new Car();
        System.out.println(car.modelName); //syns bara om variabeln modelName är satt till public
    }
}
