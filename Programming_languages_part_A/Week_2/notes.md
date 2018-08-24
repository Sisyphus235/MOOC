# Reading materials  
The course aims to prepare one to be a better software developer.  
ML program is a sequence of bindings. Step 1: type checking; Step 2: evaluation.  
In ML, each binding adds first to static environment for type checking, and then to dynamic environment for evaluation.  
ML supports tuples by allowing any number of parts. And it can be nested however you want, like (7, (true, 9)) with type of (int * (bool * int)).  
ML supports list, with hd(return first element) and tl(return all elements excepet first one) as arguments.  
Functions that make and use lists are almost always recursive because a list has an unknown length.  
A let-expression lets us have local variables.  
logical and: andalso; logical or: orelse; logical negation: not; logical equal: =; logical not equal: <>.  



# ML variable bindings and expressions  
- 1.static environment: type-checking
- 2.dynamic environment: value bindings  

# Rules for expressions  
right question to ask in a new language:  
- 1.What is the syntax?
- 2.What are the type-checking rules?
- 3.What are the evaluation rules?  
In short: syntax, valid type and evaluation  
all values are expressions, but not all expressions are values.  

# REPL and Errors
REPL: read-eval-print-loop  
~5 means -5, and minus sign cannot be assigned in the first place.  

# shadowing  
What matters is the value of a variable rather than how the result is created.  

# functions informally  
type-checking of fuctions: pow = fn : int * int -> int  

# functions formally  
a function is already a value, default as 0.  

# pairs and other tuples  
#1 e and #2 e represent the first and second piece in a pair.  
```  
val x = (3,(4,(5,6)));
val y = (#2x,(#1x,#2(#2x)));
val ans = (#2y,4);

analysis:  
val y = ((4,(5,6)), (3,(5,6)))
val ans = ((3,(5,6)),4)
```  

# introducing lists  


