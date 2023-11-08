class Car { //Vanliga fall ska klasser ha egen fil
    private String make;
    private int modelYear;
    int amountOfWheels;

    // public String getMake() {
    //     return make;
    // }
    // public void setMake(String make) { //this. används för att göra make variabeln längst upp till samma värde som String make inne i metodens argument
    //     this.make = make; 
    // }
    // public int getModelYear() {
    //     return modelYear;
    // }
    // public void setModelYear(int modelYear) {
    //     this.modelYear = modelYear;
    // }

    public Car() {
        amountOfWheels = 4;
    }

    public Car(String make, int modelYear) { //Best practice är att använda samma namn
        this(); //Kallar på sin egen konstruktor (den med amount of wheels). Måste vara först
        this.make = make;
        this.modelYear = modelYear;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        // Car volvo = new Car();
        // volvo.setMake("Volvo");

        // Car saab = new Car();
        // saab.setMake("Saab");

        Car volvo = new Car("Volvo", 2022);

        Car saab = new Car("Saab", 1997);
        System.out.println(saab.amountOfWheels);
    }
}
