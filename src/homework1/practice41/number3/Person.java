package homework1.practice41.number3;

public class Person {
    private String fullname;
    private int age;

    public void move() {
        System.out.println(fullname + " двигается");
    }

    public void talk() {
        System.out.println(fullname + " говорит");
    }

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Person() {
        this.fullname = "Naumov";
        this.age = 18;
    }
}
