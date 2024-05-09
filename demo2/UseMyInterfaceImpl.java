package demo2;

public class UseMyInterfaceImpl {
	public static void main(String[] args) {
		MyInterfaceImpl mi=new MyInterfaceImpl();
		
		System.out.println(mi.n);
		mi.display();
	}
}
