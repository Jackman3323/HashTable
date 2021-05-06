#Hashtable

##Unique attributes:

- I have chosen not to lock the size of my hashtable; it makes it less flexible and causes unnecessary errors when you couuld just manage it dynamically without much extra effort

##Answers to quesitons:

- The prime number one is better--it decreases the chances of duplicates in your hash function when creating indicies. This is simple to understand because as you factor things and divide them into common, small numbers; you decrease the uniqueness of your indicies. 

- No, this is not an optimal hash function because summing the characters is more likely to lead to duplicates

- It appears as though the hash function works by multiplying each char by a prime number and then factoring it by a non prime number? It's hard to tell...
 