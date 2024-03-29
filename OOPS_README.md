# What is Object Oriented Programming or OOPS

## Please review the following three words meaning

![Alt text](images/12.png?raw=true "Title")

![Alt text](images/13.png?raw=true "Title")

![Alt text](images/14.png?raw=true "Title")

``` 
- 1. We all know the Englsh meaning of the word Object 
- 2. Objects are living and non living beings that can seen touched, that can move, feel if living etc.
- 3. Oriented means when something aligns/positions itself against something else
- 4. In this case, Programming which is the act of training computers how to act on our behalf Oriented itself with Objects
- 5. Meaning Programming will borrow from the principles of living and non living objects and work like real life objects behave in their lives.
- 6. As Humans we are in someway or the other programmed ourselves.
- 7. Like if a bug bites us or we get bitten by a mosquito, our sense organs carry the signal to our brain
- 8. Our brains interpret the source of the pain as a bug, identifies the location and
- 9. Sends a signal to our hands to act to remove the bug or the mosquito
- 10. In this total human behavior there are multiple objects involved
- 11. Our skin which has nerve ends
- 12. Our eyes which locates the bug/mosquito
- 13. Our hands which takes action to remove the bug/mosquito
- 14. And Finally our Brain which orchestrates the entire sequence of actions
- 15. Now think about we are building a human like robot and want to train the robot in behaving similarly when a bug/mosquito comes its way
- 16. The robot does not have nay life and is a non living object
- 17. Thus, we are actually programming an object which is the Robot
- 18. When we program the object i.e. the Robot, we want to model the same organs like we mentioned in humans
- 19. The organs are Skin, Eyes, Hands and Brain. 
- 20. We will build each organ and make them send messages / signals to each other and act in a coordinated way like humans act
- 21. Thus, we can see Object Oriented Programming works with Objects , and is very much real life like
```

# Object Oriented Programming, however has some attributes that needs explanation before we further.

![Alt text](images/15.png?raw=true "Title")

# What is Encapsulation

``` 
- 1. I am an Object, a living one 
- 2. I contain other smaller objects like a heart, two kidneys, one liver, one pancreus and other organs
- 3. I also encapsulate those inner organs or keep in the capsule of my body/skin
- 4. We can say objects hide or encapsulate their some of their organs inside their body
- 5. A Vehicle is also an object encapsulates its engine and other parts
- 6. We take the same concept (we model Objects from real life in Object Oriented Programming, remember) to OOP
- 7. We determine what parts of an Object are hidden/kept private from the external world
- 8. Like if we model the Robot, we will keep some of its organs (electrinics in this case) private or hidden by its outer skin made of steel
- 9. Some of our organs are however visible like our eyes, face, hands etc.
- 10. These organs are public visible from outside.
- 11. If we now model an ATM machine Object, the cash would be its heart i.e. inner / hidden organ
- 12. Like a doctor can feel our heartbits with a stethosope , ATMs let users interact with it through the ATM Cards
- 13. Thus, Encapsulation is the practice of identifying, declaring and keeping things hidden but letting the hidden things interact with the world  
```
# What is inheritance

``` 
- 1. Why is everything related to Programming Objects so hard to explain
- 2. I can gurrantee that each and every concept that Object Oriented Programming uses today came from thousands of years of being used in real life
- 3. We inherited our jeans from our parents and grandparents
- 4. Rich People often inherit their parents wealth and businesses : 
- 5. Mr. Anil and Mukesh Ambani inherited their father late Dhirubhai Ambani's wealth and business
- 6. A Zebra has its stripes from its Zebra parents
- 7. A Tigon inherites genes from Tiger and Lion parents 
- 8. However, even though we inherit character attributes, looks and genes from our ancestors we are also unique
- 9. Thus inheritence which is so loudly now claimed to be an attributed of OOP, is actually a real life thing .
- 10. We programmers borrowed inheritence and applied it to OOP
- 11. Thus, if you understand how inheritence works in real life, you are half way through.
- 12. Now say you are modeling several Animals for a jungle game program including a Tiger, Several Deers, Elephant, Foxes, Rabbits, Trees, Herbs, Rivers, Lakes etc.
- 13. You know that Trees, Herbs are different from all the animals and you also know Rivers and Lakes are different from Trees, Herbs and Animals
- 14. At first you build programs for all the Animals separately like shown below

public class Tiger {

    private Heart heart; // writing private means we want to hide / encapsulate that property from the outside world like it happens in real life
    private String name;
    private Legs[] legs;
    private Eyes[] eyes;
    private Ear[] ears;
    .....
    
}

public class Fox {

    private Heart heart; // writing private means we want to hide / encapsulate that property from the outside world like it happens in real life
    private String name;
    private Legs[] legs;
    private Eyes[] eyes;
    private Ear[] ears;
    .....
    
}

public class Zebra {

    private Heart heart; // writing private means we want to hide / encapsulate that property from the outside world like it happens in real life
    private String name;
    private Legs[] legs;
    private Eyes[] eyes;
    private Ear[] ears;
    .....
    
}

public class Elephant {

    private Heart heart; // writing private means we want to hide / encapsulate that property from the outside world like it happens in real life
    private String name;
    private Legs[] legs;
    private Eyes[] eyes;
    private Ear[] ears;
    .....
    
}

- 15. Do you see how much duplication we are doing by writing 
```

![Alt text](images/16.png?raw=true "Title")

``` 
- 16. We all know from grade school that all of the above and others are Animals
- 17. Animals have several properties like they have Hands, Legs, Eyes, Ears, Hearts etc.
- 18. In this Jungle game, all above are four legged animals  

So we can do this

public class Animals {
    private Heart heart; // writing private means we want to hide / encapsulate that property from the outside world like it happens in real life;
    private Stomach stomach;
    private Eyes[] eyes;
    private Ear[] ears;
    ...
}

- 19. We use real life inheritence in OOP through the key word extends in Java

public class FourLeggedAnimal extends Animal {
    private Legs[] legs; // 4 legs
   
   ...
   
}

public class TwoLeggedAnimal extends Animal {
    private Legs[] legs; // 2 legs
   
   ...
   
}

public class Tiger extends FourLeggedAnimal {

    private String name;
    private String communicationMode; // Roar
    private int age;
    private String color;
    ...
    
    
}

- 20. Some attributes that are unique to the individual Tiger are mentioned in the child / subclass 

public class Zebra extends extends FourLeggedAnimal {

}

- 21. Child classes inherits all the properties and (methods we will see soon) of its parent class and can even change their behavior if needed at times.
- 22. Thus we saved work, space and are using an age old real life concept in OOP even though most people cannot relate to it when asked.

```
# What is Polymorphism

![Alt text](images/17.png?raw=true "Title")

``` 
- 1. As stated earlier, the domain of Object Oriented Programming borrows heavily from real life in general
- 2. Any general intorduction of Object Oriented Programming would cover the term Polimorphism but without describing how it borrows from real life polymorphisim
- 3. The importance establishing the link between real life polymorphism and Object Oriented polymorphism is that 
- 4. Students who do not understand Object Oriented Polymorphism understand real life polymorphism very well
- 5. Let us explain
- 6. In simple terms polymorphism explains how a generic behavior in a class i.e. Mammal exibit different behaviour in different members of that class.
- 7. Say A Deer , a Rabbit, a Tiger and a Cheetah all  knows how to run
- 8. So all of them share the running behaviour from their class Mammals
- 9. But each one of them specializes this running (or eating) behaviour as they please. 
- 10. Like they say A Cheetah runs for its food while a Deer runs for its life. 
- 11. Now think about again programming a Jungle Game using C++ or Java or C# as a programming languages all supporting OOPs
- 12. Your programming will reflect the behaviour and have a protected (method that can be overdidden by a subclass) in the super class Mammal
- 13. Similar behaviour extends to eating, making sounds where eating and making sounds belongs to the class Mammal but variety of eating habbits, differences of 
- 14. making sounds differentiates lower specifies such as Deer, Tiger, Cheetahs, Elephants and so on
- 15. Now lets realize from early childhood we all understand how animals share generic behavior and these generic behaviour i.e. eating/running
- 16. becomes more distinguished in specific members of Mammals
- 17. Once you understand this long standing example of polymorphism in our own very real life, computer science classes making it hard to understand
- 18. How polymorphism works in programming goes away.
- 19. All that is left to be understood is the syntax part which is easy,. The concept is already understood

Like this

public abstract class Mammal {

    // The word abstract means we cannot make a new living instance of that class
    // You can imagine our creator will not be able to create just a Mammal 
    // He/She has to choose what type of Mammam he/she wanted to create
    
    private Stirng name;
    private int age;
    private Eye[] eyes;
    private Ears[] ears;
    ....
    
    protected String run {
        // TODO override in a subclass
    }
    
    protected String eat { 
    
        // TODO override in a subclass
    }
    
    protected String makeSound() {
    
        // TODO override in a subclass
    }
}

public class Deer extends Mammal {

        @Override
        protected String getSound() {
            return "bellow!";
        }   
        
          @Override
        protected String run() {
            return "run for Life!";
        }   
        
          @Override
        protected String eat() {
            return "Grass, Leaves!";
        }   
}

public class Cheetah extends Mammal {

        @Override
        protected String getSound() {
            return "Roar, Chirp!";
        }   
        
          @Override
        protected String run() {
            return "run for Food!";
        }   
        
          @Override
        protected String eat() {
            return "Hunted Deers!";
        }   
}
```

# What is  Dynamic Linking or Late Binding

``` 
- 1. Dynamic Linking is something that belongs exclusively to programming language runtimes.
- 2. Say you are working as a Manager / Keeper in a Zoo garden
- 3. When a Deer bellow or a Tiger Rors you do not tell yourself that a Mammal has made a sound but you understands what type of mammal has made the sound.
- 4. In this case, please understand that we have written multiple computer files that contains the source code of the super class Mammal.java and the subclass Deer.java, Cheetah.java etc,
- 5. The Zoo MAnager in this case is the Programming Language Compiler i.e. Java Compiler and the Programming Langgaue Runtime i.e. Java Runtime
- 6. Say in our program we declare a variable
Mammal  deer = new Deer();
Mammal  cheetah = new Cheetah();

- 7. This is a special privilege in OOPs, there super class variable types can be assigned subclass object types.
- 8. Because ultimately in concept we know A Deer and a Cheetah indeed are Mammals
- 9. But the compiler and runtime understand that specific behaviour such as eating, running, making sounds etc have been overdidden and redefined by the Deer and the Cheetah
- 10. Thus, when the actual runtime see java statements like deer.run(); or cheetah.run(); it calls the overdidden methods of the class Deer and Cheetah respectively.
- 11. This decision about what exact version / definition of the method to call is made later in runtime rather than early in compile time.
- 12. Because this made decision is made dynamically , this process is called dynamic linking and also called late binding.
- 13. Why binding: Becase the runtime binds the call later during the actual runtime to the actual method 
- 14. In statement like Mammal deer = new Deer(), the Mammal is the Reference Type or you can Data Type but the Deer/Cheetah on the right side is the object type.
- 15. The Java Runtime (or C++/C# Runtime) checks if the Object type has overridden certain behavior/method in its class Deer.java/Cheetah/java etc. If it has, then the Java runtime calls the method / behavior of the object type which is more specific, not the reference type which is on the left. 
- 16. This determination is done later in the runtime and that is why it called Late Binding.
```

# What is a Class

``` 
- 1. One thing that I maintain is that the secret of understanding Information Technology Programming Languages / Frameworks is 
- 2. Command over the English Language!
- 3. Usually if we understand the true meaning of the "technical" word/jargon, we will easily understand the technology concept as well.
- 4. Lets try with Class
- 5. The first time I heard this word when I attended grade school for the first time
- 6. People used to ask us what Class are you studying in and we answered Class 1/2/3/4/5 and so on
- 7. Another thing that observed was that all students who were in the same class studied the same syllabus or have common study material.
- 8. So we understood that members of a certain Class shares some commanality i.e. material to study
- 9. Then we grew up and studied Classes and Species in Biology later
- 10. We then scientifically understood that members of a certain biological class shares character / physical attributes
- 11. Like all Mammals give births to their children, reptiles produce eggs, all herbs and trees produce oxygen etc.
- 12. Thus, when a programming language such as Java extends this natural concept of a Class to programming, it means the same thing.
- 13. If we create a Vehicle Class, members of the Vehicle class will share properties like 4 Tires, Two headlines, One Engines, and so on
- 14. As Programming enters different domains from gaming, to eCommerce, to Administration to Banking and so on, the natural living and non-living objects are 
- 15. Conceptualized as Classes and Objects in Java/C++/C#/GO/JavaScript etc.
- 16. A related concept is called Analysis or System Analysis and Design.
- 17. In System Analysis beforer writing programs or applications to solve a problem, we try to find what Classes represent that domain in real life
- 18. Once we find those Classes i.e. Nouns usually we then identify them as Java/C++/Go/JavaScript Classes.
```

# What is an Object

```
- 1. When Apple makes its iPhones its give a strict direction to the factories that makes iPhones about how to make the iPhones.
- 2. Where the components will fit in, the memory card, the SIM, the sound card, the microchips, the display all detailed specifcations are written in documents for training the factory workers who actually follow the documents to make the real iPhones.
- 3. We can say that Apple enginners are actually writing the specification, the Class to make iPhones.
- 4. When the factory workers follow the instructions to make the actual iPhones, they become real life Objects.
- 5. Now replace the factory workers with the Java Runtime Virtual Machine.
- 6. The Java Runtime VM reads the Class file like Mammal.java, Deer.java, Cheetah.java etc and loads them computer memory
- 7. When its sees instructions like Mammal deer = new Deer(), it is actual preserving real computer memory space for storing the data , name, etc for that Deer. 
- 8. When we create another Deer it the JVM reserves RAM for another Deer. Same for Cheetah.
- 9. Thus, Object is when we follow the Class definition written in .java files and reserve RAM space for specific instances of those Classes, we create an Object.
- 10. When the Cheetah hunts the Deer in real life, the Deer is no longer there.
- 11. Similarly, when the Program does not need the RAM spaces for Deers, it reclaims those spaces as computer memory is limited and shared.
- 12. This reclaiming of computer memory that was used for storing Objects, is called Garbaje Collection.
```

# What is Abstraction

```
- 1. The English meaning of the word Abstraction is providing simplified representation of a complex idea/object/process/concept etc.
- 2. Lets take an example like driving a Car
- 3. We drive a Car with its acclerator or has pedal, it break pedal and its sterring wheel.
- 4. When we press the Gas Peadal, the Car increases its speed
- 5. However, the Gas Pedal is connected to the Fuel supply which increases the suply of fuel to the engine which works harder to move the car wheel shaft more per minute, thereby moving the wheels more per minute, covering more distance in less time, thereby acclerarating the car.
- 6. The actual automobile enginnering involve much more complexity. 
- 7. Hovever to the drive the enginnering complexity is simplified or abstracted behind the Gas Pedal which the driver just press.
- 8. In all of Programming, we are bilding this kinds of simplified interfaces between the rest of the system and its users.
- 9. Because we are abstracting the complexity and its is one of the prime objective of programming , Abstraction is one of the four pillers of Object Oriented Programming.
```

# https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
