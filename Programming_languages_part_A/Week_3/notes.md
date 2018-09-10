# Overview
primary focus in this week is creating user-defined types: defining new types, building values of such type, and using those values. 
- Compound type is included, which contains each of the smaller types.
- Pattern matching is used to access the pieces of values built out of compund types.
- syntatic sugar 
- exceptions
- tail recursion

# Building compound types
base types like bool, int, real, char, compund typs like list, tuple, option
3 most common ways to build compund types in any language:
- Each of: A t value contains values of each of t1, t2 ... tn
- One of: A t value contains values of one of t1, t2 ... tn
- Self reference: A t value can refer to other t values

# Records
type of "each of", field-value bound, such as
```SML
val x = {bar=(1+2, true andalso true), foo=3+4, baz=(false,9)}; 
(* create a record x *）

val my_niece = {id=4111, name="Amelia"}
(* create a record my_niece，注意SML中要用双引号 *）

#id my_niece
(* 获得my_niece的id，和tuple的#1拿到第一个member是一样的 *)
```
tuple is good at presenting positions, and record is good at presenting name.
```SML
a = (1,2,5)
person = {id=123,name="Tom",age=23}
```

# Tuples as syntatic sugar