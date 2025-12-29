A) Project Overview

This project is a Vehicle Management System in Java.
It shows inheritance, abstraction, composition, and aggregation.

There is an abstract class Vehicle.

There are three subclasses: Car, Motorcycle, Truck.

There is a Driver class for drivers.

You can start and stop vehicles, see vehicle info, and show driver info.
Inheritance makes code simpler and easier to use again.

B)Class Hierarchy
Vehicle (Abstract Class)

Fields: brand (String), year (int)

Constructor: sets brand and year

Abstract Methods:

startEngine()

stopEngine()

Concrete Method:

displayInfo() — prints brand and year

 Car (Subclass)

Extra Fields: doors (int), fuelType (String)

Methods: override startEngine() and stopEngine()

Constructor: uses super() doors, fuelType

 Motorcycle (Subclass)

Extra Field: hasSidecar (boolean)

Methods: override startEngine() and stopEngine()

Constructor: uses super(), hasSidebar

Truck (Subclass)

Extra Fields: capacity (double), numAxles (int)

Methods: override startEngine() and stopEngine()

Constructor: uses super(), capacity, numAxles

Driver Class

Fields: name (String), licenseNumber (String)

Methods: displayDriverInfo()

Relationships:

1)Composition: Each Vehicle has a Driver

2)Aggregation: One Driver can drive many vehicles


C)javac *.java
java Main



D) Screenshots

<img width="890" height="747" alt="image" src="https://github.com/user-attachments/assets/c0270cf9-baf9-4e9b-bd43-3594ac697a4a" />


E)Reflection

Inheritance made the design simpler because common features like brand, year, and engine methods are defined in the Vehicle superclass.
Method overriding helped customize behavior for Car, Motorcycle, and Truck without repeating code.

The protected access modifier allowed subclasses to access fields safely, while keeping them hidden from other classes.
Handling null references when assigning drivers to vehicles was a little challenging, but using proper checks solved this.

F)assignment2/

├── docs/

│   ├── screenshots/

│   ├── uml.md

│   └── uml-diagram.png

├── src/

│   ├── Car.java

│   ├── Driver.java

│   ├── Main.java

│   ├── Motorcycle.java

│   ├── Truck.java

│   └── Vehicle.java

├── README.md

└── .gitignore



G) Uml diagram

<img width="991" height="545" alt="image" src="https://github.com/user-attachments/assets/02af8951-349a-411f-b6dc-ca602b23e016" />


The UML class diagram was created using a UML diagram plugin that called Markdown.
The diagram clearly shows:

The inheritance relationship between Vehicle and its subclasses

The association between Vehicle and Driver

Fields, constructors, and overridden methods





