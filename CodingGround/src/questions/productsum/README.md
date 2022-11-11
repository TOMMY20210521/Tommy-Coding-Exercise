# <!-- Title -->Product Sum

> Difficulty : `Easy` <!--Difficulty-->
> 
> Attempts : [Attempt1](./attemp1/app/ProductSum.java) <!--Attempt Links-->

## Question <!--Question Descriptions-->
Write a function that takes in a "special" array and returns its product sum. A "special" array is a non-empty array that contains either integers or other "special" arrays. The product sum of a "special" array is the sum of its elements, where "special" arrays inside it are summed themselves and then multiplied by their level of depth.

The depth of a "special" array is how far nested it is. For instance, the depth of `[]` is `1`; the depth of the inner array in `[[]]` is `2`; the depth of the innermost array in `[[[]]]` is `3`.

Therefore, the product sum of `[x, y]` is `× + y` ; the product sum of `[x, [y, z]]` is `× + 2 * (y + 2)` ; the product sum of `[x, [y, [z]]]` is `× + 2 * (y + 3z)`

### Sample Input
```java
array = [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
```
### Sample Output
```java
12 // calculated as: 5 + 2 + 2 * (7 - 1) + 3 + 2 * (6 + 3 * (-13 + 8) + 4)
```
## Skeleton <!--Skeleton Code Provided-->
```java
import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    return -1;
  }
}
```