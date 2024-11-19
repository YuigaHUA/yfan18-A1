# yfan18-A1 - Java Health Appointment Management System

## Overview
This project is a simple Java-based appointment management system for a health service. It demonstrates the use of key object-oriented programming concepts, such as **inheritance**, **polymorphism**, and the use of **collections** (ArrayList) to manage appointments dynamically.

## Features
- **Health Professional Management**: Manage different types of health professionals, including General Practitioners and Surgeons.
- **Appointment System**: Patients can book appointments with health professionals. Appointments are managed using an `ArrayList` for flexibility.
- **User Input Handling**: Allows users to interact with the system, including making and canceling appointments through a command-line interface.

## Technologies Used
- **Java**: The main programming language used to build the system.
- **Java Collections Framework**: Utilized `ArrayList` to manage appointments.
- **Object-Oriented Programming (OOP)**: Implemented inheritance, polymorphism, and encapsulation to create a structured and reusable codebase.

## How to Run the Project
1. **Clone the Repository**:
git clone https://github.com/yourusername/yfan18-A1.git

2. **Navigate to the Project Directory**:
    cd yfan18-A1

3. **Compile and Run the Project**:
- Use any Java IDE (e.g., VS Code, IntelliJ IDEA) or run the following commands in your terminal:
javac src/*.java java -cp src AssignmentOne

## Class Overview
- **HealthProfessional**: The base class for different types of health professionals.
- **GeneralPractitioner**: Extends `HealthProfessional` and adds specific attributes like `workingHours` and `patientLimit`.
- **Surgeon**: Extends `HealthProfessional` and adds an `operatingRoom` attribute.
- **Appointment**: Handles booking details, including patient information, time slots, and associated health professionals.
- **AssignmentOne**: Contains the main method to demonstrate the system functionality, including adding, printing, and canceling appointments.

## Key Concepts
- **Inheritance**: `GeneralPractitioner` and `Surgeon` classes inherit from `HealthProfessional`, showcasing code reuse and a logical hierarchy.
- **Polymorphism**: Methods in child classes (`GeneralPractitioner`, `Surgeon`) override base class methods, allowing dynamic method dispatch.
- **Dynamic Appointment Management**: Used `ArrayList` to store and manage appointments, supporting dynamic addition and removal of items.

## Demonstration
In this project:
1. Created health professional instances such as `GeneralPractitioner` and `Surgeon`.
2. Demonstrated polymorphism through method overriding in these child classes.
3. Managed appointments using an `ArrayList`, allowing for dynamic booking and cancellation of appointments.

## Future Improvements
- **Graphical User Interface (GUI)**: Develop a GUI to enhance user experience.
- **Database Integration**: Store appointment and health professional data in a database for persistence.
- **More Health Professional Types**: Extend the system to include other health professionals like dietitians, nurses, etc.
