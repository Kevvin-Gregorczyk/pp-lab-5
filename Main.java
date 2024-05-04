import company.implementations.EmailMessenger;
import company_beans.Person;
import company_exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("To jest testowa wiadomość e-mail.");
        try {
            Person person = new Person("John", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Invalid age: " + e.getMessage());
        }
    }
}