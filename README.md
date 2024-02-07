# builderPattern
**Problem Scenario**

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

* Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
* Optional fields: Not all customers provide complete information, but the constructor forces them to.
* Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.

Implement solution using the Builder Pattern to address the issue.

===== Problem Scenario Ends here =====

**UML Diagram**
![builderPattern](https://github.com/jeanfideliom/builderPattern/assets/63704287/0caa7bf9-7582-4a8a-b6a7-1ce36df7d4c9)
