# Sum of Digits Calculator (Java)

A simple Java console application that calculates the **sum of all digits** in a given integer.

## 📋 Features

- Accepts an integer input from the user
- Extracts and sums up each digit of the number
- Displays the total sum of digits

Example:  
Input → `345`  
Output → `Sum of Digits: 12` (since 3 + 4 + 5 = 12)

## 🚀 Getting Started

### Requirements

- Java Development Kit (JDK 8 or higher)

### How to Compile

```bash
javac SumofDigits.java
```

### How to Run

```bash
java SumofDigits
```

## 🖥️ Example

```
Enter a number
9876
Sum of Digits: 30
```

## 💡 How It Works

- Uses modulo `%` to get the last digit
- Uses division `/` to remove the last digit
- Repeats the process in a `while` loop until the number is reduced to 0

## 🧠 Possible Enhancements

- Add input validation for negative numbers
- Handle multi-digit numbers as strings for advanced processing
- Extend to support **sum of digits across multiple numbers**
- Allow repeated calculations in a single run

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
