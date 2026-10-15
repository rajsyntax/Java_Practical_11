# 🎂 Age Calculator

## 📌 Overview

The **Age Calculator** is a simple Java program that calculates a person's age using their **Date of Birth**.

The program takes the Date of Birth from the user and calculates the age in:

- Years
- Months
- Days

The Date of Birth must be entered in this format:

```text
dd-MM-yyyy
```

Example:

```text
15-08-2002
```

---

## 📁 Project Structure

```text
AgeCalculator/
└── Main.java
```

### 📄 Main.java

`Main.java` contains the complete Age Calculator program.

It is responsible for:

1. Taking Date of Birth from the user.
2. Converting the entered String into a Date.
3. Getting the current date.
4. Calculating the difference between the dates.
5. Displaying the age in years, months, and days.

---

## 🧠 Concepts Used

This program demonstrates:

- `Scanner`
- `Date`
- `Calendar`
- `SimpleDateFormat`
- Date parsing
- Exception handling
- `ParseException`
- Conditional statements
- User input
- Date calculations

---

## 📅 Date Format

The program uses:

```text
dd-MM-yyyy
```

Here:

```text
dd   → Day
MM   → Month
yyyy → Year
```

### Example

```text
25-12-2005
```

means:

```text
25 December 2005
```

### ⚠️ Important

Do not confuse:

```text
MM → Month
mm → Minute
```

Therefore, the required format is:

```java
"dd-MM-yyyy"
```

---

## 🔄 Program Flow

```text
Start
  ↓
Enter Date of Birth
  ↓
Read input using Scanner
  ↓
Convert String to Date
  ↓
Get Current Date
  ↓
Calculate Years, Months and Days
  ↓
Display Age
  ↓
End
```

---

## 📝 How the Program Works

### 1. Take User Input

The program asks the user to enter their Date of Birth.

Example:

```text
Enter Date of Birth (dd-MM-yyyy): 15-08-2002
```

`Scanner` is used to read the input.

---

### 2. Convert String to Date

The entered date is initially stored as a String.

Example:

```text
"15-08-2002"
```

`SimpleDateFormat` is used to convert the String into a `Date` object.

Example:

```java
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
Date dob = sdf.parse(dobInput);
```

---

### 3. Get Current Date

The current date is obtained using:

```java
Date today = new Date();
```

Now the program has:

```text
Date of Birth
      +
Current Date
      ↓
Age Calculation
```

---

### 4. Calculate Age

`Calendar` is used to work with:

```text
Year
Month
Day
```

The program calculates the difference between the Date of Birth and the current date.

The final result is displayed as:

```text
Years, Months, Days
```

---

# 💻 Sample Input

```text
Enter Date of Birth (dd-MM-yyyy): 15-08-2002
```

# 📤 Sample Output

```text
Age: 24 years, 2 months, 0 days
```

> The exact age depends on the current date when the program is executed.

---

# 🧪 Test Cases

## Test Case 1

### Input

```text
15-08-2002
```

### Output

```text
Age: [calculated years] years, [calculated months] months, [calculated days] days
```

The exact values depend on the current date.

---

## Test Case 2

### Input

```text
01-01-2000
```

### Output

```text
Age: [calculated years] years, [calculated months] months, [calculated days] days
```

---

## Test Case 3: Invalid Date Format

### Input

```text
15/08/2002
```

The program expects:

```text
dd-MM-yyyy
```

Therefore, this input has an incorrect format.

A suitable error message is:

```text
Invalid date format.
Please use dd-MM-yyyy.
```

---

# ⚠️ Exception Handling

The program uses `ParseException` to handle invalid date input.

Example:

```java
try {
    Date dob = sdf.parse(dobInput);
} catch (ParseException e) {
    System.out.println("Invalid date format.");
}
```

### Hinglish Explanation

```text
try block:
→ Normal date conversion yahan hota hai.

catch block:
→ Agar user wrong date format enter kare,
  to ParseException handle hota hai.
```

This prevents the program from terminating unexpectedly because of invalid input.

---

# 🔑 Important Java Classes

## 1. Scanner

`Scanner` is used to take input from the user.

```java
Scanner scanner = new Scanner(System.in);
```

### Hinglish

User jo Date of Birth enter karta hai, `Scanner` us input ko read karta hai.

---

## 2. SimpleDateFormat

`SimpleDateFormat` is used to define the required date format and parse the input.

```java
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
```

### Hinglish

Ye define karta hai ki user ka date input kis format mein hona chahiye.

---

## 3. Date

`Date` represents a particular date and time.

Example:

```java
Date today = new Date();
```

### Hinglish

Isse program ko current date milti hai.

---

## 4. Calendar

`Calendar` is used to work with individual date components such as:

```text
YEAR
MONTH
DAY_OF_MONTH
```

### Hinglish

Age calculate karte waqt year, month aur day ko separately handle karne ke liye `Calendar` useful hai.

---

# 💡 Important Code Logic

The main logic can be understood as:

```text
User Input
    ↓
String Date
    ↓
SimpleDateFormat
    ↓
Date Object
    ↓
Calendar
    ↓
Compare DOB with Current Date
    ↓
Calculate Years + Months + Days
    ↓
Display Age
```

---

# 📝 Important Hinglish Comments

Important parts of the code can be explained using comments like:

```java
// User se Date of Birth input le rahe hain
String dobInput = scanner.nextLine();

// Date ka required format define kar rahe hain
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

// User ke String input ko Date object mein convert kar rahe hain
Date dob = sdf.parse(dobInput);

// Current date obtain kar rahe hain
Date today = new Date();
```

These comments make the code easier to understand and explain during a practical or viva.

---

# ▶️ How to Run in IntelliJ IDEA

### Step 1

Open the project in **IntelliJ IDEA**.

### Step 2

Open:

```text
src/AgeCalculator/Main.java
```

### Step 3

Make sure a Java JDK is configured.

### Step 4

Open `Main.java`.

### Step 5

Click:

```text
Run ▶
```

### Step 6

Enter the Date of Birth when prompted.

Example:

```text
15-08-2002
```

---

# 🛠️ Technologies Used

- Java
- IntelliJ IDEA
- Scanner
- Date
- Calendar
- SimpleDateFormat
- ParseException

---

# 🎯 Learning Objectives

After completing this program, the student should be able to:

1. Take date input from the user.
2. Understand Java date handling.
3. Convert String input into a Date.
4. Use `SimpleDateFormat`.
5. Use `Calendar` for date calculations.
6. Calculate age using Date of Birth.
7. Handle invalid date input.
8. Use exception handling.
9. Work with Java date-related classes.
10. Build a simple real-world Java application.

---

# 🎓 Viva Questions

### Q1. Why is `SimpleDateFormat` used?

**Answer:**

`SimpleDateFormat` is used to format and parse dates according to a specific pattern such as:

```text
dd-MM-yyyy
```

---

### Q2. What does `dd-MM-yyyy` mean?

**Answer:**

```text
dd   → Day
MM   → Month
yyyy → Year
```

---

### Q3. Why is `ParseException` used?

**Answer:**

`ParseException` is used when a String cannot be converted into a Date according to the specified date format.

---

### Q4. Why is `Calendar` used?

**Answer:**

`Calendar` is used to access and manipulate individual date components such as year, month, and day.

---

### Q5. What is the purpose of `Scanner`?

**Answer:**

`Scanner` is used to take input from the user through the console.

---

# 📌 Conclusion

The **Age Calculator** is a beginner-friendly Java application that demonstrates how Java can be used to solve a real-world date-related problem.

The program combines:

```text
User Input
    +
Date Parsing
    +
Calendar Operations
    +
Age Calculation
    +
Exception Handling
```

This practical helps in understanding **Java Date and Time handling**, **user input**, and **exception handling**.
