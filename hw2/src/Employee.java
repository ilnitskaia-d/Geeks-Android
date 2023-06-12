public class Employee implements Printable{
    private int ID;
    private String name;

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + "\nID: " + ID);
    }
}
