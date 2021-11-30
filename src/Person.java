import java.lang.*;


public class Person {
    private String name;
    private int age;

    public Person() {
        name = " ";
        age = 0;
    }

    public Person(String name, int age) throws Exception {
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new Exception("Please, start name with uppercase!");
        }
        this.name = name;
        if (age < 0)
            throw new Exception("Please, input correct age!");
        this.age = age;
    }

    public void setName(String x) throws PersonNameException {
        if (!Character.isUpperCase(x.charAt(0))) {
            throw new PersonNameException(x);
        }
        this.name = x;
    }


    public void setAge(int x) throws PersonAgeException {
        if (age < 0)
            throw new PersonAgeException(age);
            this.age = x;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public boolean isScholarship() {
        return false;
    }
}

class PersonAgeException extends Exception {
    int ageError;

    public PersonAgeException(int ageError) {
        this.ageError = ageError;
    }

    public int getValueError() {
        return ageError;
    }
}

class PersonNameException extends Exception {
    String nameError;

    public PersonNameException(String nameError) {
        this.nameError = nameError;
    }

    public String getValueError() {
        return nameError;
    }
}
