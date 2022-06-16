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

# What is a Class

# What is an Object

# What is Abstraction

# https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/