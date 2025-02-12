Here’s a README description for your GitHub project:

---

# Mobile SIM Selection Using Reflection API

## Overview

This Java project demonstrates the use of **Reflection API** to dynamically instantiate classes at runtime. It simulates a mobile device that can use different SIM cards (Airtel, Jio, VI) without hardcoding dependencies. Users can enter the name of a SIM provider at runtime, and the application will instantiate the corresponding class dynamically.

## Features

- Implements a `Sim` interface with different telecom providers (`Airtel`, `Jio`, `VI`).
- Uses **Reflection API** to instantiate the class based on user input.
- Demonstrates **runtime polymorphism** and **loose coupling**.
- Simple and efficient **Object-Oriented Design**.

## File Structure

- **Sim.java** – Interface defining the `call()` method.
- **Airtel.java**, **Jio.java**, **VI.java** – Implementations of `Sim` interface.
- **Mobile.java** – Class that takes a `Sim` object and invokes the `call()` method.
- **user_class_reflec_api.java** – Main class that prompts user input and dynamically creates objects using Reflection.

## How to Run

1. Compile all Java files:
   ```sh
   javac *.java
   ```
2. Run the main class:
   ```sh
   java user_class_reflec_api
   ```
3. Enter a valid class name (e.g., `Airtel`, `Jio`, `VI`) when prompted.
4. The program will instantiate the corresponding class and execute its `call()` method.

## Example Output

```
Enter Sim 
Jio
Jio is calling
```

## Technologies Used

- Java
- Reflection API
- Object-Oriented Programming (OOP)

## Contribution

Feel free to fork this repository and submit pull requests for enhancements.

---

Would you like any modifications or additions to this? 🚀
