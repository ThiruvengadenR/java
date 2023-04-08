class phoenixmall
{
String Movie_name; // instances variables
int Time;
boolean Hit;
public static void main(String [] args)
{
phoenixmall screen1 = new phoenixmall();
screen1.Movie_name = "NGK";
screen1.Time = 10;
screen1.Hit = false ;
phoenixmall screen2 = new phoenixmall();
screen2.Movie_name = "PS2";
screen2.Time = 1030;
screen2.Hit = true ;
phoenixmall screen3 = new phoenixmall();
screen3.Movie_name = "maara";
screen3.Time = 1130;
screen3.Hit = true ;
phoenixmall screen4 = new phoenixmall();
System.out.println(screen1.Movie_name + screen1.Time + screen1.Hit);
System.out.println(screen2.Movie_name + screen2.Time + screen2.Hit);
System.out.println(screen3.Movie_name + screen3.Time + screen3.Hit);
}
}
