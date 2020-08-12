package proj1;
public class Interf implements MyInterface{ 
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	Interf obj = new Interf();
    	obj.newMethod();   
        MyInterface.anotherNewMethod();  
        obj.existingMethod("Java 8 is easy to learn");       
    }  
}
interface MyInterface{  
    default void newMethod(){  
        System.out.println("Newly added default method");  
        printPrivate();
        printPrivateStatic();
}   
    static void anotherNewMethod(){
    	System.out.println("Newly added static method");
    	printPrivateStatic();
}
void existingMethod(String str);  
private static void printPrivateStatic() {
	System.out.println("private static can go in default and in static");
	}   
private void printPrivate() {
	System.out.println("private without static keyword can go only in default");
	}
}  
