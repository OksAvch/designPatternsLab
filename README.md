# Design Patterns Practice Project
This project is created to explore and practice some of the GoF design patterns using Java.
The following patterns have been implemented within specific classes of the project:


## Behavioral Patterns
- **State Pattern**
  - Located at: `org.homework.player.state.PlayState`
  - The `State` pattern allows an object to alter its behavior when its internal state changes. This pattern is used to manage player state transitions.
  - When:
    - you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
    - you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class’s fields.
    - you have a lot of duplicate code across similar states and transitions of a condition-based state machine.

- **Observer Pattern**
  - Located at: `org.homework.printer.Observer`
  - The `Observer` pattern defines a one-to-many relationship between objects, where changes in one object automatically notify and update dependent objects.
  - When:
    - changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically.
    - some objects in your app must observe others, but only for a limited time or in specific cases.

- **Strategy Pattern**
  - Located at: `org.homework.printer.editor.EditStep`
  - The `Strategy` pattern allows a class behavior or its algorithm to be selected at runtime. This pattern is used to implement various editing steps in a flexible way.
  - When:
    - want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
    - your class has a massive conditional statement that switches between different variants of the same algorithm.

- **Visitor Pattern**
  - Located at: `org.homework.Visitor`
  - The `Visitor` pattern allows you to define new operations without changing the classes of the elements on which it operates.
  - When: 
    - need to perform an operation on all elements of a complex object structure (for example, an object tree).
    - a behavior makes sense only in some classes of a class hierarchy, but not in others.
  
- **Chain of Responsibility Pattern**
  - Located at: `org.homework.chain`
  - The `Chain of Responsibility` pattern lets you pass requests along a chain of handlers. Upon receiving a request, each handler will either process the request or pass it to the next handler in the chain.
  - When: 
    - your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.
    - it’s essential to execute several handlers in a particular order.
    - the set of handlers and their order are supposed to change at runtime.

- **Command Pattern**
  - Located at: `org.homework.command`
  - The `Command` pattern lets you pass requests along a chain of handlers.
  - When:
    - you want to parametrize objects with operations.
    - you want to queue operations, schedule their execution, or execute them remotely; or to implement reversible operations.
  
- **Iterator Pattern**
  - Located at: `org.homework.iterator`
  - The `Iterator` pattern allows you to traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).
  - When: 
    - your collection has a complex data structure under the hood, but you want to hide its complexity from clients.
    - you want your code to be able to traverse different data structures or when types of these structures are unknown beforehand.

- **Memento Pattern**
  - Located at: `org.homework.printer.observer.EditInputMemento`
  - The `Mediator` pattern allows you to save and restore the previous state of an object without revealing the details of its implementation.
  - When: you want to produce snapshots of the object’s state to be able to restore a previous state of the object (applicable for Undo opereation and to Transactions roll back).

- **Template Method Pattern**
  - Located at: `org.homework.templatemethod`
  - The `Template Method` pattern defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
  - When: you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.

- **Mediator Pattern**
  - Located at: `org.homework.Mediator`
  - The `Mediator` pattern allows you to extract all the relationships between classes into a separate class, isolating any changes to a specific component from the rest of the components.
  - When: you need to extract all the relationships between classes into a separate class, isolating any changes to a specific component from the rest of the components.

### Creational Patterns
- **Abstract factory Pattern**
  - Located at: `org.homework.factory.PastryFactory`
  - The `Abstract factory` pattern allows you to produce families of related objects without specifying their concrete classes.

- **Singleton Pattern**
  - Located at: `org.homework.server.ServerConfig`
  - The `Singleton` pattern ensures that a class has only one instance and provides a global point of access to it. This is used for server configuration management.

- **Builder Pattern**
  - Located at: `org.homework.builder.Bakery`
  - The `Builder` pattern lets you construct complex objects step by step. 
 
- **Factory Method Pattern**
  - Located at: `org.homework.factorymethod.Bakery`
  - The `Factory Method` pattern lets you construct complex objects step by step. 

- **Prototype Pattern**
  - Located at: `org.homework.prototype.Bakery`
  - The `Prototype` pattern lets you copy existing objects without making your code dependent on their classes.

### Structural Patterns
- **Adapter Pattern**
  - Located at: `org.homework.adapter.Bakery`
  - The `Adapter` pattern allows objects with incompatible interfaces to collaborate.

- **Bridge Pattern**
  - Located at: `org.homework.bridge`
  - The `Bridge` pattern lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
  - Based on object composition. One of the dimensions should be extracted into a separate class hierarchy, so that the original classes will reference an object of the new hierarchy, instead of having all of its state and behaviors within one class.

- **Composite Pattern**
  - Located at: `org.homework.composite`
  - The `Composite` pattern lets you compose objects into tree structures and then work with these structures as if they were individual objects.

- **Decorator Pattern**
  - Located at: `org.homework.composite`
  - The `Decorator` pattern lets you compose objects into tree structures and then work with these structures as if they were individual objects.
  - When: you need to be able to assign extra behaviors to objects at runtime without changing the code that uses these objects and object structure.

- **Flyweight Pattern**
  - Located at: `org.homework.flyweight`
  - The `Flyweight` pattern lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.
  - When: your program must support a huge number of objects which barely fit into available RAM.

- **Proxy Pattern**
  - Located at: `org.homework.proxy`
  - The `Proxy` pattern controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
  - When: 
    - the app launches, you can delay the object’s initialization to a time when it’s really needed;
    - it is necessary to perform some actions before passing request to the service object;

- **Facade Pattern**
  - Located at: `org.homework.facade`
  - The `Facade` pattern provides a simplified interface to a library, a framework, or any other complex set of classes.
  - When: you need to have a limited but straightforward interface to a complex subsystem.