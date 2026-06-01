import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Student_Grade_Tracker {
public static void main(String args[]){
ArrayList<Double> sgrades=new ArrayList<>();
ArrayList<String> snames=new ArrayList<>();
JFrame j=new JFrame("Student Grade Tracker");
JPanel inputPanel =new JPanel(new GridLayout(3,2,5,5));
JLabel l1=new JLabel("Student name:");
JTextField t1=new JTextField(20);
JLabel l2=new JLabel("Student's grade:");
JTextField t2=new JTextField(20);
JButton b1=new JButton("Add student");
inputPanel.add(l1); inputPanel.add(t1);
inputPanel.add(l2); inputPanel.add(t2);
inputPanel.add(b1);
b1.addActionListener(e->{
String name=t1.getText();
String grades=t2.getText();
if(!name.isEmpty()&&!grades.isEmpty()){
double g=Double.parseDouble(grades);
sgrades.add(g);
snames.add(name);
}
});
// Scanner sc=new Scanner(System.in);
// HashMap<String,Double> stdgrade=new HashMap<>();
j.add(inputPanel);
j.setSize(600,600);
j.setLayout(new FlowLayout());
j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
j.setVisible(true);
}}
