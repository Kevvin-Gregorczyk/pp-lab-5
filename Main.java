import java.util.Scanner;

import company.utils.MathUtils;
import company_beans.Person;
import company_exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Podaj imię: ");
            String name = scanner.nextLine();
            System.out.print("Podaj wiek: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Person person = new Person(name, age);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            System.out.print("Podaj pierwszą liczbę: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Podaj drugą liczbę: ");
            int secondNumber = scanner.nextInt();

            int result = MathUtils.add(firstNumber, secondNumber);
            System.out.println("Suma: " + result);

            sendMessage("Wynik dodawania: " + result);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void sendMessage(String message) {
        System.out.println("Wiadomość wysłana: " + message);
    }
}