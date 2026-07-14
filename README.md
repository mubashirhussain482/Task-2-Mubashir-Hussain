# 🎓 **Task-2-Mubashir-Hussain**

# **Student Grade Calculator (DecodeLabs_Java_P2)**

A simple and interactive **Java Console Application** developed as part of the **DecodeLabs Java Internship**. This project allows users to calculate their overall academic performance by entering the number of subjects and the marks obtained in each subject. The application automatically calculates the total marks, obtained marks, percentage, and final grade while ensuring reliable input validation and exception handling.

---

## 📌 Project Overview

The Student Grade Calculator enables users to enter the total number of subjects and the marks for each subject. It validates all user inputs, calculates the obtained marks, maximum marks, percentage, and determines the final grade based on predefined grading criteria. The application also allows users to perform multiple calculations without restarting the program.

---

## ✨ Features

* 📚 Enter marks for any number of subjects
* 📊 Automatic calculation of:

  * Total Marks
  * Obtained Marks
  * Percentage
  * Final Grade
* ✅ Marks validation (0–100)
* 🔄 Calculate results multiple times
* ⚠ Exception handling to prevent application crashes
* 💻 Simple and user-friendly console interface

---

## 🛠 Technologies Used

* Java
* Scanner Class
* Exception Handling (`InputMismatchException` and `NumberFormatException`)

---

## 📂 Project Structure

```text
Task-2-Mubashir-Hussain
│
└── DecodeLabs_Java_P2.java
```

---

## 🎮 How the Program Works

1. The user enters the total number of subjects.
2. The program validates the entered value.
3. The user enters the marks obtained in each subject.
4. The program validates that each mark is between **0 and 100**.
5. After all valid marks are entered, the program calculates:

   * Maximum Marks
   * Obtained Marks
   * Percentage
   * Final Grade
6. The calculated result is displayed.
7. The user can choose to perform another calculation or exit the program.

---

## 📊 Grade Criteria

|    Percentage | Grade |
| ------------: | :---: |
| 90% and Above |   A   |
|  80% – 89.99% |   B   |
|  70% – 79.99% |   C   |
|  60% – 69.99% |   D   |
|  50% – 59.99% |   E   |
|     Below 50% |  Fail |

---

## ✅ Input Validation

The application includes proper input validation to improve reliability and user experience.

* Prevents invalid (non-numeric) input using exception handling.
* Ensures the total number of subjects is greater than **0**.
* Accepts only marks between **0 and 100**.
* Continuously prompts the user until valid input is entered.
* Validates the replay option by accepting only **yes** or **no**.
* Prevents the program from crashing due to unexpected user input.

---

## 🚀 How to Run

### Clone the Repository

```bash
git clone https://github.com/your-username/Task-2-Mubashir-Hussain.git
```

### Open the Project

Open the project using any Java IDE such as:

* NetBeans
* IntelliJ IDEA
* Eclipse

### Run the Program

Compile and run:

```text
DecodeLabs_Java_P2.java
```

---

## 📖 Java Concepts Demonstrated

* Variables and Data Types
* User Input using Scanner
* Conditional Statements (`if` / `else if`)
* Loops (`while` and `do-while`)
* Exception Handling
* Input Validation
* Arithmetic Operations
* Percentage Calculation
* Grade Evaluation

---

## 👨‍💻 Author

**Mubashir Hussain**

BS Software Engineering
COMSATS University Islamabad, Attock Campus

---

## 📄 License

This project was developed for learning purposes as part of the **DecodeLabs Java Internship**.
