public class Animal {
    public String name;
    
    public Animal(String name) { //Alla djur behöver ett namn, men alla har olika namn
        this.name = name;
    }
    
    public void eat() {
        System.out.println("Animal is eating");
    }

}
