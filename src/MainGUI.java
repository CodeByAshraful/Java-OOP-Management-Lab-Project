import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame {

    JLabel titleLabel;
    JLabel nameLabel;
    JLabel idLabel;
    JLabel packageLabel;

    JTextField nameField;
    JTextField idField;
    JTextField packageField;

    JButton addButton;
    JButton showButton;

    JTextArea outputArea;

    GymService service = new GymService();

    public MainGUI() {

        setTitle("Smart Gym Management System");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        titleLabel = new JLabel("Smart Gym Management System");

        nameLabel = new JLabel("Member Name:");
        idLabel = new JLabel("Member ID:");
        packageLabel = new JLabel("Membership:");

        nameField = new JTextField(20);
        idField = new JTextField(20);
        packageField = new JTextField(20);

        addButton = new JButton("Add Member");
        showButton = new JButton("Show Members");

        outputArea = new JTextArea(15, 40);

        add(titleLabel);

        add(nameLabel);
        add(nameField);

        add(idLabel);
        add(idField);

        add(packageLabel);
        add(packageField);

        add(addButton);
        add(showButton);

        add(outputArea);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    String name = nameField.getText();
                    int id = Integer.parseInt(idField.getText());
                    String membership = packageField.getText();

                    if(name.isEmpty() || membership.isEmpty()) {
                        throw new Exception("Input field cannot be empty!");
                    }

                    Member member =
                            new Member(name, id, membership);

                    service.addMember(member);

                    JOptionPane.showMessageDialog(null,
                            "Member Added Successfully!");

                    nameField.setText("");
                    idField.setText("");
                    packageField.setText("");

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "ID must be numeric!");

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null,
                            ex.getMessage());
                }
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                outputArea.setText("");

                for(Member member : service.getMembers()) {

                    outputArea.append(member.toString() + "\n");
                }
            }
        });
    }

    public static void main(String[] args) {

        new MainGUI().setVisible(true);
    }
}