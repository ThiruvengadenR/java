class Son extends Mother
{
static int age = 21;
static int salary = 40000;
public static void main (String [] args)
{
Son play =  new Son();
System.out.println(super.salary);
play.cricket();
}
void cricket()
{
System.out.println(salary);
System.out.println(super.salary);
}
}

