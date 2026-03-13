# Design Patterns Implementation

This project demonstrates the implementation of three fundamental software design patterns in Java.

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

---

# Author

Boutmedjet Abd elmoudjib  
Software Engineering Student
