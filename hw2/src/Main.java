public class Main {
    static Employee createObject(String className) {
        return switch (className) {
            case "Manager" -> new Manager(123, "Carl", new String[]{"BurgerHouse", "Granny Cookies"});
            case "Driver" -> new Driver(321, "Boris", "456CAR", new String[]{"Rout1", "Rout2", "Rout3"});
            case "Intern" -> new Intern(111, "George", "Carl", "1 month");
            default -> null;
        };
    }

    public static void main(String[] args) {
        Employee[] employees = {createObject("Manager"), createObject("Driver"), createObject("Intern")};

        for (Employee employee: employees) {
            employee.print();
            System.out.println();
        }
    }
}