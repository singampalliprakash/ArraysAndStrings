package arraysAndStrings;

public class MethodOverriding {
	

	public static void main(String[] args) {
		vivo vi=new vivo();
		vi.camera();
		
		y50 y=new y50();
		y.camera();
		
		vivo v=new y50();
		v.camera();
	}
}
class vivo
{
	void camera()
	{
		System.out.println("15 mega pixils");
	}
}
class y50 extends vivo
{
	void camera()
	{
		System.out.println("30 mega pixils");
	}
}
