# 🕒 Digital Clock

## 📌 Overview
A simple Java program that displays the current time and updates it every second.

## 📁 Project Structure
```text
DigitalClock/
└── Main.java
```

## 🧠 Concepts Used
- `LocalTime`
- `DateTimeFormatter`
- `Thread.sleep()`
- Loop

## 💡 Logic
```text
Get Current Time
      ↓
Format Time
      ↓
Display Time
      ↓
Wait 1 Second
      ↓
Repeat
```

```java
// Current time ko get karke display kar rahe hain
LocalTime time = LocalTime.now();

// Clock ko 1 second ke liye wait kar rahe hain
Thread.sleep(1000);
```

## ▶️ Run
Open:

```text
src/DigitalClock/Main.java
```

Run `Main.java` in IntelliJ IDEA.

## 📤 Example
```text
Current Time: 10:35:42
```

## 🎯 Learning Objective
Understand Java's Date-Time API, time formatting, loops, and `Thread.sleep()`.
