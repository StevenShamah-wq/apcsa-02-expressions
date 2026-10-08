# Exercise 4 — Predict, Then Run

**Fill in the PREDICTED column completely before you run any code.** That's the whole exercise. Checking the answer without committing to a guess teaches you nothing.

| # | Expression | Predicted | Actual | Right? | If wrong, why? |
|---|---|---|---|---|---|
| 1 | `9 / 2` | 4 | 4 | Yes | |
| 2 | `9 % 2` | 1 | 1 | Yes | |
| 3 | `9.0 / 2` | 4.5 | 4.5 | Yes | | 
| 4 | `9 / 2.0` | 4.5 | 4.5 | Yes | |
| 5 | `2 + 3 * 4` | 14 | 14 | Yes | |
| 6 | `(2 + 3) * 4` | 20 | 20 | Yes | |
| 7 | `20 - 5 - 3` | 12 | 12  | Yes | |
| 8 | `17 % 5` | 2 | 2 | Yes | |
| 9 | `5 % 17` | 2 | 5 | No | If you divide 5 by 17 it goes in 5 times.|
| 10 | `100 / 3 / 3` | 11 | 11 | Yes| |
| 11 | `1 / 2 * 100` | 0 | 0  | Yes | |
| 12 | `100 * 1 / 2` | 50 | 50| Yes | |

---

## Follow-up

**1. Compare #11 and #12. Same numbers, same operators, completely different answers. Explain why.**

 #11 gives 0 because 1 / 2 happens first and integer division makes it 0, while #12 multiplies 100 by 1 first, giving 100, then divides by 2.

**2. #9 gives `5`. Explain why `5 % 17` is 5 and not 0.**

equals 5 because 17 is too large to go into 5, leaving 5 as the remainder.

**3. A classmate writes this to calculate a percentage:**
```java
int correct = 7;
int total = 10;
double percent = correct / total * 100;
```
**They get `0.0`. Explain what went wrong and write the corrected line.**

[your answer]

```java
double percent = (double) correct / total * 100;
```

**4. Give one real situation where `%` would genuinely be useful. Not from this worksheet — something from your own life or your project idea.**

% could be used to check if I have an even number of items when splitting things into groups.
