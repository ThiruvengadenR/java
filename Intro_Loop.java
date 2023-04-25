package home.thiru;

public class Intro_Loop{
public static void main(String[] args) {
	Intro_Loop  loop = new Intro_Loop ();
	loop.repeat();
	System.out.println('\n');
	loop.repeat_increment();
}
void repeat()
{
	// 1 1 1 1 1 number as this 
	int count = 0;
	while(count < 5)
	{
		System.out.print( 1 + " ");
		count = count +1;
	}
}
void repeat_increment()
{
int count =0;
int value = 1;
while(count<5)
{
	System.out.print(value + " ");
	value = value +1;
	count = count +1;
}
}
}