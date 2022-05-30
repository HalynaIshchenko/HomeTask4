package homeTask4TimeCode;

public class Main {

    public static void main(String[] args) throws UnderAgeException, IncorrectEmailException {
        Person person1 = new Person("Taras", 18, "taras@gmail.com");
        Person person2 = new Person("Olena", 17, "olena@gmail.com");
        //Щоб перевірити помилку при відсутності @ закоментати 7 і 14 рядок і розкоментати 9 і 15
        //Person person3 = new Person("Ihor", 21, "ihor.mail.com");



        PersonVerifier.checkPerson(person1);
        PersonVerifier.checkPerson(person2);
        //PersonVerifier.checkPerson(person3);
    }


}
