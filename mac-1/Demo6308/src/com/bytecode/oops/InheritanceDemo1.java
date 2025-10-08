package com.bytecode.oops;
/*
 * 
 *  Single Inheritance:
 *  --------------------
 *  
 *  class   A{
 *  
 *  
 *  }
 *  class B extends A{
 *  
 *  }
 *  
 *  
 *  Multi-Level :
 *  -------------
 *  
 *  class   A{
 *  
 *  
 *  }
 *  class B extends A{
 *  
 *  }
 *  
 *  class C extends B{
 *  
 *  }
 *  
 *  ------------------------
 *  
 *  Hierarical  Inheritance:
 *  -----------------------
 *  
 *  class  A{
 *  
 *  }
 *  
 *  class  B extends A{
 *  
 *  
 *  }
 *  
 *  class  C extends A{
 *  
 *  
 *  }
 *  
 *  Hybrid Inheritance:
 *  --------------------
 *  class  A{
 *  
 *  }
 *  
 *  class  B extends A{
 *  
 *  
 *  }
 *  
 *  class  C extends A{
 *  
 *  
 *  }
 *  class D extends C{
 *  
 *  
 *  }
 *  class E extends D{
 *  
 *  
 *  }
 *  
 *  ====================
 *  Multiple Inheritance:  
 *  
 *  not possible in java through classes--->why?
 *  possible in java through interface------>why?===>
 *  
 *  class A{
 *  
 *  }
 *  
 *  class B{
 *  
 *  }
 *  
 *  class C extends A,B{
 *  
 *  }
 *  
 *  ==========================
 *  
 *  by default java ki sari classes me inheritance hota hai hum chahe extends kre ya nhi kre?
 *  
 *  sir kaise bol skte hai?
 *  
 * */ 


class Parent{
	int  a=10;
	
	void  m1() {
		System.out.println("1000 ");
	}
}
class Parent1{
	void m1() {
		System.out.println("2000");
	}
}
class Child extends Parent{
	
}

public class InheritanceDemo1{

	public static void main(String[] args) {
		
	}

}
