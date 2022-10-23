# What is a Linked List

```
  - 1. When several members of a family stay in the same house, we can say that they live in an array
  - 2. the proximity of the rooms in the same house is conceptually similar to an array
  - 3. When one family member moves from her house to her college 17,00 miles away, they are still family i.e. Linked but 
  - 4. Not staying in the confituus houses / rooms anymore
  - 5. Members of the family then has the address of the family member living far way in a college dorm, creating a linked list.
```

## What is a basic building block of a Linked List

### The Node class which contains two parts

```
- 1. The Data part that can hold any Object
- 2. The next part that holds the memory address of the next Node in sequence
```

## What is the Head / Start Address

```
  - 1. Say Miss Graf wants to find the phone number of Mr. David but she only knows Mr. David's Mom's phone phone number
  - 2. So she first calls Mr. David's Mom
  - 3. Asks for Mr. David's Phone Number from his Mom
  - 4. Then calls Mr. David
  - 5. Miss. Graph is here the Head or the Start Address because she is the one starting the search / traversal of the list
  - 6. The two elements in this list are Mr. David's Mom (The first Element) and Mr. David the second and last element.
```
## How does the Head / Start Look like

![Alt text](./images/20.png?raw=true "Title")

## How does the Node looks Like

![Alt text](./images/23.png?raw=true "Title")

## How does the full linked list look like

![Alt text](./images/22.png?raw=true "Title")

## How does the last Node looks Like (See the NULL in the next field

![Alt text](./images/21.png?raw=true "Title")

## How does a Node Object look like

![Alt text](./images/24.png?raw=true "Title")


## How do we construct a new object of a LinkedList

![Alt text](./images/25.png?raw=true "Title")

```
 - 1. We use the constructor method of the class named exactly the same as the class name itself to initialize its member variables
 - 2. We set head to NULL as the new linked list does not point to anything real
 - 3. And to reflect the reality we set the size of the linked list to zero.
```

## How do we append a new element at the end of a LinkedList


![Alt text](./images/26.png?raw=true "Title")

```
 - 1. We receive an Object of type Node from our caller
 - 2. We create a new object of type Node and assign the parameter we received to the new Node
 - 3. We check if head is null and if that is the case, this new element is the first node of the linkedlist and we set head to the address of the new node
 - 4. Remember saying  head = new_node; is telling java to set the address of the new_node not the content of the new_node to head
 - 5. If head is not null that means the linkedlist already has some elements added to lit.
 - 6. We traverse the existing list to reach the last element of the list
 - 7. Till now before we appended the new element, last node pointed to NULL.
 - 8. After the append, current last_node will now point to the new_node
 - 9. The latest last node is the new_node
```

## How do we get an existing element from a LinkedList

![Alt text](./images/27.png?raw=true "Title")


## How do we insert a new element at the middle of a LinkedList

![Alt text](./images/29.png?raw=true "Title")

## How do we remove an existing element from LinkedList

![Alt text](./images/30.png?raw=true "Title")

## How do we print a LinkedList

![Alt text](./images/31.png?raw=true "Title")

