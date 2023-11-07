class M {
    int a;
    int b;

    int a2;
    static int b2 = 10;


    static double PI;

    public int add() { //kan inte vara static då den kan ändras
        return a + b;
    }

    static public double add2() { //kan vara static. Kommer inte ändras
        return PI;
    }

    static public int add3(int a, int b) {
        return a + b;
    }

    static public int addTen(M math) { 
        return math.a2 + b2;
    }
} 


public class App {
    public static void main(String[] args) throws Exception { //public = synlig överallt, static = tillhör inte objekt utanför classen, void = ingen return
        //M math = new M(); //man behöver inte skapa objekt när man använder static

        System.out.println(M.PI);

        System.out.println(M.add3(5, 7));

        M math = new M();
        math.a2 = 50;
        M.addTen(math);
        
    }
}
