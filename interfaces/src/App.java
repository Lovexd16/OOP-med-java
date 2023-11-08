interface Phone { //Går inte att göra objekt från interface. Inte längre en kclass. public abstract är default och behöver inte skrivas
    // String name; //Går inte i ett interface. I interface får det "final" och "static" automatiskt. Final går inte ändra och behöver ges ett värde
    String name = "Love"; //Kommer aldrig kunna ändras
    /* public abstract*/ void call();

    /*public abstract*/ void charge();

    // public void test() { //Kan inte skriva "vanliga" metoder i ett interface

    // }
}

interface X {
    void testX();
}

interface Y extends X { //Tar från X och sitt egna
    void testY();
}

class Iphone implements Phone, Y { //Går att göra objekt ifrån. Man kan implementa flera interfaces. Räcker med Y då Y extendar X och därmed får med sig innehållet i X

    @Override
    public void call() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void testX() {
      
    }

    @Override
    public void testY() {
    
    } 

}

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        System.out.println(Phone.name);
        //Phone.name = "Maria"; //Funkar inte då "Love" är final och kan inte ändras
    }
}
