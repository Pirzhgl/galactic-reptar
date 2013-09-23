class A {
private int x;
public A(int t) {
x = t;
}
public void setX(int x) {
this.x = x;
}
public int getX() {
return x;
}
public String toString() {
String retStr = "" + x;
return retStr;
}
}
class B {
public static void main(String[]args){
int x = 5;
A c = new A(x);
A b = new A(0);
b = c;
b.setX(7);
/*1*/ System.out.println(x);
/*2*/ System.out.println(c.getX());
/*3*/ System.out.println(b);
{
}}}