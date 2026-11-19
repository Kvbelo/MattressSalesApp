# Mattress Sales Application (Java & Maven)

This repository contains a Java application developed for a local mattress company. The project is divided into two main components: a console-based reporting tool using arrays and interfaces, and a graphical user interface (GUI) for processing and logging individual sales.

## 🚀 Features

### 1. Console Sales Report (Question 1)
*   Uses a **single-dimensional array** to store product names.
*   Uses a **two-dimensional array** to store monthly sales data for three months across three products.
*   Calculates the total products sold, the average products sold, and identifies the most popular product based on highest sales.
*   Implements the `IProduct` interface.

### 2. GUI Sales Application (Question 2)
*   Built using **Java Swing**.
*   Captures Customer Name, Product Selection (via Combo Box), and Price.
*   Calculates **VAT (15%)**, **Commission (5%)**, and **Total Sale Amount** using the `ProductCalculations` class.
*   Displays a custom pop-up message summarizing the sale.
*   Appends the logged sale data to a local text file named `data.txt`.
*   Includes a fully functional menu bar (File -> Exit; Tools -> Process, Clear).

### 3. Unit Testing
*   Includes **JUnit 4** test cases to verify the mathematical logic.
*   Tests include verification of the VAT calculation, Total calculation, and Average Sales logic.

## 🛠️ Technologies Used
*   **Java (JDK)**
*   **Apache Maven** (for dependency management and build lifecycle)
*   **Java Swing** (for the GUI)
*   **JUnit 4** (for unit testing)

## 📂 Project Structure
All source files are located in the `<default package>` for easy execution:
*   `IProduct.java` / `IProductCalculations.java` (Interfaces)
*   `Product.java` / `ProductCalculations.java` (Logic classes)
*   `SalesReportApp.java` (Console app runner)
*   `MattressAppFrame.java` (GUI app runner)
*   `ProductCalculationsTest.java` (Located in `Test Packages`)

## ⚙️ How to Run

### Running the GUI Application
1. Open the project in NetBeans (or your preferred IDE).
2. Right-click on `MattressAppFrame.java`.
3. Select **Run File** (or press `Shift + F6`).
4. Enter a name, select a mattress, and type a price (e.g., `3500`). Click **PROCESS** to see the calculations and generate the `data.txt` file.

### Running the Console Report
1. Right-click on `SalesReportApp.java`.
2. Select **Run File**.
3. Look at the Output console at the bottom of your screen. Enter the sales numbers for each month as prompted.
4. The formatted report will automatically print once all data is entered.

### Running the Unit Tests
*   **In NetBeans:** Right-click `ProductCalculationsTest.java` -> **Test File**.
*   **Using Maven CLI:** Open a terminal in the project directory and run:
    ```bash
    mvn test
