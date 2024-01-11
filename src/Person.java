public class Person {
    String firstName;
    String lastName;
    int age;
    String occupation;
    boolean isEmployed;
    double height;

    public Person(){
        System.out.println("Person built");
    }
    public Person(String firstName, String lastName, int age){
    this.firstName = firstName;
    this.lastName=lastName;
    this.age= age;
    }
    public Person(String firstName, String lastName, int age, String occupation, boolean isEmployed, double height){
    this(firstName,lastName,age);
    this.occupation =occupation;
    this.isEmployed = isEmployed;
    this.height = height;

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
