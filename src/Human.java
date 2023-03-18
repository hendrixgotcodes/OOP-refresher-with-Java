public class Human {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Human(String name, int age){
        this.name=name;
        this.age=age;
    }
}
