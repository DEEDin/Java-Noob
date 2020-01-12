public class Execute{
	void Execute(){
		System.out.println("instructor");
	}
	void Execute(String name){
		System.out.println("to call is " + name);
	}
	void Execute(String name, int t){
		System.out.println("Konnichiwa is "+ name);
		System.out.println("time is  "+ t);
	}
public static void main(String[] args){
	Execute e= new Execute();
	e.Execute();
	e.Execute("Dell");
	e.Execute("Ohayo");
	e.Execute("Ohayo",200);
	}
}