public class App {
    public static void main(String[] args) throws Exception {
        // Animal animal = new Animal(); //Går inte eftersom Animal class är abstract

        Dog dog = new Dog();
        dog.makeSound();
    }
}
