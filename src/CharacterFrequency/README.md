# 🔤 Character Frequency

## 📌 Overview

This Java program counts how many times each character appears in a given String.

### Example

Input:

```text
hello
```

Output:

```text
h = 1
e = 1
l = 2
o = 1
```

---

## 📁 Project Structure

```text
CharacterFrequency/
└── Main.java
```

### Main.java

Contains the complete program for taking String input and calculating character frequency.

---

## 🧠 Concepts Used

- `Scanner`
- `String`
- `char`
- `HashMap`
- Loops
- User input

---

## 🔄 Program Flow

```text
Enter String
     ↓
Read each character
     ↓
Count character frequency
     ↓
Display result
```

---

## 💻 Sample Output

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

---

## 💡 Important Logic

```java
// Har character ko one by one check kar rahe hain
for (char ch : input.toCharArray()) {

    // Character ki frequency increase kar rahe hain
}
```

`HashMap` mein:

```text
Character → Frequency
```

Example:

```text
l → 2
```

---

## ▶️ How to Run

1. Open the project in IntelliJ IDEA.
2. Open:

```text
src/CharacterFrequency/Main.java
```

3. Run `Main.java`.
4. Enter a String.
5. Check the frequency in the console.

---

## 🎯 Learning Objective

This program helps understand:

- String processing
- Character handling
- `HashMap`
- Loops
- Frequency counting
