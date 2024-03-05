/* Write a java programm to perform given task on given number input

1: check if the number is odd or even

2: check if the number is buzz number or not

3: check if the number is positive or not

4: check if the number is two digit or not */

class  CheckNum
{
public static void main(String[]args)
{ 
int num=5;
int switch_num=2;

switch(switch_num)
{
case 1: System.out.println("Check if the number is odd or even");
 if(num%2==0)
{
System.out.println("Number is Even Number");
}
else
{
System.out.println("Number is Odd Number");
}
break;

case 2:System.out.println("Check if the number is buzz number or not");
if(num%7==0 || num%10==7)
{
System.out.println("Given Number is Buzz No");
}
else
{
System.out.println("Given Number is Not Buzz No");
}
break;

case 3:System.out.println("Check if the number is positive or not");
if(num>=0)
{
System.out.println("Number is Positive number ");
}
else
{
System.out.println("Number is Negetive number ");
}
break;

case 4:System.out.println("Check if the number is two digit or not");
if(num>9 && num<100)
{
System.out.println("Number is 2 digit ");
}
else 
{
System.out.println("Number is Not 2 digit ");
break;
}
}
}
}
