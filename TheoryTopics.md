# Core Java Interview Notes

## Table of Contents
1. Java Introduction
2. JDK vs JRE vs JVM
3. Memory Allocation
4. Variables and Data Types
5. Operators
6. Keywords, Literals, Escape Sequences
7. Type Conversion
8. Input / Output
9. If Else and Switch
10. Comments
11. Loops
12. Methods, Return Statements, Arguments
13. Arrays (1D and 2D)
14. Number System
15. OOP Concepts
16. Classes and Objects
17. this and static
18. Constructors and Code Blocks
19. Stack vs Heap
20. Garbage Collection
21. String, StringBuffer, StringBuilder
22. Encapsulation and Inheritance
23. Access Modifiers
24. Object Class
25. equals() and hashCode()
26. Inner Classes
27. Recursion
28. Interview Practice Questions

---

# Java Introduction

Java is a high-level, object-oriented, platform-independent programming language.

Execution Flow:

Source Code (.java)
→ javac Compiler
→ Bytecode (.class)
→ JVM
→ Machine Code
→ Output

---

# JDK vs JRE vs JVM

## JVM
- Executes bytecode
- Handles memory management
- Performs garbage collection

## JRE
- JVM + Libraries
- Used to run Java applications

## JDK
- JRE + Development Tools
- Includes javac compiler

Interview:
JDK = JRE + Development Tools
JRE = JVM + Libraries
JVM = Executes Bytecode

---

# Memory Allocation

## Stack Memory
Stores:
- Method calls
- Local variables

## Heap Memory
Stores:
- Objects
- Arrays

Example:
Student s = new Student();

Reference → Stack
Object → Heap

---

# Variables and Data Types

Primitive Types:
- byte
- short
- int
- long
- float
- double
- char
- boolean

Reference Types:
- String
- Arrays
- Objects

---

# Operators

Arithmetic: + - * / %

Relational: == != > < >= <=

Logical: && || !

Bitwise: & | ^ ~ << >> >>>

---

# Keywords

Examples:
class, public, private, static, final, this, super, new

---

# Literals

Examples:
10
20.5
'A'
"Java"
true

---

# Escape Sequences

\\n
\\t
\\b
\\r
\\\\
\\"
\\'

---

# Type Conversion

## Widening

int a = 10;
double b = a;

## Narrowing

double d = 10.5;
int x = (int)d;

---

# Input Output

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

---

# If Else

if(condition) {}

if(condition) {}
else {}

if() {}
else if() {}
else {}

---

# Switch

Traditional Switch and Java 14+ Switch Expressions

---

# Comments

// Single Line

/*
 Multi Line
*/

/**
 JavaDoc
*/

---

# Loops

for

while

do-while

break

continue

---

# Methods

int add(int a, int b){
    return a + b;
}

Actual Arguments:
add(10,20);

Formal Arguments:
int add(int a,int b)

---

# Arrays

## 1D Array

int[] arr = new int[5];

Practice:
- Reverse Array
- Find Maximum
- Second Largest
- Rotate Array
- Kadane Algorithm

## 2D Array

int[][] matrix = {
 {1,2,3},
 {4,5,6}
};

Practice:
- Matrix Traversal
- Row Sum
- Column Sum
- Diagonal Sum
- Matrix Transpose

---

# Number System

Decimal
Binary
Octal
Hexadecimal

Example:

int x = 0xA;

Output: 10

---

# OOP Concepts

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

# Class vs Object

Class = Blueprint

Object = Instance of Class

---

# this Keyword

Refers to current object.

this.id = id;

---

# static Keyword

Belongs to class.

One copy shared by all objects.

---

# Constructors

Types:
- Default Constructor
- Parameterized Constructor

Interview:
Can Constructor be static?
No.

---

# Code Blocks

Static Block

Instance Initialization Block

---

# Stack vs Heap

Stack:
- Local Variables
- Method Calls

Heap:
- Objects
- Arrays

---

# Primitive vs Reference Types

Primitive:
Stores actual value

Reference:
Stores memory address

---

# Variable Scope

- Local Variable
- Instance Variable
- Static Variable

---

# Garbage Collection

Removes unreachable objects.

finalize() is deprecated.

---

# Math Class

Math.max()
Math.min()
Math.sqrt()
Math.pow()
Math.random()

---

# String

String is Immutable.

---

# StringBuffer vs StringBuilder

StringBuffer:
- Thread Safe
- Slower

StringBuilder:
- Not Thread Safe
- Faster

---

# Encapsulation

Data Hiding

private variables + getters/setters

---

# Inheritance

class A {}
class B extends A {}

Types:
- Single
- Multilevel
- Hierarchical

---

# Access Modifiers

private
default
protected
public

---

# Object Class

Important Methods:
- toString()
- equals()
- hashCode()
- clone()

---

# equals() vs ==

== → Reference Comparison

equals() → Content Comparison

---

# hashCode()

Used by:
- HashMap
- HashSet

Rule:
Equal objects must have same hashCode.

---

# Inner Classes

- Member Inner Class
- Static Nested Class

---

# Recursion

Function calling itself.

Practice:
- Factorial
- Fibonacci
- Reverse String
- Binary Search

---

# Must Practice Questions

## Numbers
- Prime Number
- Armstrong Number
- Palindrome Number
- Reverse Number
- GCD
- LCM

## Arrays
- Two Sum
- Kadane
- Prefix Sum
- Rotate Array

## Strings
- Reverse String
- Anagram
- Palindrome

## OOP
- Constructor Chaining
- this vs super
- static vs instance
- equals vs hashCode

---



## Arrays
    Arrays.copyOfRange(arr, startInd, endIndex); // endIndex not included in this 

## Sub - Matrices
    Contiguous part of a matrix
    How can we uniquely identify a submatrix ? (TL, BR) / (BL, TR)