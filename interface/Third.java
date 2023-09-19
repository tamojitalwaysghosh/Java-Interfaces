// Java program to demonstrate working of
// interface inside another interface.

interface Test {
	interface Yes {
		void show();
	}
}

class Testing implements Test.Yes {
	public void show()
	{
		System.out.println("show method of interface");
	}
}

class Third{
	public static void main(String[] args)
	{
		//Test.Yes obj;
		Testing t = new Testing();
		//obj = t;
		t.show();
	}
}
