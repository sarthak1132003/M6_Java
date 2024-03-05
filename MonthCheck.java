/* Write a java program to print name of months based on the number of months and also print if the months are odd or even */

class MonthCheck

{
public static void main(String[]args)
{
int month= 11;
 
if(month%2==0)
{
System.out.println("Month is Even ");
}
else
{
System.out.println("Month is Odd ");
}


switch(month)

{
case 1->System.out.println("Janaury");
case 2->System.out.println("February");
case 3->System.out.println("March");
case 4->System.out.println("April");
case 5->System.out.println("May");
case 6->System.out.println("June");
case 7->System.out.println("July");
case 8->System.out.println("August");
case 9->System.out.println("Setember");
case 10->System.out.println("October");
case 11->System.out.println("November");
case 12->System.out.println("December");
default->System.out.println("MOnth is greater than 12");
}
}
}
