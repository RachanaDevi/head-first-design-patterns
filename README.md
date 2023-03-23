#  Head First Design Patterns Code
## Strategy pattern

### Starting with Inheritance
- We have a class Duck (superclass) which had the behaviours of fly() and quack(), everything was in a happy-go-lucky world when all ducks could fly and quack
- Then we had other kinds of Ducks like `RubberDuck` which could neither fly nor quack ( instead they squeak )
  - PROBLEM: We will have to override all the unnecessary methods in the `RubberDuck` but okay he can may tweak it a little and not do anything in those methods,
  -  or throw exception (Which breaks Liskov Substitution Principle. We may also will have to put an if condition if this instance of `RubberDuck` comes up which may result in if-else ladder)
  - PROBLEM: You get a `DecoyDuck` (like a living room decoration) which is neither supposed to fly nor quack or squeak. You're unnecessarily adding these behaviours in these classes.