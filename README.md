# Student Grade Tracker

A Java Swing desktop application designed to input, manage, and analyze student grades. The project focuses on utilizing synchronized data structures to store student records and provide real-time classroom insights.

## 🚀 Features (Current Blueprint)
* **Data Management:** Input and manage student records dynamically.
* **Core Metrics:** Automatically calculate class averages, highest scores, and lowest scores.
* **Storage Engine:** Employs synchronized `ArrayList` structures to seamlessly pair student names with their respective grades.
* **Summary Reports:** Generate an organized, aggregated performance report of all active students.
* **User Interface:** Interactive Graphical User Interface (GUI) built with Java Swing.

---

## 🛠️ System Architecture

The application ensures data integrity using a **Parallel ArrayList Structure**:
* `snames` (`ArrayList<String>`): Manages student name identifiers.
* `sgrades` (`ArrayList<Double>`): Tracks numeric grades associated with each student.

Both lists remain synchronized by index position ($snames[i] \leftrightarrow sgrades[i]$) across all data insertions and tracking operations.

---

## 📋 How To Run

1. Ensure you have **Java Development Kit (JDK) 8 or higher** installed.
2. Compile the source file:
   ```bash
   javac Student_Grade_Tracker.java
Run the application:
Bash
java Student_Grade_Tracker
📅 Daily Development Log
Day 1: Foundation & Basic GUI Setup
Initialized the main Student_Grade_Tracker class.
Integrated basic Java Swing elements (JFrame, JPanel, JTextField, JButton).
Implemented the parallel ArrayList logic to capture user inputs upon button clicks.
Set up foundational layout constraints (GridLayout and FlowLayout).
