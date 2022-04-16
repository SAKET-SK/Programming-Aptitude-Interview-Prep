Java is a programming language and computing platform. It hits the top list of all the programming languages and has a wide range of job opportunities. The following Java Interview Questions for Freshers have been created specifically to get you familiarize with the nature of the question you can experience during your interview for the Java Programming Language subject. If you are interested to learn the language, Java Training in Chennai at FITA Academy is the right place for you to explore your career.

1. What are the different access specifiers for Java classes?
Access classifiers are said to be the keywords that are used before a class name which refers the access scope in Java. The below types of access classifiers is highly important and also frequently asked Java Interview Questions.
public: field, method, class is accessible from anywhere.
protected: field and method can be accessed from the same class to where they belong or from subclasses, and from same package class, but not from outside.
default: field, method, the class can be accessed from the same package only and not from outside of the native package.
private: field, the method can be accessed from the same class to where they belong.


2. What is the difference between an Inner class and a Subclass?
It is a Core Java Interview Questions, when you are a beginner go through the answer carefully.
An inner class has been nested within the other class. An inner class has access rights for the class that is nesting it and can access all methods and variables that are defined in the outer class.
A subclass inherits from the other class known as the superclass. Sub-class can access all protected and public fields and methods of its superclass.

3. What is known as data encapsulation and explain it’s significance?
Encapsulation is the concept which is asked frequently in the most Core Java Interview Questions for Freshers.
Encapsulation is said to be a concept in Object Oriented Programming for combining methods and properties in a single unit. Encapsulation helps the programmers in following a modular approach for the software development as each object has its unique set of variables and methods and serves its functions independent of other objects. Encapsulation is also used for data hiding purpose.

4. What is the purpose of static variables and static methods?
When there is a need to share a variable or a method between multiple objects of a class rather than creating separate copies for each object. To make a variable or method shared for all objects, we use.

5. What is called Loops in Java? What are the three types of loops?
This is a Java Basic Interview Questions to know mandatorily before attending any interviews.
Looping is used in programming to implement a statement or a statement block repeatedly. There are three types of loops in Java:
a. For Loops:
For loops are used in java to implement statements regularly for a given no of times. For loops are used when no of times to implement the statements is refer to the programmer.
b. while Loops:
While loop is used if certain statements require being implemented regularly until a condition is satisfied. The condition is tested first before implementation of statements in while loops.
c. Do While Loops:
Do while loop is similar to while loop with an only difference which condition is examined after implementation of statement blocks. Thus in do while loop case, statements are implemented at least once.

6. What is a singleton class? Give an example
In Java, a singleton class can have only one instance and thus all its variables and methods belong to one instance. The concept of a singleton class is used for the situations while there is a requirement to limit the no of objects for a class.
The good example of singleton usage scenario is while there is a limit of having an only single connection to a database due to some limitations of the driver or any licensing issues.

7. Explain the difference between break and continue statement?
When you are asked to explain Break and Continue concept in Java Interview Questions for Freshers, I suggest you to give examples to attract the interviewer.
Break and continue statements are the two main keywords used in loops. When a break keyword is used in a loop, instantly the loop is broken while when continue keyword is used, the current iteration is broken and the loop continues with the next iteration.
When counter reaches 4, loop is broken in the below example.
    
For (counter=0; counter<10; counter++)
System.out.println(counter);
if (counter==4) {
break;
}}

When counter reaches 4, loop just jumps to the next iteration in the below example and after the continue keyword any statements are skipped for the current iteration.
   
for (counter=0; counter<10; counter++)
system.out.println(counter);
if (counter==4) {
continue;
}
system.out.println(“This will not get printed when counter is 4”);
}

8. What is known as infinite loop? Explain how infinite loop is declared?
An infinite loop runs infinitely and without any condition. An infinite loop may be broken by explaining any breaking logic in the statements blocks body.
Infinite loop is proclaimed as follows
    
for (;;)
{
// Statements to execute
// Add any loop breaking logic
}

9. What is known as a final keyword in Java? Give an example
A constant is proclaimed using the keyword final in Java. The value may be assigned once and after the assignment, the value of a constant cannot be changed.
A constant with the name const_val has been assigned and declared a value in the below example:

Private Final int const_val=100
It cannot be overridden by the subclasses if a method is declared as final. This method is considered to be faster than any other method because they have been resolved at the compiled time.
It can’t be subclassed, when a class is declared as final. E.g., integer, string, and other wrapper classes.

10. Explain the difference between float and double variables in Java?
Float always takes about 4 bytes in memory while double takes about 8 bytes in memory in Java. The float is said to be single precision floating point decimal number and the double is the double precision decimal number.

11. How will you generate random numbers in Java?
You can generate random numbers using Math.random() in the range which is greater than or equal to 0.1 and less than 0.1 and also by using Random class in package java.util.

12. What is known as a ternary operator? Provide an example.
Based on a Boolean value evaluation, Ternary operator is also called conditional operator which is used to make the decision that value to assign to a variable.
If rank is 1, the status is assigned a value of “Done” else “Pending” in the below example.
     
public class conditionTest {
public static void main(string args[]) {
string status;
int rank = 3;
status = (rank = = 1) ? “Done” : “Pending”;
System.out.println(status);
} 
}

13. What is known as the base class in Java from which all the classes are derived?
Java.lang.object

14. What is a default switch case? Give an example
The default case is implemented when no other switch condition matches in a switch statement. The default case is referred as an optional case.
It may be declared only once all the other switch cases have been coded.

When score is not 1 or 2, default case is used in the below example:
     
public class switchExample {
int score=4;
public static void main(String args[]) {
switch (score) {
case 1:
system.out.println(“Score is 1”);
>break;
case 2:
system.out.println(“Score is 2”);
break;
default:
system.out.println(“Default Case”);
}
}
}

15. What are known as Java Packages? What is the significance of packages?
The package is referred to the collection of interfaces and classes that are bundled together as they are relevant to each other in Java. Use of package helps the developers to modularize the code and assemble the code for proper re-use. Once the code is packed in packages, it may be imported into other classes and used.

16. Does main() method in java return any data?
main() method cannot return back any data and thus, it is always declared with a void return type in Java.

17. Explain the difference between an Interference and Abstract Class in Java.
The foremost difference between an interference and abstract class is that interference may only possess public static methods declaration with no concrete implementation when an abstract may have members with any access specifiers (private, public etc) without or with the concrete implementation.
Other key difference in use of interfaces and abstract class is that a class which executes an interface should execute all the interface methods when a class that inherits from an abstract class that doesn’t need the implementation of superclass methods.
A class can execute multiple interfaces but it may extend only one abstract class.

18. Are we able to declare a class as Abstract class without having any abstract method?
Yes, using the abstract keyword before the class name even it doesn’t contain any abstract method, we can create an abstract class. Although, when a class contains even one abstract method, it should be revealed as abstract otherwise it gives an error.

19. Can importing a package imports the sub packages as well in Java?
While a package is imported in Java, its sub packages are not imported and the developer requires to separately import them if needed.
For e.g., when a developer imports a package university.*, all the classes in the package named university that are loaded but no other classes from its sub-package are loaded. The developer has to import it to load classes from its sub package as follows:

Import university.department.*

20. What is known as the interface performance implications over abstract classes?
Interfaces are said to be slower in performance when compared to the abstract classes as the extra indirections that are needed for interfaces. Another key factor for the developers in order to take into the consideration is which any class may extend the only single abstract class when a class can execute more interfaces.
Use of interfaces also puts an additional burden on the developers at any time an interface is executed in a class; the developer is forced to execute each and every interface method.

21. How will we pass an argument to a function through reference rather than pass value?
In Java, we are able to pass argument only by value to a function, and not by reference.

22. Can we state the main method of our class as private?
These Java Interview Questions for Freshers will brush up your knowledge and help you get through your interview easily.
The main method should be public static to run any kind of applications correctly. If the main method has been declared as private, the developer would not get any compilation error, although, it’ll not get implemented and will provide a runtime error.

23. When are we supposed to use serialization?
It is one of the Core Java Interview Questions which is asked frequently.
Serialization has been used when data requires being transmitted through the network. With serialization, state of the object is converted and saved into a byte stream. The byte stream is transferred through the network while the object is recreated at the destination.

24. How can an object be serialized in java?
In Java, an interface using the name serialization is executed by the class in order to change an object into byte stream through serialization. Almost all the objects of a class executing serializable interface get serialized, and state is stored in the byte stream.
 
25. Is there any method to skip finally exception block still if some exception happens in the exception block?
If an exception is increased in the Try block, manage passes to catch block if it exists or to finally block. Finally, block is implemented always while an exception happens and the only method to avoid implementation of any statements in finally block is by terminating the code powerfully by writing following code line at the end of try block:

1 System.exit(0);

26. Is it mandatory for a Try block to be followed by a Catch block in Java for Exception handling?
This is one of the Java Basic Interview Questions to know before attending an interview.
Try block requires being followed by either Catch block or Finally block or both. Any exception thrown from try block requires being either get caught in the catch block or else any particular tasks to be executed before the termination of code is placed in the Finally block.

27. Will a class contain multiple constructors?
Yes, a class comprises of multiple constructors with various parameters. Which constructor receives used for the creation of object depends on the arguments passed during the object creation.

28. When is the class constructor invoked?
Every time an object is built with new keywords, the constructor of a class has been invoked.
For E.g., two objects has been created with new keyword and thus, constructor is invoked two times in the following class.

     
public class const_example {const_example() {
}
public static void main(String args[]) {
const_example c1=new const_example();
const_example c2=new const_exam
}
}

29. In the below mentioned example what can be the output?
    
public class superclass {
public void displayResult() {
system.out.println(“Printing from superclass”);
}
}
public class subclass extends superclass {
public void displayResult () {
system.out.println(“Displaying from subclass”);
super.displayResult();
}
public static void main(String args[]) {
subclass obj=new subclass();
obj.displayResult();
}
}

Output is:
    
Displaying from subclass
Displaying from superclass

30. Is it possible for us to override static methods of a class?
No, static methods cannot be overrided. A static method does not belong to individual objects but to a class and is resolved at the compilation time. Still, if we attempt to override a static method, we will not receive a compilation error, nor the overriding impact while generating the code.

31. How many string objects can be created, in the below-mentioned example? Prepare these Java Programming Interview Questions well to crack an interview.
   
String s1="I am Java Expert”;
String s2="I am C Expert”;
String s3="I am Java Expert”;

Answer: Two objects of Java.Lang.String class has been created in the above example. s1 and s3 are references to the same object.

32. Can string be a data type in Java?
A string is not considered to be a primitive data type in java. While a string has been created in Java, it is actually Java.Lang.String class object which gets created. After string object creation, all the built-in String class methods are used on the string object.

33. What is the difference between Vector and an array?
Vectors are said to be dynamic in nature and hold the data of various data types while an array gathers data of a similar primitive type that is static in nature.

34. In java why strings are known as Immutable?
String objects are known immutable in java once the value is assigned to a string, it cannot be changed. If it is changed, a new object is created.

35. Define multi-threading
It is one of the significant and frequently asked Java Interview Questions
Multi-threading is said to be a programming concept to generate multiple tasks within a single program in a concurrent manner. Threads share a stack of the same process and running in parallel. It helps in performance enhancement of any program.

36. Why is the Runnable Interface used in Java?
Runnable interface has been used in java for executing multi-threaded applications. Java.Lang.Runnable interface is executed by a class to support the multi-threading.

37. When are numerous changes needed in data, which one must be a preference to be used? stringBuffer or string?
As StringBuffers are considered to be dynamic in nature, we are able to change the StringBuffer object values unline String that is immutable, it is a good choice always to use StringBuffer while data is changed too much. When we are using a string in such case, a new string object will be created for every data change which will be considered as an extra overhead.

38. What are the two methods of executing multi-threading in Java?
Multi-threaded applications are built in Java with any of the following two ways:

With Java.Lang.Runnable Interface. Classes execute this interface to authorize multi-threading. There occurs a Run() method in the interface that is executed.
Through writing a class which expands Java.Lang.Thread class.

39. How can garbage collection be done in Java?
If an object is not referenced anymore in Java, the garbage collection takes place and the object has been eradicated automatically. Java calls either Runtime.gc method or System.gc() method for automatic garbage collection.
 
40. What is the reason for using Break in each case of a Switch statement?
A break is said to be used after each and every case (except the last case) in a switch so that the code breaks after the valid case. It does not flow in the proceeding cases also.
When a break is not used after each case, all the cases that come after the valid case also get implemented results in the wrong outcomes.

These Java Questions and Answers help you enhance your desired career. Good luck!

41. How can we implement any code before the main method?
When we need to implement any statements even before object creations at load time of class, we use a static block of code in the class. Any kind of statements which is inside this static block of code gets implemented once at the time of loading the class even before object creation in the main method.

42. Will a class be a superclass and a sub-class at the same time? Give example.
When it uses the hierarchy of inheritance, a class can be a super class for other class and a sub class for other one at the same time.

In the below mentioned example, the continent class is said to be a sub class of the world class and its super class of the country class.
    
public class world {
………….
}
public class continent extends world {
……………
}
public class country extends continent {
…………….
}

43. How have the objects of a class been created if no constructor is defined in the class?
Successfully objects get created as a default constructor has been implicitly used for the object creation, even if no explicit constructor is defined in a Java class.
These Java Interview Questions for Freshers helps you enrich your knowledge and you can easily get through your interview. Learn the Essential knowledge to become a Java Developer with the support of Java Online Training. Experts will give the best coaching for all students.

44. How can we ensure that a resource is not used by the multiple threads simultaneously in multi-threading?
Access to the resources that are shared among multiple threads could be controlled with the synchronization concept in multi-threading. We can also ensure that only single thread can use the shared resource at one time while others can get control of the resource once it has become free from other one using it with synchronized keyword.

45. Can the constructor of a class be called more than once for an object?
When we create an object with the new keyword, automatically the constructor is called. It is called only one time for an object at the time of creating an object and thus, we cannot invoke the constructor again for an object after its creation.

46. There are two types of classes named classA and classB. Both the classes contain in the same package. Can classA private member can be accessed by an object of classB?
Private members of a class are not accessible outside the scope of that class and any other class even in the same package cannot access them.

47. Can a class have two methods with the same name?
It is said to be one among the Java Basic Interview Questions to know mandatorily before appearing for an interview.
We can define two methods with the same name in a class various number/type of parameters. Which method is to get invoked depends upon the parameters passed.

For e.g., in the below mentioned class, we have two print methods with same name but different parameters. The appropriate one will be called depending upon the parameters passed.
     
public class methodExample {
public void print() {
system.out.println(“print method without parameters.”);
}
public void print(string name) {
system.out.println(“print method with parameter”);
}
public static void main(String args[]) {
methodExample obj1= new methodExample();
obj1.print();
obj1.print(“xx”);
}
}

48. How can we create copy of a Java object?
It is one among the Core Java Interview Questions that have been asked frequently.
We can use the cloning concept to make a copy of an object. We make copies with the actual state of an object using clone.
Clone() is said to be a method of Cloneable interface and thus, Cloneable interface must be implemented for making object copies.

49. What is the advantage of using inheritance?
The key advantage with inheritance is reusability of code as inheritance enables sub classes to reuse the code of its super class. Polymorphism is considered to be another great advantage that allows new functionality to be introduced without effecting existing derived classes.

50. What is the default access specifier for variables and methods of a class?
Default access specifier for variables & method is package protected i.e.
Variables and class are available to any other class not outside the package but in the same package.

51. Give an example of Pointers use in Java class.
There are no pointers in Java. So we cannot use pointers concept in Java.
These Java Programming Interview Questions helps you in preparing well for the interview.

52. How can inheritance be restricted to a class so that no class can be inherited from it?
If we need a class not to be extended further by any class, we can use the keyword Final using the class name.
In the below mentioned example, Stone class is Final and cannot be extended

public Final Class Stone {
// Class methods and Variables
}

53. What is known as the access scope of Protected Access specifier?
It is one among the important Java Interview Questions which has been asked often during the interview.
When a variable or a method is declared with Protected access specifier, it becomes accessible in the same class, any other class of the same package as well as a sub class.

Modifier	CLASS	PACKAGE	SUBCLASS	WORLD
public	Y	Y	Y	Y
protected	Y	Y	Y	N
no modifier	Y	Y	N	N
private	Y	N	N	N

54. What is the difference between Queue and Stack?
Queue and Stack both are used as the placeholder for collecting data. The main difference between a queue and a stack is that stack is based on Last In First Out principle when a queue depends on First In First Out principle.

55. How can we disallow serialization of variables?
If we need certain variables of a class not to be serialized, we can use the keyword transient when declaring them. For e.g., the variable trans_var below is a transient variable and cannot be serialized.

public class transientExample {
private transient trans_var;
// rest of the code
}

56. How primitive data types can be used as objects?
Primitive data types such as int can be handled as objects with their respective wrapper classes. For e.g., an integer is said to be a wrapper class for primitive data type int. Similar to any other object, we can apply various methods to a wrapper class.

57. Which exception types are caught at compile time?
Checked exceptions can be caught at the program compilation time. Checked exceptions need to be handled with try catch block in the code to compile the code successfully.

58. Describe various states of a thread
In Java, a thread can be in either of the below mentioned states:
Ready: While a thread is created, it is in the Ready state.
Running: A thread currently being implemented is in running state.
Waiting: A thread which is waiting for another thread to free certain resources that is in waiting state.
Dead: A thread that has gone dead after implementation is in a dead state.

59. Can default constructor of a class be used even if an explicit constructor is defined?
Java offers a default no argument constructor if no explicit constructor has been defined in Java class. But if an explicit constructor is defined, the default constructor cannot be invoked and the developer can use only those constructors that are defined in the class.

60. Can a method be override with same method name and arguments but different return types?
The method overriding basic condition is that method arguments, name as well as return type need to be exactly same as that of the method being overridden. Thus, with different return type does not override a method.

61. What is the output of a below mentioned piece of code?
     
public class operatorExample {
public static void main (String args[]) {
int x=4;
system.out.println(x++);
}
}

Answer: Postfix++ operator has been used which returns the value first and then increments in this case. Thus it’s output will be 4.

62. Is it possible if a person declares that he successfully compiled a java class without even containing a main method in it?
Main method is said to be an entry point of Java class and is needed for implementation of the program although, successfully a class gets compiled even if it does not contain a main method. It cannot be run though.
These Java Interview Questions for Fresher helps you get through the interview easily.

63. Can a non-static method be called from inside a static method?
Non-static methods have been owned by objects of a class and contain object level scope to call the non-static methods from a static block, a class object must be created first. Then these methods can be invoked with an object reference.

64. Mention the two environment variables which need to be set in order to run any kind of Java programs
It is one of the most common Java Interview Questions which has been asked during the interview.

Only once the Java programs can be implemented in a machine following the two environment variables are properly set:

PATH variable
CLASSPATH variable
Can we use a variable in Java without initialization?
When a variable is used in a code without prior initialization by a valid value in Java, the program does not compile and provides an error as no default value is allocated to variables in Java.

65. Can a constructor contain different name than a Class name in Java?
In Java, the constructor should contain same name similar to the class name and if the name is different, it does not act as a constructor and compiler think about it as a normal method.
Prepare these Java Interview Questions and Answers well to crack the interview

66. What will be the Round(3.7) output and Ceil(3.7) output?
Round(3.7) returns 4 and Ceil(3.7) returns 4.

67. Can a class in Java be inherited from more than one class?
A class in Java can be derived from only one class and not from multiple classes. Multiple inheritances are not supported by Java.

68. Can goto be used in Java to go to a particular line?
In Java, there is not goto keyword and java does not support this feature of going to a particular labeled line.

69. Can we start a dead thread again?
A thread that is in the dead state cannot be started again in Java. There is no way that a thread can be restarted.

70. Is the following class declaration correct?
This Java Programming Interview Questions provides you in depth knowledge in the subject before appearing for the interview.

Answer:

public abstract final class testClass
{
// Class methods and variables 
}

71. Is JDK needed on each machine to run a Java program?
JDK is development Java kit and is needed for development only and to run a Java program on a machine, JDK is not needed. But only JRE is required.

72. Define the difference between comparison done by equals method and == operator?
It is one of the frequently asked Core Java Interview Questions.
Equals() method has been used to compare the contents of two string objects and returns true if the two have same value while == operator compares the two string objects references in Java.
In the below mentioned example, equals() returns true as the two string objects contain same values. Although == operator returns false as both the string objects have been referencing to various objects:

public class equalstest {
public static void main(String args[]) {
String srt1 = “Hello World”;
String str2 = “Hello World”;
if (str1.equals(str2))
{// this condition is true
system.out.println(“str1 and str2 are equal in terms of values”);
}
if (str1==str2) {
//This condition is not true
system.out.println(“Both strings are referencing same object”);
}
else
{
// This condition is true
system.out.println(“Both strings are referencing different objects”);
}
}}

73. Is it possible to declare a method in Java class but give it’s implementation in another language code like C?
Yes, we can do this with native methods. In case of native method oriented development, we define the public static methods in our Java class without its execution and then execution is done in another language such as C separately.
It is one of the Java Basic Interview Questions which they often ask during the interview process.

74. Can a variable be static and local at the same time?
No, it is not possible, at the same time a variable cannot be static as well as local. Declaring a local variable as static provides compilation error.

75. Can an interface contain static methods?
Static methods cannot be overridden in any of the class when any methods in an interface are by default abstract which is supposed to be implemented in the classes being executing the interface. So in Java, it doesn’t make any sense to contain static methods in an interface in Java.
Take a glance at these Java Programming Questions which helps you brush up your knowledge in an effective way.

76. How the destructors are defined in Java?
There are no destructors in Java are defined in the class as there is no necessity to do so. Java has its own garbage collection mechanism that automatically does the job by deleting the objects when no longer referenced.

77. Can we change the value of any variable defined in the interface in a class implementing an interface?
No, we cannot change any variable value of an interface in the implementing class as all the variables have been declared in the interface are by default static, public, Final and final variables are similar to constants that cannot be changed later.
We offer you these Java Questions and Answers in order to help you enhance your knowledge.

78. Is it correct to say that a Java program never goes out of memory due to garbage collection feature in Java?
It does not ensure that a Java program will not move out of memory however automatic garbage collection has been provided by Java as there occurs a probability which java objects creation is being done at a rapid pace compared to garbage collection as a result in filling of all the available memory resources.
So, the garbage collection helps in minimizing the program chances moving out of memory but it does not ensure that.

79. Can we use any other return type rather using void for main method?
No, the main method of Java class can contain only void return type for the program to obtain successfully executed.
However, if you perfectly must return a value to at the main method completion, you can use System.exit(int status)

80. I need to use and re-reach an object once it has been garbage collected. How is it possible?
Once an object is destroyed by the garbage collector, it no longer exists on the heap and it cannot be accessed again. There is no way to reference it again.

