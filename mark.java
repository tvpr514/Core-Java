import java.util.*;
public class mark {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter marks in project :");
int p=s.nextInt();
System.out.println("Enter marks in external :");
int e=s.nextInt();
System.out.println("Enter marks in internal :");
int i=s.nextInt();
if(p>=50 && e>=50 && i>=50) {
int ts=((70*p)/100 + (20*e)/100 + (10*i)/100);
System.out.println("Total Score :"+ts);
if(ts>=90) {
System.out.println("A grade");
}
if(ts<90&&ts>=70) {
System.out.println("B grade");
}
if(ts<70&&ts>=50) {
System.out.println("C grade");
}
}
else {
if(p<50) {
System.out.println("Failed in Project...Marks:"+p);
}
if(e<50) {
System.out.println("Failed in External...Marks:"+e);
}
if(i<50) {
System.out.println("Failed in Internal...Marks:"+i);
}
}
}
}