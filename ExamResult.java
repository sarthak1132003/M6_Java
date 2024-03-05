class ExamResult
{
public static void main(String[]args)
{
System.out.println();
System.out.println( "           Shri Ganesh Vidyalaya");
System.out.println("           Maharashtra StateBoard");
System.out.println("-------------------------------------------");
System.out.println();
System.out.println( "Name= Sarthak Anil Gadhave   Date=18/6/2022");
System.out.println("Rolln0=29     Class=10A         Exam=Summer");
System.out.println("-------------------------------------------");
System.out.println("Subject        FullMarks         MarksObtain");
System.out.println("-------------------------------------------");
System.out.println("");

int M1=67;
int M2=69;
int M3=89;
int M4=91;
int M5=97;
int Mo=M1+M2+M3+M4+M5;
int Per=(Mo*100)/500;

String Grade=(Per>=80 && Per<=100)?("A"):
(Per>=60 && Per<80)?("B"):
(Per>=40 && Per<60)?("C"):
(Per>=0 && Per<40)?("F"):("");

System.out.println("1.Marathi         100                "+ M1);
System.out.println("");
System.out.println("2.Hindi           100                "+M2 );
System.out.println("");
System.out.println("3.English         100                "+M3 );
System.out.println("");
System.out.println("4.Science         100                "+M4 );
System.out.println("");
System.out.println("5.SocialS         100                "+M5);
System.out.println("");
System.out.println("-------------------------------------------");
System.out.println("Total Marks       500                "+ Mo );

System.out.println("");
System.out.println("-------------------------------------------");

System.out.println("Percentage="+Per +"                      Grade="+Grade);

System.out.println("Remarks = Pass                   Singnature");
System.out.println("-------------------------------------------");


}
}

