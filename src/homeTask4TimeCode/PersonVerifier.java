package homeTask4TimeCode;

public class PersonVerifier {

    public static void checkPerson(Person person) throws UnderAgeException, IncorrectEmailException {
        checkIs18YearsOld(person);
        checkIsAtInEmail(person);
    }
    public static void checkIs18YearsOld(Person person) throws UnderAgeException {
        if (person.getAge() < 18) {
            throw new UnderAgeException("the user has less han 18 years :" + person);
        }
        System.out.println("user is older than 18 years :" + person);
    }
    public static void checkIsAtInEmail(Person person) throws IncorrectEmailException {
        if (!person.getEmail().contains("@")){
            throw new IncorrectEmailException(" The user did not enter a valid email :" + person);
        }
        System.out.println("User has valid email :" + person);
    }

}
