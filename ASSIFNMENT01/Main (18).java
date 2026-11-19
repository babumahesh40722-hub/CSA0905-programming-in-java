import java.util.*;
public class Main { public static void main(String[] a) { String[][] slots={new String[20],new String[50],new String[30]}; String reg="TN01AB1234"; slots[0][0]=reg; int floor=0,slot=0; System.out.println("Vehicle="+slots[floor][slot]+", floor="+floor+", slot="+slot); int minutes=90, hours=(minutes+59)/60; System.out.println("Fee at Rs.30/hour = Rs."+(hours*30)); } }
