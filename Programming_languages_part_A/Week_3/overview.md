Our primary focus in this module will be on creating our own types: defining new types, building values of such types, and using those values. This will help us see that while pairs, lists, and options are "already provided" by ML, they do not really need to be: we could define our own versions that are just as powerful. We will also see a key distinction in how to think about "compound types" (types build out of smaller types), namely whether a compound type contains each of the smaller types or one of the smaller types.

We will also use pattern matching to access the pieces of values built out of compound types. ML-style pattern matching is extremely powerful and general, with several advantages over more conventional approaches. We will introduce the idea of syntactic sugar and see that ML is using pattern matching in every function binding and let expression even when it does not seem like it. This will be a key moment where you can see how a lot of what we have learned so far "fits together" elegantly to make ML a surprisingly small language at its core. We will also generalize the idea of pattern matching to support nested patterns. And we will briefly look at ML's exceptions, which also use pattern matching.

Finally, we will study tail recursion, which is the primary concept one needs to reason about the efficiency of ML programs, and in general any functional programs using recursion.

All these ideas will come together in a challenging programming assignment that will let you use the new features you have learned. And then the next two modules -- which focus on higher-order functions, ML's module system, and type inference -- will continue to use compound types and pattern matching in essential ways.



