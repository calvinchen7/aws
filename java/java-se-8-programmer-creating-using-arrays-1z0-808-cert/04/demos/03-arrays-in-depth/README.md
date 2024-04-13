# Creating and Using Arrays (Java SE 8 Programmer I Certification 1Z0-808)

These examples and exercises are part of the course "Creating and Using Arrays (Java SE 8 Programmer I Certification
1Z0-808)" at [Pluralsight](https://www.pluralsight.com/).

## Arrays in Depth

In this module, you'll learn:

* Variable arguments (varargs) and what they have to do with arrays
* How to convert an array to a List or Set and vice versa
* How subtyping works with arrays
* That arrays are covariant, and what this means
* That arrays and generics don't work very well together, and why

### Examples

Take a look at the examples, which you can find in the package: `com.pluralsight.java8.arrays.examples`.

### Exercises

To really learn any subject, it's not enough to read a website, book or watch videos. You have to work with the subject
yourself!

To help you practice with arrays, there are exercises included, which you can find in the package:
`com.pluralsight.java8.arrays.exercises`.

To check if you have done the exercises correctly, you can run the included unit tests. You can find the tests in the
directory `src/test/java`, package `com.pluralsight.java8.arrays.exercises`.

An IDE such as IntelliJ will make it easy to run the tests: in the Project Explorer (on the left side), right-click one
of the test classes (such as `Exercise01Test`) and click "Run 'Exercise01Test'" from the popup menu.

### Running on the command line

This example project is a [Maven](https://maven.apache.org/) project. Apache Maven is a very widely used project
management tool for Java projects. Most Java IDEs, such as IntelliJ IDEA and Eclipse, understand Maven projects, so it
should be easy to open the project in your Java IDE.

If you want or need to work with the project from a terminal window or using the Windows command prompt or PowerShell,
then you can use the following commands to compile the code and run the unit tests. The unit tests will check if you've
successfully solved the exercises.

In the terminal, Windows command prompt or PowerShell, first use the `cd` command to go to the directory where you've
unzipped this project. Then use one of the following commands:

On Windows:

    mvnw.cmd clean package

On macOS or Linux:

    ./mvnw clean package

These commands will download Apache Maven if you haven't already installed, and then run Maven to compile the code and
run the unit tests.

If everything compiles without errors and all the tests succeed, the command will finish with a message that says
"BUILD SUCCESS".

To compile the code without running the unit tests, add the `-DskipTests` option:

On Windows:

    mvnw.cmd clean package -DskipTests

On macOS or Linux:

    ./mvnw clean package -DskipTests
