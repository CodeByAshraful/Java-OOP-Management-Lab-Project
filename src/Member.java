public class Member extends GymPerson {

    private String membershipType;

    // Constructor to initialize member information
    public Member(String name, int id, String membershipType) {
        super(name, id);
        this.membershipType = membershipType;
    }

    // Getter method for membership type
    public String getMembershipType() {
        return membershipType;
    }

    // Method overriding from GymPerson class
    @Override
    public void displayInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Membership: " + membershipType);
    }

   // Convert object information into string format
    @Override
    public String toString() {
        return "Member Name: " + name +
                " | ID: " + id +
                " | Package: " + membershipType;
    }
}
