/* WAP to calculate the Gades of students as per their marks*/

class Grade
{
public static void main(String[]args)
{
int Marks=70;

if(Marks>=90 && Marks<=100)
{
System.out.println("A+");
}

else if(Marks>=80 && Marks<90)
{
 System.out.println("A");
}

else if(Marks>=70 && Marks<80)
{
 System.out.println("B");
}

else if(Marks>=60 && Marks<70)
{
 System.out.println("C");
}

else if(Marks>=50 && Marks<60)
{
 System.out.println("D");
}

else if(Marks>=40 && Marks<5)
{
 System.out.println("E");
}
else if(Marks>=0 && Marks<40)
{
 System.out.println("Sorry Buddy you've Failed");
}
}
