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