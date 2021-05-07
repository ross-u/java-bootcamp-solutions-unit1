# Lab 1.8

Labs are mandatory and must be completed before the start of the next class. 

You make work collaboratively with your classmates, but you may not copy and paste another students code. 

## Instructions

Create a new github repository named `Enterprise-Java-Development-1.8`

Add your instructor and the class graders to your repository and ensure that your repository is private. Public repositories will receive a zero on the assigment. 

If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck. 

Upload the code for all of the following prompts to your repository.

## Specifications

1. Using [the BigDecimal documentation](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html), create a method that accepts a BigDecimal and returns a double of the BigDecimal number rounded to the nearest hundredth. For example, `4.2545` should return `4.25`.


1. Using [the BigDecimal documentation](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html), create a method that accepts a BigDecimal, reverses the sign (if the parameter is positive, the result should be negative and vice verse), rounds the number to the nearest tenth and returns the result. For example, `1.2345` should return  `-1.2` and `-45.67` should return `45.7`.

1. Suppose you are building a Car inventory system. All cars have a `vinNumber`, `make`, `model`, and `mileage`. But no Car is just a Car. Each Car is either a Sedan, a UtilityVehicle, or a Truck. UtilityVehicles have a boolean that respresents whether they have `fourWheelDrive`. Trucks have a numeric `towingCapacity`. Create an Abstract Class named `Car` and 3 classes that extend Car called `Sedan`, `UtilityVehicle`, and `Truck`.

1. Suppose you are building a Video streaming service. All Videos are either tvSeries or Movies. Create classes `TvSeries` and `Movie` which extend an Abstract class `Video`. Add a few methods and properties to each. 

1. Create an `IntList` Interface. An IntList is simply a way to store an ordered list of integers. 

- All IntLists should have an `add` method by which a user can a new number to the list. 
- All IntLists should have a `get` method by which users can retrieve an element by id. 
- You will need two implementations of `IntList`. 
- The first implementation is `IntArrayList`. `IntArrayList` should store numbers in an array with length 10 by default. When the add method is called, you must first determine if the array is full. If it is, create a new array that is 50% larger, move all elements over to the new array and add the new element. (for example, an array of length 10 would be increased to 15) 
- The second implementation is `IntVector`. `IntVector` should store numbers in an array with length 20 by default. When the add method is called, you must first determine if the array is full. If it is, create a new array that is double the size of the current array, move all elements over to the new array and add the new element. (for example, an array of length 10 would be increased to 20) 
- In your README.md include an example of when `IntArrayList` would be more efficient and when `IntVector` would be more efficient. 


