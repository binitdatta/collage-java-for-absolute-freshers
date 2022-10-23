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
- 4. That the class should be able to get and return an element from within the list at any given position.
- 5. That the class should be able to keep the size of the list and return that size when asked
- 6. That the class should be able to create and return a tool called an Iterator i.e. like a Binocular to look at distant objects in the list
```

## How do we tell Java that our class implements an Interface

### By adding the implements keyword and the name of the Interface after it

```
public class MyArrayList implements MyList {
```

## How do store the data and their current values inside the class

### By creating containers called member variables inside the class
### Like a solid object can stay on a solid surface but a liquid material such as water needs a bottle/glass/cup,
### Different types of data needs different types of containers inside the Java class

```
    private int currentCapacity = 8;
    private Object[ ] storage = new Object[8];
    private int size;

```

## How to take some actions when Java Creates a new Object of our Class

### By Creating a Special Method called a Constructor whose name is same as the name of the class itself

``` 
 public MyArrayList(){
        this.currentCapacity = 8;
        this.size = 0;
        this.storage = new Object[currentCapacity];
    }
```

## Visualize what happens when we create an Object of MyArrayList class


![Alt text](./images/18.png?raw=true "Title")


## What actions are we taking during the construction of the class object MyArrayList

### We are initializing the member variables with their initial values

## What is an Array

### An array is a contiguous set of boxes that are similar in size, form and shape
### A row of exactly same looking Townhomes or Row Homes is a real life example of an Array
### Arrays have fixed size like a Row of Townhomes or Row Homes has fixed number of Townhomes or Rowhomes
### Arrays store elements within their multiple boxes and identify each box by an index
### The Array Index starts with zero / 0 not 1
### An array that has 10 elements will have the first index as 0 and 10th index as 9

## How are appending an element to the end of the Array

```
  @Override
    public void append (Object o) {
        if (this.size >= currentCapacity){
            int minCapacity = this.currentCapacity * 2;
            makeCapacity(minCapacity);

        }
        storage[this.size++] = o;
    }
```

### Explanation

```
- 1. We are accepting an Object as an argument or method parameter
- 2. We are tracking the current size in the member variable of the class called size or this.size
- 3. We are checking if the current size is either equal or greater than the current capacity of the Array called storage where we are keeping our data
- 4. This is similar to having 4 friends of the same college year sitting in a row where 4 chairs are there i.e. size = 4, currentCapacity - 4
- 5. When a new friend arrives, we need to get another chair and add that new chair to the row i.e. creating new capacity
- 6. We are making the new capacity as double the number of the currentCapacity
- 7. Why because creating new chairs / memory in computer is a slow expensice task
- 8. Thus when we need to create more capacity we create more not just one.
- 9. When our house storage of food grains get exhaused, we go to grocery shop and get a full bag of food grain, not a single food grain
- 10. How do we make the capacity?
- 11. We create a new bigger row with the new capacity i.e. 16
- 12 We then copy the elements from the current row positions i.e. 0,1,2,3... to the same position in the new array
- 13. Read the makeCapacity method closely to understand the loops
- 14. Finally after the capacity if needed is incresed and existing elements are moved to the new array, we fill the box after the last element of the new array and increase the size by 1. storage[this.size++] = o;
```

```
 public void makeCapacity(int minCapacity){

        if((minCapacity < this.size) || (minCapacity < this.currentCapacity)){
            return;
        }
        Object[] temp = new Object[storage.length];
        for(int i=0; i<storage.length; i++){
            if(storage[i] != null){
                temp[i] = storage[i];
            }
        }
        this.storage = new Object[minCapacity];
        for(int i=0; i<temp.length; i++){
            if(temp[i] != null){
                storage[i] = temp[i];
            }
        }
        this.currentCapacity = minCapacity;
    }
```

## How are we inserting an element in the middle of the List/Array

### What do we need

```
- 1. What to insert in the middle
- 2. Where in the middle of the array/list to insert that
```

```
 @Override
    public void insertAt(int index, Object o) {
        if(index < 0){ // If the position is invalid I mean less than zero then we throw error to the caller
            throw new NoSuchElementException();
        } else if (index > this.size){ // If the position to be inserted is greater than the current size, we throw an error
            throw new NoSuchElementException();
        } else if (index >= this.currentCapacity){ // if the current array does not have capacity to accept new elements, we throw an error
            throw new NoSuchElementException();
        } else {
            if (this.size >= this.currentCapacity){ // We check if we need to increase the current capacity when the size is = to the current capacity
                int minCapacity = this.currentCapacity * 2;
                makeCapacity(minCapacity);
                this.currentCapacity = minCapacity;
            }
            this.size++; // we increase the total size of the array list
            for (int x = this.size - 1; x > index; x--) { // We make space for the new element to be inserted at the desired position by moving the // existing elements
                this.storage[x] = this.storage[x - 1];
            }
            storage[index] = o; // We make the actual insertion
        }
    }
```
