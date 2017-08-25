This is a solution to the n-queens problem, as provided by the algorithm located the Explicit Solutions section

of its wikipedia page.

It is a maven project. To run perform

mvn clean package
java -cp target/nqueens-1.0-SNAPSHOT-jar-with-dependencies.jar org.mossab.nqueens.Application [LENGTH]

where LENGTH is the size of the board expressed as a positive integer.

A 'tight' solution is provided, but the full solution with docs is as well.