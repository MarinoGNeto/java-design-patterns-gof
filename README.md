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

Strategy is a behavioral design pattern that define a family of algorithms, encapsulates each one of them, and makes them interchangeable. This allows the algorithm to vary independently of the clients that use it.

**Applicability**
- When you want to use different variants of an algorithm within an object and be able to switch between them during runtime. The Strategy pattern lets you indirectly alter the object's behavior at runtime by associating it wht different sub-objects which can perform things in different ways.
- When you have similar classes that only differ in the way they execute some behavior, this also reduces duplicate code.
- When you need to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context. The Strategy pattern lets you isolate the code, internal data, and dependencies from the rest of the code. The client can just get a simple interface to execute the algorithms and switch them at runtime.
- When you have a massive conditional statement that switches between the variants of the same algorithm. Instead of implementing all variants of the algorithm, the original object can just delegate execution to one of the classes that implement the original.

**Pros:**
- Promotes flexibility by allowing to swap algorithms used inside an object at runtime.
- Facilitates the addition of new algorithms without modifying existing code and context - Open/Closed Principle.
- Allow to isolate the implementation details of an algorithm from the code that uses it.
- Can replace inheritance with composition.

**Cons:**
- Can increase code complexity by introducing multiple classes.
- Clients must be aware of the differences between strategies to be able to select a proper one.
- A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm inside a set of anonymous functions. Then you could use these functions exactly as you’d have used the strategy objects, but without bloating your code with extra classes and interfaces.

## Abstract Factory

---

The Abstract Factory pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

**Applicability**
- When needs to work with various families of related products, but without depend on the concrete classes of those products. The Abstract Factory provides you with an interface for creating objects from each class of the product family. Creating with the interface, don't need to worry about creating the wrong variant of a product which does not match the products already created.
- When you have a class with a set of Factory Methods that blur its primary responsability. Considering Single Responsibility Principle, when a class deals with multiple product types, it is worth extracting its factory methods into a stand-alone factory class or a full-blown Abstract Factory implementation.

**Pros:**
- Promotes encapsulation of the object creation process.
- Facilitates the substitution of entire families of products.
- Allow to extract the product creation code into one place, making easier to support the code. - Single Responsibility Principle.
- Possibility to create new product variants without breaking existing client code - Open/Closed Principle.

**Cons:**
- Code may become more complex than it should be, since a lot of new interfaces and classes are introduced along with the pattern.

## Factory

---

The Factory pattern allows the creation of objects without specifying the exact class of object that will be created. It provides an interface to create objects in a superclass but allows subclasses to alter the type of objects that will be created.

**Applicability**
- When you don't now yet the exact types and dependencies of the objects your code should work with. The Factory pattern separates product construction code from the code that actually uses the product.
- When you want to save system resources by reusing existing objects instead of rebuilding them each time.

**Pros:**
- Facilitates the addition of new types of objects without modifying existing code - Open/Closed Principle.
- Easier to support, because you can move the product cration code into one specific place in the code - Single Responsibility Principle.

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
