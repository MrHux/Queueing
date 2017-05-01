# Queueing
A little program that enable to solve some Queeing problems.

--------------------------------------------------------------------------------------------------

This program is a solver for three kind of Queeing System :

- The M/M/1 
- The M/M/1/K 
- The M/M/S

In each of them you need to provide the following parameters :

- Lamba : the number of customer coming per unity of time
- Mu : the number service made per unity of time
- The number of customer in the system at a specific state : to calculate the probability to have as much customer in the system in  stationary analysis
- "t" : to calculate the probability to wait more than "t" time in the system

Some other parameters need to be provided in the case of :

- M/M/1/K : 
  The maximum number of customer in the system
- M/M/S :
  The maximum number of server in the system

