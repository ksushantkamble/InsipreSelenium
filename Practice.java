package Ashwini;
public class Practice {
	public static void main(String[] args) {
		System.out.println(Main.x);
	}
	}
	class Main
	{
		public static final int x =10;
		
		static
		{
			System.out.println("main -- static block");
		}
}
