class User {
    String username;
    int age;

    public User(String username, int age) { //Man kan göra flera constructors om man vill, bara man använder olika argument inom ().
        this.username = username;
        this.age = age;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("Love", 21);
        

        User user2 = new User("Maria", 4);
        

        System.out.println(user.username + " " + user.age);
        System.out.println(user2.username + " " + user2.age);
    }
}
