public class Membership {

    //private modifier is used to protect data from direct access
    private String packageName;
    private double fee;
    //Constructor initializes membership information
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
