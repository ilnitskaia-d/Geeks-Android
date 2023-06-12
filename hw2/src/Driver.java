import java.util.Arrays;

public class Driver extends Employee{
    String carNum;
    String[] routs;

    public Driver(int ID, String name, String carNum, String[] routs) {
        super(ID, name);
        this.carNum = carNum;
        this.routs = routs;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String[] getRouts() {
        return routs;
    }

    public void setRouts(String[] routs) {
        this.routs = routs;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Car number: " + carNum + "\nRouts: " + Arrays.toString(routs));
    }
}
