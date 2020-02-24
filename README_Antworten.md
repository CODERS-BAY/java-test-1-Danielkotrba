# Java - Exam 1 
## Programmauswertung

Wie sieht die Ausgabe dieses Programms aus? 

```java
int number = 12; 
System.out.println(number/5);
System.out.println(number/5.0);
number += 7; 
System.out.println(number);
```

    2         //Because 12 / 5 = 2.4 but it only shows the 2
    2.4      //Because 12 / 5.0 = 2.4 and it shows the .4 because of the 5.0
    19      // Because 7 + 12 = 19

## Datentypen

Welche Datentypen kennst du? 

        int         
        String   
        double      
        float
        boolean
        char
        byte
        long
        short
Gibt es Unterschiede bei der Verwendung zwischen einem `int` und einem `Integer`? 

        int is a primitive data type 
        Integer is a  Wrapper class

## Scope

Was ist der Scope einer Variable? 

    The scope is the "Life Span" of an Variable
Erkläre anhand eines kleinen Beispielprogramms.

    {
    int number;
    
    number = 2
      System.out.println(number);
    }                                 //This works because the "Use variable" is inside of its Scope.

---
    {
    int number;
    
    number = 2
    }
      System.out.println(number);
                                    //This Does not work because the "use variable" is outside of its Scope.


