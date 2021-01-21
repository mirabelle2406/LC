# Arrays101

## Introduction

### Array - A DVD box?

### What is an Array?

### Accessing Elements in Array

In languages such as C, the Array slot could contain completely random data. Java always initiate Array slots to `null` if the Array contain objects, or to default values if it contains primitive values. For example, the array `int []` would contain the default value of `0`for each element, `float[]`would contain default values of `0.0`, and `bool[]`would contain default values of `false`.

### Array Capacity VS Length

#### Array Capacity

The Array's **capacity** must be decided when the Array is created. The capacity cannot be changed later. 

The **capacity** of an Array in Java can be checked by looking at the value of its `length` attribute. This is done using the code `arr.length`, where `arr` is the name of the Array. 

#### Array Length

**Length** is the current number of elements in an Array.

#### Handling Array Parameters

When an Array is give as a parameter, without any additional information, you can safely assume that **length == capacity**.  That is, the Array is the exact right size to hold all of its data. We can, therefore, use `.length`.

Arrays are 0-indexed. The capacity / length is a number of items, not a highest index. The highest index is `.length - 1`. 

## Inserting Items Into an Array

### Basic Array Operations

