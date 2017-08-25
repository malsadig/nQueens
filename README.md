This is a solution to the n-queens problem, as provided by the algorithm located on the [wiki page](https://en.wikipedia.org/wiki/Eight_queens_puzzle#Explicit_solutions) .
Requires maven to run.


To run perform:

- mvn clean package

- java -cp target/nqueens-1.0-SNAPSHOT-jar-with-dependencies.jar org.mossab.nqueens.Application [LENGTH]

where LENGTH is the size of the board expressed as a positive integer.

Example output for an input of 8:

![image](https://puu.sh/xiYvT/e6559150a3.png)

A 'tight' solution is provided, but the 'full' solution with docs and tests is as well.