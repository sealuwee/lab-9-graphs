# lab-9-graphs
Graph related lab. Semester almost over.

#### Implementation

- Outside of the function signature from the lab assignment page pdf, I chose to use the java.util package List and ArrayList data structure to implement this solution. The reason why we use this package is because these two data structures don't need to explicitly declare how much memory needs to be allocated when instantiating the data structure. 

- allPaths is recursively called ensuring that we add all the paths to the 2d array with the connected vertices to the 0 node. 