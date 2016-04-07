
class Class_MethodUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_Method a= new Class_Method(13);//괄호 안이 생성자
		
		int[] x = new int[10];
		int[] y = new int[10];
		
		for(int i=0;i<x.length;i++)
		{
			x[i]=i+1;
		a.chinokawai(x[i]);			
		}

		a.annoyobot(y);
		
		System.out.println(a.age);
		System.out.println(a.ichinenato());	
		//System.out.println(a.Chino_Name);//chino는 private되고 있어!
		
		
		
	}

}
