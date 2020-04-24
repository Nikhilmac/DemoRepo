package jala.Corejava.Inheritance;
public class Interface {
	public static void main(String[] args) {
	kit k=new kit();
	writer p=new pen();writer pc=new pencil();
	k.dosomething(pc);
	}}
abstract class writer{
	public abstract void write();}
class pen extends writer
{
	public void write()
	{
		System.out.println("im a pen");
}}
class pencil extends writer{
	public void write()
	{
		System.out.println("im a pencil");
	}	}
class kit {
	public void dosomething(writer p){
		p.write();}}