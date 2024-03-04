# Design Patterns in Java

---

## Introduction

---

Design patterns are techniques that can make software development smoother and more effective. It is like a set of tools that can help you solve programming challenges in one of the best ways possible.

Each pattern we'll discuss is like a unique piece of a puzzle that when combined, these pieces form a complete picture of how to tackle common software development challenges. By understanding and applying these patterns, you'll be equiped to write cleaner, more flexible and easier to maintain code.

### Behavioral Patterns

These design patterns focus on the behavior of classes and objects, allowing flexible communication between them.

- [Chain of Responsibility](#chain-of-responsibility)
- [Strategy](#strategy)

### Creational Patterns

These design patterns provide ways to create objects, aiming to make the creation process more flexible and robust.

- [Abstract Factory](#abstract-factory)
- [Factory](#factory)
- [Singleton](#singleton)

### Structural Patterns 

These design patterns are concerned with the composition of classes and objects to form larger structures.

- [Adapter](#adapter)

## Chain of Responsibility

---

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain of responsibility.

**Applicability**
- When is expected to process different kinds of requests in various ways, but the type of requests and sequences are unknown at the moment.
The patterns are flexible and lets you link the handlers into one big chain, asking each handler whether it can process it or not. At the end, all handlers get a chance to process the request.
- When it's mandatory to execute multiple handlers in a certain order. We can link the handlers in the chain in any order, so that everything passes through the chain exactly as desired. 
- When the order are supposed to change at runtime. If you provide setters for a reference field inside the handler classes, you'll be able to remove, insert or reorder handlers dynamically.

**Pros:**
- Reduces coupling between objects - Single Responsibility Principle.
- Possibility to manipulate (introduce new handlers, delete or edit existing handlers) without breaking the existing client code - Open/Closed Principle.
- Allows for easy addition or removal of objects in the responsibility chain.

**Cons:**
- Can be difficult to debug and understand the execution order.

## Strategy

---

The Strategy pattern defines a family of algorithms, encapsulates each one of them, and makes them interchangeable. This allows the algorithm to vary independently of the clients that use it.

**Pros:**
- Promotes flexibility by allowing the algorithm to vary independently of the client.
- Facilitates the addition of new algorithms without modifying existing code.

**Cons:**
- Can increase code complexity by introducing multiple classes.

## Abstract Factory

---

The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

**Pros:**
- Promotes encapsulation of the object creation process.
- Facilitates the substitution of entire families of products.

**Cons:**
- Can be difficult to extend to support new types of products.

## Factory

---

The Factory pattern allows the creation of objects without specifying the exact class of object that will be created. It provides an interface to create objects in a superclass but allows subclasses to alter the type of objects that will be created.

**Pros:**
- Promotes encapsulation of object creation.
- Facilitates the addition of new types of objects without modifying existing code.

**Cons:**
- Can lead to a complicated class hierarchy.

## Singleton

---

The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.

**Pros:**
- Ensures that a single instance of the class is shared globally.
- Provides a global access point for the unique instance.

**Cons:**
- Can make unit testing difficult due to dependence on the global instance.
- Can be difficult to extend or modify to support multiple instances.

## Adapter

---

The Adapter pattern converts the interface of a class into another interface that the client expects to find. It allows classes with incompatible interfaces to work together.

**Pros:**
- Enables interoperability between classes with incompatible interfaces.
- Helps maintain code cohesion by avoiding changes to existing classes.

**Cons:**
- Can lead to additional complexity by introducing extra adapters.
