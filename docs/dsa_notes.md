# DATA STRUCTURES AND ALGORITHMS

## TREES

### Introduction

A tree is an abstract data type that stores elements hierarchically. With the exception of the top element, each element in a tree has a `parent` element and zero or more `children` elements. We typically call the top element the `root` of the tree, but it is drawn as the highest element, with the other elements being connected below (just the opposite of a botanical tree).
The nodes that are children of the same parent are `siblings`. A node is called `external` if it has no children where as `internal` nodes have one or more children

#### Formal definition

We define a tree 'T' as a set of nodes storing elements such that the nodes have a parent-child relationship that satisfies the following properties:
• If T is nonempty, it has a special node, called the root of T , that has no parent.
• Each node v of T, different from the root has a unique parent node w; every
node with parent w is a child of w.

#### Edges and paths in trees

An edge is the pair of of nodes (u, v) where u is the parent of v, or vice-versa. In simple, it means it is a direct connection between two nodes, usually between a parent and a child.

Similarly, A path is a sequence of nodes where each consecutive pair is connected by an edge. Paths are useful for navigating through trees and understanding relationships between nodes.

#### Ordered trees

In a normal tree, children of a node may simply exist without any special order.But in an ordered tree, the position of each child matters. An ordered tree is a tree in which the children of every node have a specific linear order.

The ordering of children is commonly represented visually from left to right. Nodes that share the same parent are called siblings, and in an ordered tree, siblings appear in a fixed sequence. Ordered trees are widely used in applications such as file systems, expression trees, XML/HTML documents, and menu structures where the position of elements is important.

### The Tree Abstract Data Type

The Tree ADT defines a generalized tree structure using positions as abstractions for nodes. Each position stores an element and maintains parent–child relationships that define the structure of the tree.

For a position object `p`, the tree ADT supports the following methods.

#### Accessing methods

The tree ADT then supports the following accessor methods, allowing a user to navigate the various positions of a tree T.
`getElement()`: Returns the element stored at this position.
`root()`: Returns the position () of the root of the tree (null if empty).
`parent(p)`: Returns the position of the parent of position p (null if p is the root).
`children(p)`: Returns an iterable collection containing the children of position p (if any).
`numChildren(p)`: Returns the number of children of position p.

If a tree T is ordered, then children(p) reports the children of p in order.

#### Query methods

In addition to the above fundamental accessor methods, a tree supports the following query methods:
`isInternal(p)`: Returns true if position p has at least one child.
`isExternal(p)`: Returns true if position p does not have any children.
`isRoot(p)`: Returns true if position p is the root of the tree.

These methods improve readability and simplify tree algorithms.

#### Utitlity methods

Trees support a number of more general methods, unrelated to the specific structure of the tree. These incude:

`size()`: Returns the number of positions (and hence elements) that are contained in the tree.
`isEmpty()`: Returns true if the tree does not contain any positions.
`iterator()`: Returns an iterator for all elements in the tree (so that the tree itself is Iterable).
`positions()`: Returns an iterable collection of all positions of the tree.

> If an invalid position is sent as a parameter to any method of a tree, then anIllegalArgumentException is thrown.

#### The Tree Interface

```java

public interface Tree<E> extends Iterable<E> {

    Position<E> root( );

    Position<E> parent(Position<E> p) throws IllegalArgumentException;

    Iterable<Position<E>> children(Position<E> p)
    throws IllegalArgumentException;

    int numChildren(Position<E> p) throws IllegalArgumentException;

    boolean isInternal(Position<E> p) throws IllegalArgumentException;

    boolean isExternal(Position<E> p) throws IllegalArgumentException;

    boolean isRoot(Position<E> p) throws IllegalArgumentException;

    int size( );

    boolean isEmpty( );

    Iterator<E> iterator( );

    Iterable<Position<E>> positions( );
}
```

### Height And Depth Of A Tree

Depth of a node `p`, is the number of predecessor (ancestors) of the node. The depth of p can also be recursively defined as follows:
• If p is the root, then the depth of p is 0.
• Otherwise, the depth of p is one plus the depth of the parent of p.

```java
public int depth(Position <E> p){
    if (isRoot(p))
        return 0;
    else
        return 1 + depth(parent(p))
}
```

The recursive depth method has a running time proportional to the depth of the node. If the node has depth d, the running time is O(d + 1). In the worst case, when the tree becomes a linear chain, the running time becomes O(n), where n is the total number of nodes in the tree.

While, height of a tree is the maximum depth a tree has among its external nodes. Since the deepest positions are always leaves, the height can be viewed as the depth of the deepest leaf.

```java
public int height(Position<E> p){

    int h = 0;

    for (Position<E> c : childrens(p))
       h = Math.max(h, 1 + height(c));

    return h;
}
```

The recursive height(p) algorithm visits each node once and recursively computes the heights of all children before determining the height of the current node. Because each node and edge is processed only once, the total running time becomes linear in the number of nodes. If the position of node is n, then the time complexity of algorithm is O(n).

### Binary Trees

A binary tree is an ordered tree, in which every node can have at most two children. These child are distinguished as left child and right child. A binary tree is called a proper binary tree if every node has either exactly two children or no children at all. A proper binary tree is also known as full binary tree.

A node in a binary tree may have zero, one, or two children. If a node has no children, it is called a leaf or external node. If it has at least one child, it is an internal node. The subtree rooted at the left child of a node is called the left subtree, while the subtree rooted at the right child is called the right subtree.

A binary tree can also be defined recursively. According to the recursive definition, a binary tree is either an empty tree or a nonempty tree containing a root node together with a left subtree and a right subtree. These subtrees are themselves binary trees, meaning the definition naturally repeats recursively.

This recursive nature makes binary trees ideal for recursive algorithms such as traversals, searching, height calculation, insertion, deletion, and expression evaluation.

### Properties of Binary Tree

Binary trees have several interesting properties dealing with relationships between their heights and number of nodes

#### Levels of Binary Tree

In a binary tree, all nodes having the same depth belong to the same level. The root node exists at level 0, its children exist at level 1, their children exist at level 2, and so on. Since each node can have at most two children, the number of nodes that can appear at each level grows exponentially.

Maximum nodes at level d:

`2^d`

Example:

```text
    Level 0 -> 1 node
    Level 1 -> 2 nodes
    Level 2 -> 4 nodes
    Level 3 -> 8 nodes
```

This exponential growth is one of the most important structural properties of binary trees.

#### Relationship Between Height and Number of Nodes

Let:

```text
    n = total number of nodes,

    nE = number of external (leaf) nodes,

    nI = number of internal nodes,

    h = height of the tree
```

Several important mathematical relationships exist between these quantities.

##### Property 1: Relationship Between Height and Total Nodes

For any nonempty binary tree, the minimuma and maximum nodes satisfy:

`h + 1 ≤ n ≤ 2 ^ (h + 1) − 1`
The minimum number of nodes occurs when the tree becomes completely skewed like a linked list. In such a case, every level contains exactly one node.

**Example**:

```text
    A
     \
      B
       \
        C

If height = 2, then minimum nodes = 3.
```

The maximum number of nodes occurs when the tree is perfectly filled at every level.

**Example**:

```text
         A
       /   \
      B     C
     / \   / \
    D   E F   G

For height 2, the total number of nodes is:

1 + 2 + 4 = 7

which satisfies:

2 ^ (2 + 1) - 1 = 7
```

##### Property 2: Relationship Between Height and External Nodes

For any binary tree, the height and external (leaf) node satisfy:

`1 ≤ nE ≤ 2 ^ h`

meaning, minimum leaves = 1 and maximum leaves occur at deepest level.

For height 3:

2 ^ 3 = 8

So the maximum possible leaf nodes are 8.

##### Property 3: Relationship Between Height and Internal Nodes

For any binary tree, the internal node (nI) satisfy :

`h ≤ nI ≤ 2 ^ (h − 1)`

The minimum number of internal nodes occurs in a skewed tree, while the maximum occurs in a complete binary tree.

Example:

For height 3:

Maximum internal nodes:

2 ^ (3 − 1) = 7

##### Property 4: Relationship Between Height and Total Nodes

The height of a binary tree satisfies:

`log( n  + 1 ) − 1 ≤ h ≤ n − 1`

The left side represents the best-case height, which occurs in balanced trees. The right side represents the worst-case height, which occurs in skewed trees.

Balanced trees have logarithmic height, making operations efficient:

Search -> O(log n)
Insertion -> O(log n)
Deletion -> O(log n)

Skewed trees behave similarly to linked lists:

Search -> O(n)
Insertion -> O(n)
Deletion -> O(n)

#### Relationship Between Internal and External Nodes

One of the most important properties of proper binary trees is:

`nE = nI + 1`

Where:

nE = number of external nodes,
nI = number of internal nodes

This means the number of leaf nodes is always exactly one more than the number of internal nodes.

**Example**:

```text
        A
       / \
      B   C
     / \
    D   E

Internal nodes: A, B, so nI = 2

External nodes: C, D, E, so nE = 3

Verification:

nE = nI + 1
3 = 2 + 1
```

> This relationship only holds for proper binary trees and not for improper or general trees.

### Tree Traversals Algorithms

A tree traversal is a systematic process of visiting every position (node) in a tree exactly once.
The action performed during a visit depends on the application, such as printing values, computing results, evaluating expressions, or updating information. Common traversal methods are preorder, postorder, and breadth-first traversal.
Traversal algorithms define the order in which nodes are visited.

#### Inorder, Postorder and Preorder Tree Traversals

##### Preorder Traversal

In preorder tree traversal algorithm, the node is visited first before any of its children. If the tree is ordered, then the subtrees are traversed according to the order of the children.

**Algorithm** preorder(pos):
  perform the visit action in this line
  for each child c in children(pos):
    preorder(pos)

**Example** :

```text
Tree:
     A
   / | \
  B  C  D
 / \
E   F

Post order sequence: A -> B -> E -> F -> C -> D
```

Preorder traversal follows a top-down approach and is useful for tree copying, directory listing, and generating prefix expressions.

Its time complexity is O(n), where n is the number of nodes. The recursion stack requires O(h) space, where h is the height of the tree.

##### Postorder Traversal

In post order tree traversal algorithm, the parent nodes are visited at last, all the children nodes are visited before the node itself.

**Algorithm** postorder(pos):
  for each child c in children(pos):
    postorder(c)
   perform the visit action.

**Example**:

```text
Tree:
     A
   / | \
  B  C  D
 / \
E   F

Postorder sequence: E -> F -> B -> C -> D -> A
```

Postorder traversal follows a bottom-up approach and is useful for deleting trees, computing directory sizes, and evaluating expression trees.

The time complexity is O(n), and the recursion stack requires O(h) space.

##### Inorder Traversal

Inorder tree traversal algorithm  is a special type of algorithm for binary trees. In this algorithm, a node is visited between the traversal of its left subtree and right subtree.

Algorithm inorder(pos):
  if pos has left child *lc* then
    inorder(lc)
  perform the visiting action here
  if pos has right child rc then
    inorder(lc)

```text
Tree:
    A
   / \
  B   D
 / \
E   F

Inorder sequence: E -> B -> F -> A -> D
```

In inorder the parent node lies in between the two children of binary tree.

#### Breath-First Search Traversals

#### Binary Search Trees
