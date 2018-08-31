### Chain of Responsibility
This was inspired by journaldev's [example](https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java).

### UML class diagram
![Chain of Responsibility](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/behavioral/chainofresponsibility/chain_of_responsibility_img.png)

### Client (main program)
```
Enter amount to dispense below
530
Aug 30, 2018 9:12:53 PM com.tramyardg.dp.behavioral.chainofresponsibility.Dispenser50 dispense
INFO: Dispensing 10 50$ note(s)
Aug 30, 2018 9:12:53 PM com.tramyardg.dp.behavioral.chainofresponsibility.Dispenser20 dispense
INFO: Dispensing 1 20$ note(s)
Aug 30, 2018 9:12:53 PM com.tramyardg.dp.behavioral.chainofresponsibility.Dispenser10 dispense
INFO: Dispensing 1 10$ note(s)
```