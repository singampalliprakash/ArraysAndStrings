package arraysAndStrings;
@FunctionalInterface
interface Lambda
{
	void Express();
}
public class FunctionalInterfaceUsingLambdaExpression {

	public static void main(String[] args) {
		Lambda la=()->
			System.out.println("Functional Interface by using Lambda expression...");
		la.Express();
	}

}
