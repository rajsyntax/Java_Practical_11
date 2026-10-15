# ☕ Java Practical 11

## 📚 String and Date Handling in Java

This repository contains the complete implementation of **Java Practical 11**.

The practical focuses on basic Java programming concepts such as **String manipulation, palindrome checking, character frequency counting, date and time handling, and age calculation**.

All programs are written in Java and organized into separate packages so that each practical can be executed independently.

---

## 📌 Practical Overview

| No. | Program | Main Concept |
|-----|---------|--------------|
| 1 | String Manipulation | String methods and character processing |
| 2 | Palindrome Checker | StringBuilder and string comparison |
| 3 | Character Frequency Counter | HashMap |
| 4 | Digital Clock | Date, SimpleDateFormat and Thread |
| 5 | Age Calculator | Date parsing and Calendar |

---

# 1️⃣ String Manipulation

### 📦 Package

```text
StringManipulation
```

### 📄 File

```text
src/StringManipulation/Main.java
```

### 📝 Description

This program accepts a string from the user and performs different string manipulation operations.

The program demonstrates:

- Finding string length
- Converting string to uppercase
- Converting string to lowercase
- Reversing a string
- Counting words
- Searching for a word
- Counting vowels
- Counting spaces
- Counting digits
- Counting special characters

### 🔑 Concepts Used

```text
String
StringBuilder
Scanner
String methods
Character methods
Loops
Conditional statements
```

---

# 2️⃣ Palindrome Checker

### 📦 Package

```text
PalindromeChecker
```

### 📄 File

```text
src/PalindromeChecker/Main.java
```

### 📝 Description

This program checks whether a given string is a **palindrome** or not.

A palindrome is a string that remains the same when reversed.

Example:

```text
madam
```

Reverse:

```text
madam
```

Therefore:

```text
Palindrome
```

### 🔑 Concepts Used

```text
String
StringBuilder
reverse()
equals()
Scanner
Conditional statements
```

### 💻 Sample Output

```text
Enter a string: madam

Original: madam
Reverse: madam
Result: Palindrome
```

---

# 3️⃣ Character Frequency Counter

### 📦 Package

```text
CharacterFrequency
```

### 📄 File

```text
src/CharacterFrequency/Main.java
```

### 📝 Description

This program counts how many times each character occurs in a given string.

A `HashMap<Character, Integer>` is used to store:

```text
Character → Frequency
```

For example, for:

```text
programming
```

the program counts the occurrence of each character.

### 🔑 Concepts Used

```text
HashMap
Character
String
toCharArray()
getOrDefault()
for-each loop
Map.Entry
```

### 💻 Sample Output

```text
Enter a string: programming

Character Frequencies:
p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1
```

> Note: `HashMap` does not guarantee a particular output order, so the order of characters may vary.

---

# 4️⃣ Digital Clock

### 📦 Package

```text
DigitalClock
```

### 📄 File

```text
src/DigitalClock/Main.java
```

### 📝 Description

This program creates a simple digital clock that continuously displays the current time.

The clock updates every second.

The time is displayed in the following format:

```text
hh:mm:ss AM/PM
```

### 🔑 Concepts Used

```text
Date
SimpleDateFormat
Thread.sleep()
while loop
Exception handling
```

### 💻 Sample Output

```text
Current Time:
03:45:27 PM
03:45:28 PM
03:45:29 PM
03:45:30 PM
```

The displayed time changes continuously while the program is running.

### ⚠️ Important

In `SimpleDateFormat`:

```text
hh → hour
mm → minute
ss → second
a  → AM/PM
```

`MM` represents **month**, while `mm` represents **minute**.

---

# 5️⃣ Age Calculator

### 📦 Package

```text
AgeCalculator
```

### 📄 File

```text
src/AgeCalculator/Main.java
```

### 📝 Description

This program accepts the user's date of birth and calculates the person's current age in:

```text
Years
Months
Days
```

The input date must follow:

```text
dd-MM-yyyy
```

Example:

```text
15-08-2002
```

### 🔑 Concepts Used

```text
SimpleDateFormat
Date
Calendar
Date parsing
ParseException
Exception handling
Input validation
```

### 💻 Sample Output

```text
Enter Date of Birth (dd-MM-yyyy): 15-08-2002

Age: 24 years, 2 months, 0 days
```

The exact result depends on the date on which the program is executed.

---

# 📁 Project Structure

```text
Java_Practical_11/
│
├── .gitignore
│
└── src/
    │
    ├── AgeCalculator/
    │   └── Main.java
    │
    ├── CharacterFrequency/
    │   └── Main.java
    │
    ├── DigitalClock/
    │   └── Main.java
    │
    ├── PalindromeChecker/
    │   └── Main.java
    │
    └── StringManipulation/
        └── Main.java
```

---

# 🛠️ Technologies Used

- Java
- IntelliJ IDEA
- Java Packages
- String API
- StringBuilder
- HashMap
- Date and Calendar API
- Loops
- Conditional Statements
- Exception Handling

---

# ▶️ How to Run

## Step 1: Clone the Repository

```bash
git clone https://github.com/rajsyntax/Java_Practical_11.git
```

## Step 2: Open the Project

Open the cloned project in **IntelliJ IDEA**.

## Step 3: Select JDK

Configure a suitable Java JDK in IntelliJ IDEA.

## Step 4: Run a Program

Open the required `Main.java` file and click:

```text
Run ▶
```

Each practical has its own `Main` class and can be executed independently.

---

# 🧠 Concepts Learned

## String Handling

- Creating and manipulating strings
- `length()`
- `toUpperCase()`
- `toLowerCase()`
- `contains()`
- `split()`

## StringBuilder

- Reversing strings
- Efficient string manipulation

## Collections

- Creating a `HashMap`
- Storing key-value pairs
- Counting frequencies using `getOrDefault()`

## Character Processing

- Detecting letters
- Detecting digits
- Detecting spaces
- Identifying vowels
- Identifying special characters

## Date and Time

- Working with `Date`
- Formatting dates using `SimpleDateFormat`
- Using `Calendar`
- Parsing date input

## Exception Handling

- Handling `ParseException`
- Handling `InterruptedException`
- Validating user input

---

# 🧪 Testing

The programs can be tested using different inputs.

### String Manipulation

```text
Hello Java 123!
```

### Palindrome Checker

```text
madam
```

```text
java
```

### Character Frequency

```text
programming
```

### Digital Clock

Run the program and observe the time updating every second.

### Age Calculator

```text
15-08-2002
```

Invalid input can also be tested:

```text
15/08/2002
```

The program should display an appropriate date-format error.

---

# 📌 Important Notes

- Each practical is placed inside its own Java package.
- Each practical contains its own `Main.java`.
- The programs are independent and can be executed separately.
- `.idea/` and `.iml` files are excluded using `.gitignore`.
- Java build files such as `.class` and `out/` are also ignored.
- The programs use beginner-friendly Java syntax.

---

# 🎯 Learning Objectives

After completing this practical, the student should be able to:

1. Understand Java String manipulation.
2. Practice reversing and comparing strings.
3. Implement palindrome checking.
4. Use `HashMap` for frequency counting.
5. Work with Java date and time classes.
6. Format and parse dates.
7. Calculate age using date information.
8. Practice exception handling.
9. Organize programs using Java packages.
10. Develop clean and reusable Java programs.

---

# 👨‍💻 Author

**RajSyntax**.
**Rajesh Maurya**

GitHub:  
https://github.com/rajsyntax

---

# 📚 Repository

**Java Practical 11**

This repository contains the source code for Java Practical 11 and demonstrates practical implementation of String manipulation, collections, and date/time handling in Java.
