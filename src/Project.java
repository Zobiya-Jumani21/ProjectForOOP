import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        setSize(1540,850);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 =il.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);

        JMenuBar mb = new JMenuBar();
// New information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this::actionPerformed);
        newInformation.add(facultyInfo);

        JMenuItem student_informationInfo = new JMenuItem("New Student Information");
        student_informationInfo.setBackground(Color.WHITE);
        student_informationInfo.addActionListener(this::actionPerformed);
        newInformation.add(student_informationInfo);

        // details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        details.add(facultydetails);

        JMenuItem students_details = new JMenuItem("View Students Details");
        students_details.setBackground(Color.WHITE);
        details.add(students_details);


        // Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        leave.add(facultyleave);

        JMenuItem students_leave = new JMenuItem("Student Leave");
        students_leave.setBackground(Color.WHITE);
        leave.add(students_leave);

        // Leave Details
        JMenu leave_details = new JMenu("Leave Details");
        leave_details.setForeground(Color.RED);
        mb.add(leave_details);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        leave_details.add(facultyleavedetails);

        JMenuItem students_leavedetails = new JMenuItem("Student Leave Details");
        students_leavedetails.setBackground(Color.WHITE);
        leave_details.add(students_leavedetails);

        // Exam
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);

        JMenuItem examDetails = new JMenuItem("Examination Results");
        examDetails.setBackground(Color.WHITE);
        exam.add(examDetails);

        JMenuItem   enterMarks= new JMenuItem("Enter Marks");
      enterMarks.setBackground(Color.WHITE);
        exam.add(enterMarks);

        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);

        JMenuItem updatefacultyInfo = new JMenuItem("Update Faculty Details");
        updatefacultyInfo.setBackground(Color.WHITE);
        updateInfo.add(updatefacultyInfo);

        JMenuItem   updateStudentInfo= new JMenuItem("Update Students Details");
        updateStudentInfo.setBackground(Color.WHITE);
       updateInfo.add(updateStudentInfo);

        // fee
        JMenu fee_details = new JMenu("Fee Details");
        fee_details.setForeground(Color.BLUE);
        mb.add(fee_details);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
      fee_details.add(feestructure);

        JMenuItem   feeForm= new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        fee_details.add(feeForm);

        // Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);

        JMenuItem notePad = new JMenuItem("Notepad");
        notePad.setBackground(Color.WHITE);
        notePad.addActionListener(this);
       utility.add(notePad);

        JMenuItem   calculator= new JMenuItem("Calculator");
        calculator.setBackground(Color.WHITE);
        calculator.addActionListener(this);
       utility.add(calculator);

        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
       exit.add(ex);






        setJMenuBar(mb);

        add(image);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("Exit")) {
            setVisible(false);
        }
        else if (msg.equals("Calculator")){
            try {
                Runtime.getRuntime().exec("calc.exe");
            }
            catch (Exception e){

            }
        }
        else if (msg.equals("Notepad")){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch (Exception e){

            }
        }else if (msg.equals("New Faculty Information")){
            new AddTeacher();
        }
        else if (msg.equals("New Student Information")){
            new AddStudent();
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
