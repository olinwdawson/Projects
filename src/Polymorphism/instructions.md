
# AP CS A - Java OOP and Polymorphism Project

## Project Overview
In this project, you will create a Java program that models a **real-world object** using **inheritance and polymorphism**. You will:

1. Create a **base class** with at least three instance variables.
2. Create at least **two subclasses** that override methods for **polymorphism**.
3. Override **`toString()`** to display object details.
4. Override **`equals(Object o)`** to compare objects meaningfully.
5. Use an **ArrayList** to store objects and demonstrate polymorphism in a **tester class**.

---

## Project Requirements

### 1. Choose a Real-World Object
Pick an object that allows for meaningful subclasses. Some examples:

- **Book** → Novel, Textbook
- **Animal** → Dog, Cat
- **Bank Account** → CheckingAccount, SavingsAccount
- **Vehicle** → Car, Motorcycle
- **Employee** → Manager, Developer

---

### 2. Create a Base Class
Your base class must include:
- **At least three private instance variables**.
- **Getter methods** to access private variables.
- A `toString()` method that prints attributes.
- An **`equals(Object o)`** method to compare objects.
- A method that can be **overridden in subclasses** to demonstrate polymorphism.

#### Example Base Class (`Book`)
```java
public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void read() {
        System.out.println("Reading \"" + title + "\" by " + author);
    }

    @Override
    public String toString() {
        return "Book[Title: " + title + ", Author: " + author + ", Pages: " + pages + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Book) {
            Book other = (Book) o;
            return this.title.equals(other.title) && this.author.equals(other.author) && this.pages == other.pages;
        }
        return false;
    }
}
