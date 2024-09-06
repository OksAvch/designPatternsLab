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

- **Singleton Pattern**
    - Located at: `org.homework.server.ServerConfig`
    - The `Singleton` pattern ensures that a class has only one instance and provides a global point of access to it. This is used for server configuration management.

- **Visitor Pattern**
    - Located at: `org.homework.Visitor`
    - The `Visitor` pattern allows you to define new operations without changing the classes of the elements on which it operates.
