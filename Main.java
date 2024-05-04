import company_beans.Person;
import company_exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("John Doe", 140);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}