public class Dog extends Animal {
    public String hasTail;

    public Dog(String name, String hasTail) { //Tar in name variabeln från Animal
        super(name);
        this.hasTail = hasTail;
    }
    
    // // @Override
    // // public void eat() {
    // //     super.eat(); //Kallar på eat-metoden som finns i Animal
    // //     System.out.println("The dog is eating");
    // }

    public void myMethod() {
        eat(); //När vi inte har någon eat metod här så kallar den på Animals eat metod.
    }
}
