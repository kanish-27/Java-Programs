class E_AnonymousArray {
	public static void main(String[] args)
	{
		// Passing an anonymous array to the sum method directly
		// the array is created and passed in one line
		sum(new int[]{ 1, 2, 3 });
	}

	static void sum(int[] a)
	{
		int total = 0;

		// using for-each loop
		for (int i : a)
			total = total + i;
		
		System.out.println("The sum is: " + total);
	}
}
