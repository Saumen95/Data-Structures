class LispDeclaration {

	public static void main(String[] args) {
		System.out.println(LispList.<Integer>empty()); // creates an empty list of integers
		
		// error as integer list is not same as generic list
		//LispList<E> myList = LispList.<Integer>empty();

		// this is a list of string
		LispList<String> fruits = LispList.<String>empty();
		/* however the second bit of the declaration can
		 * be written with a shorthand.
		 * Since we declared 'fruits' to be a list of type 'String'
		 * Java can interpret that the method call 'empty()' must also
		 * have a type variable 'String'. 
		 * Therefore we can omit the type variable in the following way: */
		LispList<String> vegetables = LispList.empty();
	}
}