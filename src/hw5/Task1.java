package hw5;
//1)Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


public class Task1 {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.showPhonebook();
        System.out.println("=================================");
        phonebook.add("Иванов", 3697536);
        phonebook.add("Иванов", 2597423);
        phonebook.add("Петров", 9456387);
        phonebook.add("Сидоров", 7561483);
        phonebook.showPhoneNumber("Иванов");
        System.out.println("=================================");
        phonebook.showPhoneNumber("Сидоров");
        System.out.println("=================================");
        phonebook.showPhoneNumber("Скворцов");
        System.out.println("=================================");
        phonebook.showPhonebook();

    }
}
