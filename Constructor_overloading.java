class SuperMarket
{
String brand;
int price,discount;
SuperMarket(String brand, int price, int discount )
{
this.brand = brand;
this.price = price;
this.discount = discount;
}
SuperMarket(String brand, int price )
{
this.brand = brand;
this.price = price;
}

public static void main(String [] args)
{
SuperMarket oil = new SuperMarket("gold winner" , 175,31);
SuperMarket soap = new SuperMarket("madimix" ,65 ,5);
SuperMarket rice = new SuperMarket("LSG" ,46 );

oil.purchase();
soap.purchase();
rice.purchase();
}
void purchase()
{
System.out.println("Your product name is " + brand + "  with the prices of" + price + " and you have a special discount of" + discount);
}
}

