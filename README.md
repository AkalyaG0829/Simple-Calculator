# Simple Java Calculator

This is a basic Java console application that performs arithmetic operations: **Addition, Subtraction, Multiplication, and Division**. It takes input from the user and loops until the user decides to stop.

---

##  Features

- Supports **+, -, *, /** operations
- Handles division by zero with an error message
- Accepts both uppercase and lowercase confirmations (e.g., "yes", "Y", "1")
- Uses `Scanner` for user input
- Continues to operate in a loop until user chooses to exit

---

##  Concepts Used

- Java `Scanner` class
- `switch-case` for operator handling
- `do-while` loop for repeating the operation
- `charAt(0)` to get the first character of operator input
- String comparison with `.equals()`

---

## 🛠 How to Run

1. Save the code as `Calculator.java`
2. Open your terminal or command prompt
3. Navigate to the file location
4. Compile the program:
   ```bash
   javac Calculator.java
## Sample OutPut
PS C:\Users\AKALYA\OneDrive\Desktop\javapractive> javac Calculator.java

PS C:\Users\AKALYA\OneDrive\Desktop\javapractive> java Calculator.java

SIMPLE CALCULATOR!

You Can Perform Basic Arithmetic Operations: ADDITION, SUBTRACTION, MULTIPLICATION, and DIVISION.

Enter 1st Number: 15

Enter The Operator(+, -, *, /): +

Enter 2nd Number: 15

Addition: 30.0

Do You Want to Perform Another Calculation? (Yes/No): Yes

Enter 1st Number: 15

Enter The Operator(+, -, *, /): -

Enter 2nd Number: 10

Subtraction: 5.0

Do You Want to Perform Another Calculation? (Yes/No): yes

Enter 1st Number: 2

Enter The Operator(+, -, *, /): * 

Enter 2nd Number: 3

Multiplication: 6.0

Do You Want to Perform Another Calculation? (Yes/No): Y

Enter 1st Number: 12

Enter The Operator(+, -, *, /): /

Enter 2nd Number: 6

Division: 2.0

Do You Want to Perform Another Calculation? (Yes/No): 1

Enter 1st Number: 12

Enter The Operator(+, -, *, /): +

Enter 2nd Number: 12

Addition: 24.0

Do You Want to Perform Another Calculation? (Yes/No): No

Calculator Closed!

Thank You for Using the Calculator!
