public class Main {
    public static void main(String[] args) {
        Person person = new Person("Neo", "Tunga", 5);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Teen: " + person.isTeen());
    }
}