public class Main {
    public static void main(String[] args) {

        System.out.println("Person Class Tests");
        Person person = new Person("Neo", "Tunga", 5);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Teen: " + person.isTeen());

        System.out.println("Wall Class Tests");
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}