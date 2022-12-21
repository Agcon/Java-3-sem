package ru.agcon.new_labs.laba13.zadanie2;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Ivanov", "Ivan", "Ivanovich");
        person.showInfo();
        Person secondPerson = new Person("Ivanov", "Ivan");
        secondPerson.showInfo();
        Person thirdPerson = new Person("Ivanov");
        thirdPerson.showInfo();
    }

    static class Person {
        String Surname = "";
        String Name = " ";
        String Otchestvo = " ";

        public Person(String surname, String name, String otchestvo) {
            this.Surname = surname;
            this.Name = name;
            this.Otchestvo = otchestvo;
        }

        public Person(String surname, String name) {
            this.Surname = surname;
            this.Name = name;
        }

        public Person(String surname) {
            this.Surname = surname;
        }

        public void showInfo() {
            String var10001 = this.Surname;
            System.out.println(var10001 + " " + this.Name.charAt(0) + " " + this.Otchestvo.charAt(0));
        }
    }
}
