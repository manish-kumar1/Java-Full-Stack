/*
Regex Character classes
No.	Character Class	   Description
1	[abc]	          a, b, or c (simple class)
2	[^abc]	          Any character except a, b, or c (negation)
3	[a-zA-Z]	      a through z or A through Z, inclusive (range)
4	[a-d[m-p]]	      a through d, or m through p: [a-dm-p] (union)
5	[a-z&&[def]]	  d, e, or f (intersection)
6	[a-z&&[^bc]]	  a through z, except for b and c: [ad-z] (subtraction)
7	[a-z&&[^m-p]]	  a through z, and not m through p: [a-lq-z](subtraction)
*/

import java.util.regex.*;  
class RegexExample3{  
	public static void main(String args[]){  
		System.out.println(Pattern.matches("[amn]", "a"));//true (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once) 
		System.out.println(Pattern.matches("[^abs]", "x")); //true (Any character except a, b, or c (negation)
		System.out.println(Pattern.matches("[a-zA-Z]", "A")); //true (a through z or A Through Z, inclusive(range)
		System.out.println(Pattern.matches("[a-d[m-p]]", "z")); //false (a through d, or m through p:[a-dm-p] (union)
		System.out.println(Pattern.matches("[a-z&&[def]]", "d")); //true (d,e or f (intersection)
		System.out.println(Pattern.matches("[a-z&&[^bc]]", "x"));  //true (a through z, except for b and c:[ad-z] (subtraction)
		System.out.println(Pattern.matches("[a-z&&[^m-p]]", "n")); //false (a through z, and not m through p:[a-lq-z] (subtraction)
	}
}  