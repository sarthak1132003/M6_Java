/*write a program to check Temp from 0 to 50*/

public class Tempt
 {
    public static void main(String[] args) 
{
        float t = 35;
        

        String res = (t >= 0 && t < 10) ? ("Very cold"):
                (t >= 10 && t < 20) ? ("Cold"):
                             (t >= 20 && t < 30) ? ("Moderate"):
                                     (t >= 30 && t < 40) ? ("Summer"):
                                             (t >= 40 && t < 50) ? ("Very Hot"):
                                                     ("");


        System.out.println(res);
    }
}
