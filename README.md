# DCIT 201: Java Methods Assessment (Quiz 2)
**Name** : Apedo Godwin Mawulie Yaw
**StudentID Number** : 22375204

**Course:** DCIT 201 - Programming I  
**Language:** Java  
**Topics Covered:** Method Abstraction, Method Overloading, Modular Programming  

## 📖 Overview
This repository contains solutions for the "Methods & Modularity" assessment. The goal of these programs is to demonstrate core Java concepts including:
* **High-level logic flow** (managing worker methods).
* **Method Overloading** (using the same method name for different data).
* **Input Validation** and control flow.

---

## 📂 Project Structure

### 1. Grade Reporting System
**File:** `GradeReport.java`  
**Concept:** Method Abstraction (The "Manager" Pattern)

This program demonstrates how a high-level method can manage complex tasks by delegating work to smaller "helper" methods. It implements a grade processing pipeline:

* **`validateScore(double score)`**: The "Bouncer" - ensures scores are between 0-100.
* **`calculateLetterGrade(double score)`**: The "Calculator" - converts numbers to A-F grades.
* **`displayPerformanceMessage(char grade)`**: The "Messenger" - prints feedback.
* **`executeGradeReport(double score)`**: The "Manager" - coordinates the flow and handles errors.

**Key Learning:** How to write clean, modular code where each method has a single responsibility.

---

### 2. Class Average Calculator
**File:** `ClassAverageDemo.java`  
**Concept:** Method Overloading

This program demonstrates Java's ability to differentiate methods by their parameter lists (Polymorphism). It features three versions of the same method name:

1.  **Version 1:** Calculates average of **2 scores**.
2.  **Version 2:** Calculates average of **3 scores**.
3.  **Version 3:** Calculates average of an **Array of scores** (handling any number of inputs).

**Key Learning:** How to create flexible APIs that can handle different types of input data seamlessly.

---

## 🚀 How to Run

To run these programs locally, ensure you have Java installed.

**Running the Grade Report & Class Average Calculator:**
```bash
javac GradeReport.java
java GradeReport

javac ClassAverageDemo.java
java ClassAverageDemo
