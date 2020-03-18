public class Donor {
    private String donorName;
    private double D_Amount;

    public Donor(String name, double amount) {
        this.donorName = name;
        this.D_Amount = amount;
    }
    public Donor() {
        this("Andy",5);
    }

    public double getAmount() {
        return D_Amount;
    }
    public String getName() {
        return donorName;
    }
    public void setAmount(double donationAmount) {
        this.D_Amount = donationAmount;
    }
    public String toString() {
        return "The Donors name is: "+donorName+".\nThis Donor donated: $"+D_Amount+".";
    }
}