package com.pluralsight.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Doe", 30));
        people.add(new Person("James", "Wills", 25));
        people.add(new Person("Jordan", "Sam", 27));
        people.add(new Person("Sarah", "Jane", 40));
        people.add(new Person("Henry", "Fame", 45));
        people.add(new Person("Preda", "Tam", 42));
        people.add(new Person("Tammy", "Gin", 54));
        people.add(new Person("Jenna", "Pan", 35));
        people.add(new Person("Camorn", "Gibbs", 26));
        people.add(new Person("Jessica", "Fave", 43));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Name (first or last)");
        String searchName = scanner.nextLine();

        List<Person> matchingPeolpe = new ArrayList<>();
        for (Person person : people) {
            if ( person.getFirstName().equalsIgnoreCase(searchName) || person.getLastName().equalsIgnoreCase(searchName)) {
                matchingPeolpe.add(person);
            }
        }

        if (matchingPeolpe.isEmpty()) {
            System.out.println("No matching person found.");
        } else {
            System.out.println("Matching people:");
            for (Person person : matchingPeolpe) {
                System.out.println(person.getFirstName() + " "+ person.getLastName());
            }
        }

        int totalAge = 0;
        int oldestAge = Integer.MIN_VALUE;
        int youngestAge = Integer.MAX_VALUE;

        for(Person person : people) {
            totalAge += person.getAge();
            if (person.getAge() > oldestAge) {
                oldestAge = person.getAge();
            }
        }








    }
}
