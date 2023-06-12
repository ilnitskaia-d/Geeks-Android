public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if(name.length() > 20) {
            throw new IllegalNameException("Error: too many symbols in the input. Requested input must be not more than 20 symbols");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 100 || age <= 0)
        {
            throw new IllegalAgeException("The age is beyond the possible. Your input is " + age);
        }
        this.age = age;
    }
}
