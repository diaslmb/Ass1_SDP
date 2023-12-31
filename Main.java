// This is a Java package declaration for the class Computer, which is in the "com.journaldev.design.model" package.
package com.journaldev.design.model;

// This is an abstract class named Computer.
public abstract class Computer {

    // These are abstract methods that must be implemented by subclasses to get information about the computer's hardware components.
    public abstract String getRAM(); // Get the RAM (Random Access Memory) of the computer.
    public abstract String getHDD(); // Get the HDD (Hard Disk Drive) of the computer.
    public abstract String getCPU(); // Get the CPU (Central Processing Unit) of the computer.

    // This is an overridden toString() method that provides a string representation of the computer's hardware components.
    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------

// This is a Java package declaration for the class PC, which is in the "com.journaldev.design.model" package.
package com.journaldev.design.model;

// This is a subclass named PC that extends the abstract class Computer.
public class PC extends Computer {

    // These are private instance variables to store the hardware components of the PC.
    private String ram; // Stores RAM (Random Access Memory).
    private String hdd; // Stores HDD (Hard Disk Drive).
    private String cpu; // Stores CPU (Central Processing Unit).

    // This is a constructor for the PC class that initializes its hardware components.
    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // These methods override the abstract methods from the Computer class to provide specific information about the PC's hardware components.
    @Override
    public String getRAM() {
        return this.ram; // Returns the RAM of the PC.
    }

    @Override
    public String getHDD() {
        return this.hdd; // Returns the HDD of the PC.
    }

    @Override
    public String getCPU() {
        return this.cpu; // Returns the CPU of the PC.
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------

// This is a Java package declaration for the class Server, which is in the "com.journaldev.design.model" package.
package com.journaldev.design.model;

// This is a subclass named Server that extends the abstract class Computer.
public class Server extends Computer {

    // These are private instance variables to store the hardware components of the server.
    private String ram; // Stores RAM (Random Access Memory).
    private String hdd; // Stores HDD (Hard Disk Drive).
    private String cpu; // Stores CPU (Central Processing Unit).

    // This is a constructor for the Server class that initializes its hardware components.
    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // These methods override the abstract methods from the Computer class to provide specific information about the server's hardware components.
    @Override
    public String getRAM() {
        return this.ram; // Returns the RAM of the server.
    }

    @Override
    public String getHDD() {
        return this.hdd; // Returns the HDD of the server.
    }

    @Override
    public String getCPU() {
        return this.cpu; // Returns the CPU of the server.
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------

// This is a Java package declaration for the class ComputerFactory, which is in the "com.journaldev.design.factory" package.
package com.journaldev.design.factory;

// Import statements to include necessary classes.
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;

// This is a factory class named ComputerFactory.
public class ComputerFactory {

    // This is a static method that creates and returns an instance of a Computer based on the provided type and hardware components.
    // It takes the following parameters:
    // - type: A string indicating the type of computer to create ("PC" or "Server").
    // - ram: A string representing the RAM (Random Access Memory) of the computer.
    // - hdd: A string representing the HDD (Hard Disk Drive) of the computer.
    // - cpu: A string representing the CPU (Central Processing Unit) of the computer.
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        // Check if the type is "PC" (case-insensitive) and create a PC instance if so.
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        }
        // Check if the type is "Server" (case-insensitive) and create a Server instance if so.
        else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        
        // If the type is neither "PC" nor "Server," return null.
        return null;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------

// This is a Java package declaration for the class TestFactory, which is in the "com.journaldev.design.test" package.
package com.journaldev.design.test;

// Import statements to include necessary classes.
import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

// This is a class named TestFactory that contains the main method for testing the computer factory.
public class TestFactory {

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Create a PC instance using the ComputerFactory and provide the hardware components.
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");

        // Create a Server instance using the ComputerFactory and provide the hardware components.
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        // Print the configuration of the PC and Server using the toString() method of the Computer class.
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------

// This is an abstract class named Computer, which serves as a base class for computer-related classes.
public abstract class Computer {

    // These are abstract methods that must be implemented by subclasses to get information about the computer's hardware components.
    public abstract String getRAM(); // Get the RAM (Random Access Memory) of the computer.
    public abstract String getHDD(); // Get the HDD (Hard Disk Drive) of the computer.
    public abstract String getCPU(); // Get the CPU (Central Processing Unit) of the computer.

    // This is an overridden toString() method that provides a formatted string representation of the computer's hardware components.
    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}

// This is a concrete class named PC that extends the Computer abstract class and provides specific implementations for hardware components.
public class PC extends Computer {

    // These are private instance variables to store the hardware components of the PC.
    private String ram; // Stores RAM (Random Access Memory).
    private String hdd; // Stores HDD (Hard Disk Drive).
    private String cpu; // Stores CPU (Central Processing Unit).

    // This is a constructor for the PC class that initializes its hardware components.
    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // These methods override the abstract methods from the Computer class to provide specific information about the PC's hardware components.
    @Override
    public String getRAM() {
        return this.ram; // Returns the RAM of the PC.
    }

    @Override
    public String getHDD() {
        return this.hdd; // Returns the HDD of the PC.
    }

    @Override
    public String getCPU() {
        return this.cpu; // Returns the CPU of the PC.
    }
}

// This is a concrete class named Server that extends the Computer abstract class and provides specific implementations for hardware components.
public class Server extends Computer {

    // These are private instance variables to store the hardware components of the server.
    private String ram; // Stores RAM (Random Access Memory).
    private String hdd; // Stores HDD (Hard Disk Drive).
    private String cpu; // Stores CPU (Central Processing Unit).

    // This is a constructor for the Server class that initializes its hardware components.
    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // These methods override the abstract methods from the Computer class to provide specific information about the server's hardware components.
    @Override
    public String getRAM() {
        return this.ram; // Returns the RAM of the server.
    }

    @Override
    public String getHDD() {
        return this.hdd; // Returns the HDD of the server.
    }

    @Override
    public String getCPU() {
        return this.cpu; // Returns the CPU of the server.
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------

// This is a Java package declaration for the package "com.journaldev.design.abstractfactory."
package com.journaldev.design.abstractfactory;

// Import statement to include the Computer interface.
import com.journaldev.design.model.Computer;

// This is an interface named ComputerAbstractFactory, which defines a contract for creating instances of Computer objects.
public interface ComputerAbstractFactory {

    // This method is used to create a Computer object, but the specific implementation is left to the implementing classes.
    public Computer createComputer();
}
-----------------------------------------------------------------------------------------------------------------------------------------

// This is a Java package declaration for the class PCFactory, which is in the "com.journaldev.design.abstractfactory" package.
package com.journaldev.design.abstractfactory;

// Import statements to include necessary classes.
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;

// This is a concrete factory class named PCFactory that implements the ComputerAbstractFactory interface.
public class PCFactory implements ComputerAbstractFactory {

    // These are private instance variables to store the hardware components of the PC.
    private String ram; // Stores RAM (Random Access Memory).
    private String hdd; // Stores HDD (Hard Disk Drive).
    private String cpu; // Stores CPU (Central Processing Unit).

    // This is a constructor for the PCFactory class that initializes its hardware components.
    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // This method implements the createComputer() method defined in the ComputerAbstractFactory interface.
    // It creates and returns an instance of the PC class with the specified hardware components.
    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------

// This is a Java package declaration for the class ServerFactory, which is in the "com.journaldev.design.abstractfactory" package.
package com.journaldev.design.abstractfactory;

// Import statements to include necessary classes.
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.Server;

// This is a concrete factory class named ServerFactory that implements the ComputerAbstractFactory interface.
public class ServerFactory implements ComputerAbstractFactory {

    // These are private instance variables to store the hardware components of the server.
    private String ram; // Stores RAM (Random Access Memory).
    private String hdd; // Stores HDD (Hard Disk Drive).
    private String cpu; // Stores CPU (Central Processing Unit).

    // This is a constructor for the ServerFactory class that initializes its hardware components.
    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // This method implements the createComputer() method defined in the ComputerAbstractFactory interface.
    // It creates and returns an instance of the Server class with the specified hardware components.
    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------

// This is a Java package declaration for the class ComputerFactory, which is in the "com.journaldev.design.abstractfactory" package.
package com.journaldev.design.abstractfactory;

// Import statements to include necessary classes.
import com.journaldev.design.model.Computer;

// This is a factory class named ComputerFactory.
public class ComputerFactory {

    // This is a static method that takes a ComputerAbstractFactory as a parameter and uses it to create a Computer object.
    // The specific implementation of the Computer object is determined by the provided factory.
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------

// This is a Java package declaration for the class TestDesignPatterns, which is in the "com.journaldev.design.test" package.
package com.journaldev.design.test;

// Import statements to include necessary classes.
import com.journaldev.design.abstractfactory.PCFactory;
import com.journaldev.design.abstractfactory.ServerFactory;
import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

// This is a class named TestDesignPatterns that contains a main method to demonstrate the use of design patterns.
public class TestDesignPatterns {

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Call the testAbstractFactory method to demonstrate the Abstract Factory design pattern.
        testAbstractFactory();
    }

    // This method demonstrates the Abstract Factory design pattern.
    private static void testAbstractFactory() {
        // Create a PC instance using the Abstract Factory and provide the hardware components via the PCFactory.
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));

        // Create a Server instance using the Abstract Factory and provide the hardware components via the ServerFactory.
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

        // Print the configuration of the PC and Server using the toString() method of the Computer class.
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------