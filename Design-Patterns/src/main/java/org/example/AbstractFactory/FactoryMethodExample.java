package org.example.AbstractFactory;

// Document interface - Product
interface Document {
    void open();
    void save();
    void close();
}

// Concrete Products
class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document...");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document...");
    }
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document...");
    }

    @Override
    public void close() {
        System.out.println("Closing Word document...");
    }
}

class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Text document...");
    }

    @Override
    public void save() {
        System.out.println("Saving Text document...");
    }

    @Override
    public void close() {
        System.out.println("Closing Text document...");
    }
}

// Creator - Abstract Factory
abstract class DocumentCreator {
    // Factory Method
    public abstract Document createDocument();

    // Template method that uses the factory method
    public void editDocument() {
        // Create document using the factory method
        Document document = createDocument();

        // Work with the document
        document.open();
        System.out.println("Editing document...");
        document.save();
        document.close();
    }
}

// Concrete Creators
class PDFDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}

class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class TextDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}

// Client code
public class FactoryMethodExample {
    public static void main(String[] args) {
        System.out.println("Using PDF Document Creator:");
        DocumentCreator pdfCreator = new PDFDocumentCreator();
        pdfCreator.editDocument();

        System.out.println("\nUsing Word Document Creator:");
        DocumentCreator wordCreator = new WordDocumentCreator();
        wordCreator.editDocument();

        System.out.println("\nUsing Text Document Creator:");
        DocumentCreator textCreator = new TextDocumentCreator();
        textCreator.editDocument();
    }
}
