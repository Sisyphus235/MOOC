(* Homework1 Simple Test *)
(* These are basic test cases. Passing these tests does not guarantee that your code will pass the actual homework grader *)
(* To run the test, add a new line to the top of this file: use "homeworkname.sml"; *)
(* All the tests should evaluate to true. For example, the REPL should say: val test1 = true : bool *)

use "hw1.sml";

val test1_1 = is_older ((1,2,3),(2,3,4)) = true
val test1_2 = is_older ((2,2,3),(2,3,4)) = true
val test1_3 = is_older ((2,3,3),(2,3,4)) = true
val test1_4 = is_older ((2,3,4),(2,3,4)) = false
val test1_5 = is_older ((3,3,3),(2,3,4)) = false
val test1_6 = is_older ((2,4,3),(2,3,4)) = false
val test1_7 = is_older ((2,3,5),(2,3,4)) = false
val test1_8 = is_older ((2,2,10),(2,3,3)) = true

val test2_1 = number_in_month ([(2012,2,28),(2013,12,1)],2) = 1
val test2_2 = number_in_month ([(2012,2,28),(2013,2,1)],2) = 2
val test2_3 = number_in_month ([(2012,1,28),(2013,12,1)],2) = 0
val test2_4 = number_in_month ([],2) = 0

val test3_1 = number_in_months ([(2012,2,28),(2013,12,1),(2011,3,31),(2011,4,28)],[2,3,4]) = 3
val test3_2 = number_in_months ([(2012,11,28),(2013,12,1),(2011,3,31),(2011,4,28)],[2,3,4]) = 2
val test3_3 = number_in_months ([(2012,2,28),(2013,12,1),(2011,3,31),(2011,4,28)],[5]) = 0
val test3_4 = number_in_months ([(2012,2,28),(2013,12,1),(2011,3,31),(2011,4,28)],[]) = 0

val test4_1 = dates_in_month ([(2012,2,28),(2013,12,1)],2) = [(2012,2,28)]
val test4_2 = dates_in_month ([(2012,2,28),(2013,2,1)],2) = [(2012,2,28),(2013,2,1)]
val test4_3 = dates_in_month ([(2012,2,13),(2013,12,1),(2012,2,28)],2) = [(2012,2,13),(2012,2,28)]

val test5_1 = dates_in_months ([(2012,2,28),(2013,12,1),(2011,3,31),(2011,4,28)],[2,3,4]) = [(2012,2,28),(2011,3,31),(2011,4,28)]
val test5_2 = dates_in_months ([(2012,2,28),(2013,2,1),(2011,3,31),(2011,4,28)],[2,3,4]) = [(2012,2,28),(2013,2,1),(2011,3,31),(2011,4,28)]
val test5_3 = dates_in_months ([(2012,2,28),(2013,5,1),(2011,3,31),(2011,4,28)],[2,4,5]) = [(2012,2,28),(2011,4,28),(2013,5,1)]
	

val test6_1 = get_nth (["hi", "there", "how", "are", "you"], 2) = "there"
val test6_2 = get_nth (["hi", "there", "how", "are", "you"], 5) = "you"
val test6_3 = get_nth (["hi", "there", "how", "are", "you"], 1) = "hi"

val test7_1 = date_to_string (2013, 6, 1) = "June 1, 2013"
val test7_2 = date_to_string (2018, 9, 10) = "September 10, 2018"


val test8_1 = number_before_reaching_sum (10, [1,2,3,4,5]) = 3
val test8_2 = number_before_reaching_sum (10, [10,2,3,4,5]) = 0
val test8_3 = number_before_reaching_sum (10, [1,2,3,3,5]) = 4

val test9_1 = what_month(70) = 3
val test9_2 = what_month(128) = 5
val test9_3 = what_month(31) = 1

val test10_1 = month_range (31, 34) = [1,2,2,2]
val test10_2 = month_range (28, 32) = [1,1,1,1,2]

val test11_1 = oldest([(2012,2,28),(2011,3,31),(2011,4,28)]) = SOME (2011,3,31)
val test11_2 = oldest([]) = NONE
val test11_3 = oldest([(2011,3,31)]) = SOME (2011,3,31)

