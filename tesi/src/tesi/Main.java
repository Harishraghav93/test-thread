package tesi;

public class Main {
	 
	public static void main(String[] args) {
		
		/*int num1,num2;
		
		num1= prova.setval(90);
		num2= prova.setvalu(300);
		if (num1>100){
			num2=200;
			System.out.println(num2);
		}
		else if(num2>200) {
			num1=100;
			System.out.println(num1);
			System.out.println("Hello world!");
		}*/
		
		double a=5,b=3;
		double r1=a/b;
		System.out.println(r1);
		
		int s=5000;
		char c='a';
		int r2=c*s;
		System.out.println(r2);
		
		int i=6;
		float f=3.14F;
		float r3= i+f;
		System.out.println(r3);
		
		
		//prova res = new prova();
		//res.dettagli();
		
		Persona p1 = new Persona("harish","raghav",24,"errti");
		
		System.out.println(p1);
		
        Persona p2 = new Persona("yuva","kishore",24,"lmnop");
		
		System.out.println(p2);
		
		
		
	
	}
	

}
