public class Method_local_class {
 
	void my_method()
	{ int num = 23;
		class method_class_demo{
			void show()
			{
				System.out.println(" Method local class :"+num);
				
			}
		}
		method_class_demo obj = new method_class_demo();
		obj.show();
	}
	public static void main(String[] args) {
		
		Method_local_class obj2 = new Method_local_class();
		obj2.my_method();

	}

}
