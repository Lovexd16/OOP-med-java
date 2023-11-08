public abstract class Animal { //Class är abstract. Man kan inte göra objekt med denna class.
    String name;
    int age;

    public abstract void makeSound(); //Abstract metoder behöver inte {}. Abstract metoder måste ligga i en abstract class. ALla barn till klassen behöver ha sin egna makeSound metod

    public void printName() { //Man kan göra non-abstract metoder i abstract class
        System.out.println(name);
    }
    
}
