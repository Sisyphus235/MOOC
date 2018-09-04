fun is_older (d1: int * int * int, d2: int * int * int) =
    if (#1 d1) > (#1 d2)
    then false
    else
	if (#2 d1) > (#2 d2)
	then false
	else
	    if (#3 d1) >= (#3 d2)
	    then false
	    else true
		     
fun number_in_month (ds: (int * int * int) list, m: int) =
    if null ds
    then 0
    else
	let val cur = hd(ds)
	in
	    if (#2 cur) = m 
	    then 1 + number_in_month(tl(ds), m)
	    else number_in_month(tl(ds), m)
	end
