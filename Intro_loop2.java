package home.thiru;

public class Intro_loop2 {
	public static void main(String[] args) {
		Intro_loop2 loop = new Intro_loop2();
		loop.increment2();
		System.out.print( "\n");
		loop.incrementOdd();
		System.out.print("\n");
		loop.increment3Table();
		System.out.print("\n");
		loop.decrement5Tables();
		
		
	}
void increment2()
{
	int count = 2;
	while(count<=10)
	{System.out.print(count + " ");
count = count +2;
	}
}
void incrementOdd()
{
	int count = 1;
	while(count<10)
	{
		System.out.print(count + " ");
		count = count +2;
	}
}
void increment3Table()
{
	int count = 3;
	while(count<=15)
	{
		System.out.print(count + " ");
		count = count +3;
	}
}
void decrement5Tables()
{
	int count = 25;
	while(count>=5)
	{
		System.out.print(count + " ");
		count = count -5;
	}
}
}
