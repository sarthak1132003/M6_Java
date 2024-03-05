/*WAP to check A person is eligible to donate the blood or not*/
class BloodDonation 
{
public static void main(String[]args)
{
int homoglobin=13;
int age=11;
char desease='N';
char drugs='N';

if(age>=18 && age<=60)
{
if(homoglobin==13)
{
if(desease=='N')
{
if(drugs=='N')
{
System.out.println("You're Allowed to donate the blood.");
}
else
{
System.out.println("You're Not Allowed to donate the blood.");
}
}
else
{
System.out.println("You're Not Allowed to donate the blood Get to the doctor.");
}
}
else
{
System.out.println("You're Not Allowed to donate the blood you're Homoglobin is low.");
}
}
else
{
System.out.println("You're Not Allowed to donate the blood you're Under age or Over age.");
}
}
}
