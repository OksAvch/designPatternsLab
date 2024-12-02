# Design Patterns Practice Project
This project is created to explore and practice some of the GoF design patterns using Java.
The following patterns have been implemented within specific classes of the project:


## Implemented Design Patterns
- **State Pattern**
    - Located at: `org.homework.player.state.PlayState`
    - The `State` pattern allows an object to alter its behavior when its internal state changes. This pattern is used to manage player state transitions.

- **Observer Pattern**
    - Located at: `org.homework.printer.Observer`
    - The `Observer` pattern defines a one-to-many relationship between objects, where changes in one object automatically notify and update dependent objects.

- **Strategy Pattern**
    - Located at: `org.homework.printer.editor.EditStep`
    - The `Strategy` pattern allows a class behavior or its algorithm to be selected at runtime. This pattern is used to implement various editing steps in a flexible way.

- **Visitor Pattern**
    - Located at: `org.homework.Visitor`
    - The `Visitor` pattern allows you to define new operations without changing the classes of the elements on which it operates.

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
  - Located at: `org.homework.factorymethod.Bakery`
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