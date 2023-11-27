package structural.adaptor;

public class DbData {
    private int position;
    private int amount;

    public DbData(int position, int amount) {
        this.position = position;
        this.amount = amount;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "DbData{" +
                "position=" + position +
                ", amount=" + amount +
                '}';
    }
}
