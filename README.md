# Design Patterns Implementation

This project demonstrates the implementation of fundamental software design patterns in Java.

These patterns are widely used to create scalable, maintainable, and well-structured software systems.

---

# Implemented Design Patterns

## 1. Singleton Pattern

### Purpose
The Singleton Pattern ensures that a class has **only one instance** and provides a **global point of access** to it.

### When to Use
- Configuration managers
- Logging services
- Database connection managers
- Cache managers

### Example Idea
A class creates a **single object** and prevents other classes from creating additional instances.

### Key Characteristics
- Private constructor
- Static instance variable
- Public static getter method

### Benefits
- Controlled access to a single instance
- Saves memory
- Avoids inconsistent states

---

## 2. Composite Pattern

### Purpose
The Composite Pattern allows treating **individual objects and groups of objects uniformly**.

It is commonly used to represent **tree structures**.

### When to Use
- File systems
- UI component hierarchies
- Organization structures

### Structure

Component  
Defines the common interface.

Leaf  
Represents individual objects.

Composite  
Represents a group of components.

### Example Idea
A file system where:
- File = Leaf
- Folder = Composite

Both implement the same interface.

### Benefits
- Simplifies client code
- Supports recursive structures
- Makes tree structures easier to manage

---

## 3. Observer Pattern

### Purpose
The Observer Pattern defines a **one-to-many dependency** between objects.

When one object changes state, all its dependents are automatically notified.

### When to Use
- Notification systems
- Event systems
- Messaging systems
- UI updates

### Structure

Subject (Observable)  
Maintains a list of observers.

Observer  
Receives updates when the subject changes.

### Example Implemented
YouTube-like notification system.

- Channel = Subject
- Subscriber = Observer

When a channel uploads a video, all subscribers receive a notification.

### Benefits
- Loose coupling between objects
- Easy to extend
- Supports event-driven systems

---

## 4. Strategy Pattern

### Purpose
The Strategy Pattern defines a **family of algorithms**, encapsulates each one, and makes them **interchangeable at runtime**.

It allows the behavior of a class to be selected dynamically without using `if/else` conditions.

---

### When to Use
- Payment processing systems
- Sorting algorithms selection
- Authentication methods (OAuth, JWT, etc.)
- AI/ML model switching
- Business rule variations

---

### Structure

**Strategy Interface**  
Defines a common behavior for all strategies.

**Concrete Strategy**  
Implements a specific algorithm (e.g., Credit Card, PayPal).

**Context**  
Uses a strategy and allows switching it at runtime.

---

### Example Implemented
A payment system supporting multiple methods:

- Credit Card Payment
- PayPal Payment

Each method is implemented as a separate strategy and can be switched dynamically in `PaymentService`.

---

### Key Characteristics
- Eliminates conditional logic (`if/else`)
- Supports runtime behavior changes
- Follows Open/Closed Principle
- Promotes composition over inheritance

---

### Benefits
- Highly flexible and extensible
- Easy to add new algorithms without modifying existing code
- Improves code readability and maintainability
- Encourages clean architecture design

---

# Technologies Used

- Java
- Object-Oriented Programming
- Design Patterns

---

# Learning Outcome

This project helps understand:

- Core software design principles
- Object-oriented architecture
- Real-world use of design patterns
- How patterns improve maintainability and scalability
- How to design systems that are **open for extension but closed for modification**

# Author

Boutmedjet Abd elmoudjib  
Software Engineering Student
