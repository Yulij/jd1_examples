package lecture01;

public class FunctionTest {
	public static void main(String[] args) {
		Function function = new Function();
		FunctionUtils.changeFunctionName(function);
		System.out.println(function.getFunctionName());
	}
}
