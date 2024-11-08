# E-Commerce System Using Software Design Patterns

## Creators
:scroll:	 **Group**: SE-2303  
**Members**: 
- :smiley_cat: Yerniyaz Balgabayev
- :robot: Suleymen Maulenuly

This project is a demonstration of an e-commerce system built with several software design patterns. It shows how design patterns can be used to make code more modular, readable, and maintainable. The implemented patterns include **Singleton**, **Factory**, **Observer**, **Command**, **Facade**, and **Adapter**.

## Table of Contents
- [Overview](#overview)
- [Design Patterns](#design-patterns)
- [Model-View-Controller (MVC) Architecture](#model-view-controller-mvc-architecture)
- [Project Structure](#project-structure)

## Overview
This system simulates a basic e-commerce platform with functionalities such as creating products, placing orders, processing payments, and notifying customers. By applying different design patterns, the system achieves flexibility and modularity, allowing for easy expansion and modification.

## Design Patterns

1. **Singleton**: Ensures a single instance of `DatabaseConnection` for database management.
2. **Factory**: Creates product objects (`Electronics`, `Furniture`) using `ProductFactory`, allowing for easy addition of new product types.
3. **Observer**: Notifies `Customer` objects when the `Order` status changes, implementing a publish-subscribe mechanism.
4. **Command**: Encapsulates actions as command objects, enabling action management and flexibility for operations like `PlaceOrderCommand`.
5. **Facade**: Simplifies order processing by abstracting complex subsystems through the `OrderFacade`.
6. **Adapter**: Integrates an external payment service into the system using `PaymentAdapter`, converting it to the expected interface.

## Model-View-Controller (MVC) Architecture

While this project is not a full MVC implementation, its structure loosely follows MVC principles:

- **Model**: 
  - The **Model** includes classes representing the data and business logic, such as `Order`, `Customer`, `Product`, and `DatabaseConnection`.
  - These classes manage application data and communicate with other system parts.

- **View**: 
  - The **View** is represented by simple console output statements (`System.out.println`) that display order statuses and other messages.
  - In a real MVC implementation, this would be a graphical or web-based user interface.

- **Controller**: 
  - The **Controller** coordinates actions and manages user requests, represented by classes like `OrderFacade`, `OrderCommand`, `OrderInvoker`, and `PaymentAdapter`.
  - These classes process user actions, manage order processing, and control the workflow of the e-commerce system.

## Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   ├── DatabaseConnection.java      # Singleton for database connection
│   │   ├── ProductFactory.java          # Factory pattern for creating products
│   │   ├── Order.java                   # Observer pattern for order status
│   │   ├── Customer.java                # Observers notified by Order
│   │   ├── OrderFacade.java             # Facade pattern for order processing
│   │   ├── OrderInvoker.java            # Command pattern for order commands
│   │   ├── PaymentAdapter.java          # Adapter for external payment integration
│   │   └── ...                          # Additional pattern-based classes
└── test/
    └── Main.java                        # Demonstrates usage of patterns in the system
