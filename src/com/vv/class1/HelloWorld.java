package com.vv.class1;
/**
 * object oriented, exception handling
 * multi threaded
 * free
 * garbage collection (no malloc)
 * Data Type
 * - byte(8),short(16), int(32), long(64),float(32), double(64) character, boolean, reference, array,string
 * Library
 * - java.lang, Object, Math, System, Boolean
 * - Util - set, map, vector, StringTokenizer, Date
 * Strongly Typed Lang, array index checks, no pointers
 * "arrays length can not be changed"only cell values can be changed
 * Object methods:
 * toString(), equals
 * Apparent(compiler) type vs real/actual type is type on creation
 * String is an object, StringBuilder, StringBuffer, String are immutable
 * String internally has an array of characters, concatenation
 * int[] arr = new int[1]; // default initialisation of the type
 * int[] arr = {1,2}
 * 
 * Runtime and Compile time objects
 * Object class is a parent of all classes. There are default constructors
 * upcast and not downcast
 * 
 * Imp methods: main(), toString(), 
 * For the compiler it is the declared type that counts.
 * Eclipse
 * =============
 * Integrated Dev Env
 * 
 * JUnit
 * ======
 * frameworks - timeout, exception(class=), before, after,test, beforeclass, afterclass
 * 
 * String is a ref to array of characters.They are immutable. A new string object is created when
 * you try to mutate a string. Use StringBuilder and StringBuffer
 * 
 * 
 * 
 */
//TODO tasks
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// String tests
		String a= "Hello";
		String b="Hello";
		String c = new String("Hello");
		String d = new String("Hello");
		// reference point to same string
		System.out.println(a==b); //true
		System.out.println(a==c); //false
		System.out.println(c==d); //false
		System.out.println(c.equals(d)); //true
		
		
		
	}

}
