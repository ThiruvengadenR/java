class phoenixmall
{
static String owner_name = "Thiruvengaden";// global variable 
static int Tricket_prize= 165;// global variable
String Movie_name; // instances variables
public static void main(String [] args)
{
phoenixmall screen1 = new phoenixmall();
screen1.Movie_name = "NGK";
screen1.cost();
System.out.println(screen1.owner_name);
System.out.println(owner_name);
}
void cost()
{
System.out.println("cost of screen 1 movie tricket is"+ Tricket_prize);
System.out.println("cost of screen 1 movie tricket is"+ phoenixmall.Tricket_prize);
}
}
