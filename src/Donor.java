public class Donor {
    private String donorName;
    private double donationAmount;

    public Donor(String name, double amount) {
        this.donorName = name;
        this.donationAmount = amount;
    }
    public Donor() {
        this("Joe",5);
    }

    public String getName() {
        return donorName;
    }

    public double getAmount() {
        return donationAmount;
    }

    public void setAmount(double donationAmount) {
        this.donationAmount = donationAmount;
    }

    public void setName(String donorName) {
        this.donorName = donorName;
    }

    public String toString() {
        return "The Donors name is: " + donorName + ".\nThis Donor donated: $" + donationAmount + ".";
    }
}