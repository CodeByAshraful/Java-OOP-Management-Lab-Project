public class Member extends GymPerson {

    private String membershipType;

    public Member(String name, int id, String membershipType) {
        super(name, id);
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Membership: " + membershipType);
    }

    @Override
    public String toString() {
        return "Member Name: " + name +
                " | ID: " + id +
                " | Package: " + membershipType;
    }
}