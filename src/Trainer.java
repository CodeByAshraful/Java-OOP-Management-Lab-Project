public class Trainer extends GymPerson {

    private String specialty;

    public Trainer(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void displayInfo() {
        System.out.println("Trainer Name: " + name);
        System.out.println("Trainer ID: " + id);
        System.out.println("Specialty: " + specialty);
    }

    @Override
    public String toString() {
        return "Trainer: " + name +
                " | Specialty: " + specialty;
    }
}
