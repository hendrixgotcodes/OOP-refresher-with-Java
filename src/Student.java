public class Student extends Human {

    private String school;
    private String course;

    @Override
    public String toString() {
        return "Human{" +
                super.toString() +
                ", school=" + this.school +
                ", course=" + this.course +
                '}';
    }

    public Student(String name, int age, String school, String course){
        super(name, age);
        this.course = course;
        this.school = school;
    }



}
