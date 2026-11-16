# ☕ Object-Oriented Programming — Lab Sheets

![Java](https://img.shields.io/badge/Java-OOP-ED8B00?logo=openjdk&logoColor=white)

My lab exercises for the **Object-Oriented Programming** course (Ajman University), written in **Java**.

## 🎯 Concepts covered

- Classes, objects, constructors and methods
- **Encapsulation** — `private` fields with `public` getters and setters
- **Inheritance and polymorphism** — superclasses and subclasses
- Exception handling
- Driver/tester classes for running and checking each exercise

## 📁 What's inside

All source files are in [`OOP- LABS/`](OOP-%20LABS).

| Files | Exercise |
|-------|----------|
| `Person`, `FullTimeEmployee`, `PartTimeEmployee`, `EmployeeDriver` | Employee hierarchy built on a shared `Person` superclass |
| `Doctor`, `surgeon` | Inheritance — a surgeon as a specialised doctor |
| `Student`, `Student1`, `StudentData`, `StudentDriver1` | Student classes with a driver program |
| `Book`, `BookReader` | Book class and a program that uses it |
| `Temperature`, `testTemperature` | Temperature class with a test program |
| `ExceptionExercise_1` | Exception handling |
| `Lab2`, `Lab9`, `Tester` | Individual lab exercises |

## ▶️ Running an exercise

```bash
cd "OOP- LABS"
javac *.java
java EmployeeDriver
```

Replace `EmployeeDriver` with any class that has a `main` method.

## 📄 License

See [LICENSE](LICENSE).
