public class LimitException extends Exception{
    private double remainedAmount;
    public LimitException(String message, double remainedAmount) {
        super(message);
        this.remainedAmount = remainedAmount;
    }

    public double getRemainedAmount() {
        return remainedAmount;
    }
}
