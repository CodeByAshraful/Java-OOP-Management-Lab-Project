public class Membership {

    private String packageName;
    private double fee;

    public Membership(String packageName, double fee) {
        this.packageName = packageName;
        this.fee = fee;
    }

    public String getPackageName() {
        return packageName;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return packageName + " Package | Fee: " + fee;
    }
}
