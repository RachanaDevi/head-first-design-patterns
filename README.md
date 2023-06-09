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


### Using interfaces
- Let's have quack `Flyable` and `Quackable` as an interface, so the ducks who need the required behaviour may provide the implementation.

### Conclusion
- You don't have intertwining of methods problem like we had in `Inheritance` but what about reusability? We still have code duplication  everywhere then.
- We have identified that Flying and Quack behaviour as a concept is something which can change or vary. So let's separate these out.

- PROBLEM:  BUT We are **not** reusing the code in subclass `MallardDuck` and `RedheadDuck` if any change for fly has to be changed, if the both represent the same `fly` or `quack` it has to be changed in
  both the subclasses.


IDENTIFY THE APPLICATION THAT VARY AND SEPARATE THEM FROM WHAT STAYS THE SAME

---

### Using Behaviour classes
- Introducing `FlyBehaviour` and `QuackBehaviour` which are pluggable to the required Duck whenever required.
- PROGRAMMING TO AN INTERFACE NOT AN IMPLEMENTATION. From what I understood means you don't want the behaviour which is sooo varying to be tightly coupled to a class.
  - Like in previous example we had concrete implementation of fly and quack in the `Duck` superclass.
  - It's kind of like a feature you can just plug in. A usb you can plug which has all the logic abstracted from the class which is using it.
    - When you have the concrete implementation, you make break the principle of `Open for extension and closed for modification`.
- Hence we made
  - FlyBehaviour <- FlyWithWings
  - QuackBehaviour <- Squeak
- And have our Duck plug it in with Composition (instead of implementing it or inheriting it)
- Also the advantage of having flyBehaviour sub classes is that IF flyWithWings requires some calculation and so (has data members it is only restricted in that class and does not affect other classes)

- If there is any other behaviour which comes up, so the class which will be affected will be that particular class only. Eg `MallardDuck` also walks, then we can introduce walk behaviour.

### The experiment
- What if we did not use inheritance over composition
- part3_experiment implements the methods rather than the Duck having composition over those behaviours

In part3_experiment and COUNTER points are what are in the normal part3 implementation (i.e behaviour classes and composition)
- Duck class is a normal abstract class
- We have interfaces which get implemented in behaviour classes
  - The interfaces just provide a contract of what the behaviours of that particular Duck should be
  - We still have to add the implementation from the concrete classes and call their method
    - CONSEQUENCE: this may lead to **Repetition** of code and if two classes `MallardDuck` and `RedHeadDuck` have same fly, quack behaviour there are changes of
      introducing bugs
    - If more behaviours come up, the change of impact will be implementing all classes to have that interface
      - COUNTER: We will have to still add the instance of the new behaviour in the constructor in part_3 (so that is one major change) (eg: WaddleBehaviour) (only one change)
  - COUNTER: But if we add more behaviours (Like we added `WaddleBehaviour`) then `Duck` will get affected, which means subclasses will get affected.
    - Then again we have the problem of inheritance and we have to separate out the things which are varying (i.e create an abstraction over it)