import java.util.ArrayList;

public class GymService {

    ArrayList<Member> members = new ArrayList<>();
    ArrayList<Trainer> trainers = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public void addTrainer(Trainer trainer) {
        trainers.add(trainer);
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }
}
