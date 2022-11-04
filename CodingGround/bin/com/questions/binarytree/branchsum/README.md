# Branch Sum
## Question
The distance between a node in a Binary Tree and the tree's root is called the node's depth.
Write a function that takes in a Binary Tree and returns the sum of its nodes' depths.
Each `BinaryTree` node has an integer `value`, a `left` child node, and a `right` child node. Children nodes can either be BinarTree nodes themselves or `None` / `null`
### Sample Input
```java
tree =      1
         /     \
        2       3
      /   \   /   \
     4     5 6     7
   /   \
  8     9
```

### Sample Output
```java
16
// The depth of the node with value 2 is 1
// The depth of the node with value 3 is 1
// The depth of the node with value 4 is 2
// Etc.
// Summing all up yields 16
```

## Links to files
- [Attempt1](./attempt1/app/BranchSum.java)