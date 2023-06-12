import java.util.Arrays;

public class Manager extends Employee {
    private String[] clients;

    public Manager(int ID, String name, String[] clients) {
        super(ID, name);
        this.clients = clients;
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Clients: " + Arrays.toString(clients));
    }
}
