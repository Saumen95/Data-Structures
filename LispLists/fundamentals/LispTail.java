class LispTail {
	public static void main(String[] args) {
		LispList<Integer> ls = LispList.empty();
		ls = ls.cons(11);
		ls = ls.cons(3);
		ls = ls.cons(7);
		ls = ls.cons(5);
		System.out.println(ls); // [5,7,3,11]

		// what is the tail of a list?
		LispList lsTail = ls.tail(); // Note: Type will be inferred from ls
		System.out.println(lsTail); // [7,3,11]

		// what is the head of the tail of a list?
		//Integer h = lsTail.head();
		//System.out.println(h);
	}
}