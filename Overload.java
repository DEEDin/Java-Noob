public class Overload{
public Overload(){
	System.out.println("Def Constructor");
	}
public Overload(String name){
	System.out.println("name is" + name);
	}
public Overload(String name,int i){
	System.out.println("name "+ name);
	System.out.println("price "+ i);
	}
public static void main(String[] args){
	Overload o= new Overload();
	Overload o2= new Overload("Deku");
	Overload o3= new Overload("Dell",430);
	}
	
}