package cars;

public class Car { //Om man inte skriver public eller något annat så är den bara public inom sitt package
    private int modelYear = 2017; //private betyder att man inte kan komma åt variabeln från någon annan class, även om det är i samma package. Bara den egna classen.
    public String modelName = "Volvo"; //public betyder att man kan komma åt den överallt.
    protected String driver = "Love"; //Samma som private. Skillnaden är med arv, inheritence, subclass. Koms åt i sin egen class och alla subclasses.

    public void test() {
        System.out.println(modelYear);
    }
}
