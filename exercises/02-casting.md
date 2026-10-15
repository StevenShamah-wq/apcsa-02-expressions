# Exercise 9 — Casting, Rounding & Overflow Lab

## Part A — Casting predictions

Predict first. Then run.

| # | Expression | Predicted | Actual |
|---|---|---|---|
| 1 | `(int) 9.99` | 9 | 9 |
| 2 | `(int) -9.99` | -9 | -9 |
| 3 | `Math.round(9.5)` | 10 | 10|
| 4 | `Math.round(9.4)` | 9 | 9 |
| 5 | `Math.round(-9.5)` | -9 | -9 |
| 6 | `(double) 7 / 2` | 3.5 | 3.5 |
| 7 | `(double) (7 / 2)` | 3.0 | 3.0|
| 8 | `Math.round(3.14159 * 100) / 100.0` | 3.14 | 3.14 |

**#6 and #7 look almost identical and give different answers. Explain the difference precisely.**

The one on number 6 doesn't have ().

---

## Part B — The overflow lab

Run this:

```java
int max = Integer.MAX_VALUE;
System.out.println("Max int:      " + max);
System.out.println("Max + 1:      " + (max + 1));
System.out.println("Max + 2:      " + (max + 2));

int min = Integer.MIN_VALUE;
System.out.println("Min int:      " + min);
System.out.println("Min - 1:      " + (min - 1));
```

**1. What is `Integer.MAX_VALUE`?**

2147483647

**2. What happened when you added 1 to it? Was there an error message?**

It wraps around.

**3. Why is silently wrapping around more dangerous than crashing with an error?**

It's dangerous because it can potentially giving us a completely diffent answer without any of us answering.

**4. In 2014 a very popular music video broke YouTube's view counter. Based on this lab, what do you think happened?**

It went over the max value and wrapped around.

**5. Name one thing your project might count that could get large. Would `int` be enough?**

The amount of comments on a movie.

---

## Part C — Floating point

Run this:

```java
System.out.println(0.1 + 0.2);
System.out.println(0.1 + 0.2 == 0.3);
```

**1. What did you expect? What did you get?**

For number I expected .3 and I got .300000000. And for the next one I expected .3 but it was false.

**2. Given this, why do you think real banking software stores money as a whole number of *cents* instead of a `double` number of dollars?**

They dont use double because it can be inaccurate. 

**3. If you can't use `==` to compare two doubles, what could you do instead? Write a line of code.**

System.out.println(Math.abs(0.1 + 0.2 - 0.3) < 0.000001);
