package holamundo;

import java.util.Scanner;

public class Consola {
private Scanner sc;

public Consola()
{
this.sc = new Scanner(System.in);

}


public String readString(String msg)
{
System.out.println(msg);
return sc.nextLine();

}
public int readEntero(String msg)
{
System.out.println(msg);
return sc.nextInt();
}

public float readFloat(String msg)
{
System.out.println(msg);
return sc.nextFloat();
}






}