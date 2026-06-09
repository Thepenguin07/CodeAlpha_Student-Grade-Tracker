# 🎓 Student Grade Tracker

A Java Swing GUI application to manage and analyze student grades. Built as part of the **CodeAlpha Java Programming Internship** — Task 1.

---

## 📋 Features

- Add student names and their grades through a clean GUI
- Calculate **average**, **highest**, and **lowest** scores instantly
- Input validation with user-friendly error messages
- Lightweight — no external dependencies, runs with standard Java

---

## 🖥️ Tech Stack

- **Language:** Java
- **GUI Framework:** Java Swing (javax.swing)
- **Data Storage:** ArrayList (in-memory)

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher installed
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal

### Steps

**Using Terminal:**
```bash
# Compile
javac Student_Grade_Tracker.java

# Run
java Student_Grade_Tracker
```

**Using an IDE:**
1. Open the project in your IDE
2. Run `Student_Grade_Tracker.java` as a Java Application

---

## 🧭 How to Use

1. Enter the **student's name** in the "Student Name" field
2. Enter their **grade** (numeric value) in the "Student's Grade" field
3. Click **"Add Student"** — a confirmation message will appear
4. Repeat for all students
5. Click **"Calculate Stats"** to view average, highest, and lowest grades

---

## 📁 Project Structure

```
Student_Grade_Tracker/
│
└── Student_Grade_Tracker.java   # Main application file
```

---

## 📸 Screenshots

<img width="410" height="217" alt="Screenshot 2026-06-09 at 12 33 23 PM" src="https://github.com/user-attachments/assets/31d75789-8730-4778-a6f3-e0d980edb70a" />


---

## ⚠️ Input Validation

The app handles:
- Empty name or grade fields → shows a warning
- Non-numeric grade input → shows an error
- Calculating stats with no data → shows an informational message

---

## 🙋 Author

**Shifa Parveen**  
Java Programming Intern — CodeAlpha  
[LinkedIn](www.linkedin.com/in/shifa-parveen-286251307) | [GitHub](github.com/Thepenguin07)

---

## 📄 License

This project was built for educational purposes as part of the CodeAlpha Internship Program.
