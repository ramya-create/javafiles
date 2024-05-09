package demo2;

public class wrapper {
	public static void main(String[] args) {
		//byte data type
		byte a=1;
		Byte byteobj=new Byte(a);
		
		//int data type
		int b=10;
		
		//wrapping around Integer object
		Integer intobj=new Integer(b);
		
		//float data type
		float c=18.6f;
		
		//wrapping around float object
		Float floatobj=new Float(c);
		
		//double data type
		double d=250.5;
		
		//wrapping around double object
		Double doubleobj=new Double(d);
		
		//char data type
		char e='a';
		
		//wrapping around characterobject
		Character charobj=e;
		
		//printing the values from objects
		System.out.println("vaues of wrapper object(printing as object)");
		System.out.println("Byte object byteobj: " + byteobj);
		System.out.println("Integer object intobj: " + intobj);
		System.out.println("Float object floatobj: " + floatobj);
		System.out.println("Double object doubleobj: " + doubleobj);
		System.out.println("Character object charobj: " + charobj);
		
		
		//object to data types (retrieving data types from objects)
		//unwrapping objects to primitive data types
		byte bv=byteobj; // unboxing..
		int iv=intobj;
		float fv=floatobj;
		double dv=doubleobj;
		char cv=charobj;
		
		//printing the values from data types..
		System.out.println("Unwrapped values (printing as data types)");
		System.out.println("byte value, bv: " + bv);
		System.out.println("int value, iv: " + iv);
		System.out.println("float value, fv: " + fv);
		System.out.println("double value, dv: " + dv);
		System.out.println("character value, cv: " + cv);
	}
}
