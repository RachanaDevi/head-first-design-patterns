#  Head First Design Patterns Code
## Strategy pattern

### Starting with Inheritance
- We have a class Duck (superclass) which had the behaviours of fly() and quack(), everything was in a happy-go-lucky world when all ducks could fly and quack
- Then we had other kinds of Ducks like `RubberDuck` which could neither fly nor quack ( instead they squeak )
  - PROBLEM: We will have to override all the unnecessary methods in the `RubberDuck` but okay he can may tweak it a little and not do anything in those methods,
  -  or throw exception (Which breaks Liskov Substitution Principle. We may also will have to put an if condition if this instance of `RubberDuck` comes up which may result in if-else ladder)
  - PROBLEM: You get a `DecoyDuck` (like a living room decoration) which is neither supposed to fly nor quack or squeak. You're unnecessarily adding these behaviours in these classes.

#### Conclusion:
The problems we're facing with inheritance, where we tried to reuse code. But it came at the cost of:
- Code duplicate among the classes:
  - After the introduction of `RubberDuck` we have this code of having squeak instead of quack, if there are any other classes `ToyDuck` which require the same behaviour of `squeak`, there is **duplication of the same code** in `RubberDuck` and `ToyDuck`
  - You have to be mindful when you're inheriting `Duck` class, when creating any class be mindful of what it shouldn't allow (`DecoyDuck` cannot fly or quack).
  - You're never sure what the runtime behaviour may be
```java
class Example{

  // lol here the list may keep going on and on and we will have to keep in mind what to handle and what might break the code
  // this also breaks the principle of open for extension closed for modification. Any new class which does not support quack, will have to 
  // be handled here
  void makeTheDucksQuack() {
    List<Duck> ducks = allTheDucks();
    for (Duck duck : ducks) {
      if (!duck instanceof RubberDuck) {
        duck.quack();
      }
    }
  }
}
```
- It's hard to gain knowledge of all duck behaviours. (You never know what the future holds. We may have to keep changing the contract for `Duck` superclass)
- Changes can unintentionally affect other ducks. (Any change in Duck class may affect other ducks which may not even require the behaviour. Eg how `RubberDuck` got affected)
  - Any change in the parent class (Eg: a new data member will have be impacting the subclasses) Let's say if duck has toes, and it wants to initialize the toes it has, it will impact everyone. Search `CHANGE-` (total 6 changes because of 3 subclasses)
----
Inheritance helps in reusability, but it is difficult to maintain.
