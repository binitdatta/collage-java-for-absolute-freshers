# Following is an Explanation of the ArrayLisy Program:

## What is an Interface in Java

```
- 1. An Interface in Java is like a Contract between an institution/Organization and a person
- 2. Like a Student signs up a Contract to attend classes, take exams and score minimum marks in the examms in order to be awarded the degree
- 3. Attending Classes, Taking Exams are the methods in the College Interface
- 4. The Student implements them by attending the actual classes and by taking the actual examms
- 5. Similarly when an employee joins an organization he/she signs up for going to work 5 days a week, performing as per expectations to be paid
```

## Now lets see what are the contract/methods between the 

```
package com.flek.list;

public interface MyArrayList {
    public void append(Object o);
    public void insertAt(int index, Object o);
    public void removeAt(int index);
    public Object getAt(int index);
    public int getSize();
    public MyArrayListIterator getIterator();
}

```

## What the contract means for the classes that will implements the MyList Interface

```
- 1. That the class should be able to accept an Object and add the object to the end of list
- 2. Second that the class should be able to accept an Object as an argument and a position the argument is to be inserted on and actually shift existing arguments rightwards to make place for the new argument to be inserted in the middle of the list
- 3. That the class should be able to remove an existing element in the list identified by the index
- 4. That the class 
```
