/* Write A program in java to take teperature input & display Suitable message according to range */

class TemptCheck
{
public static void main(String[]args)
{
int temp=13;

if(temp>=0 && temp<15)
{
System.out.println(" Temperature is very Cold");
}

else if(temp>=15 && temp<30)
{
System.out.println(" Temperature is  Cold");
}

else if(temp>=30 && temp<40)
{
System.out.println(" Temperature is Hot");
}

else if(temp>=40 && temp<50)
{
System.out.println(" Temperature is Exremely Hot");
}

else 
{
System.out.println(" ");
}
}
}
