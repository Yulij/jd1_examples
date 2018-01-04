package lecture01;

public class Function {
	private String functionName;

	public int functionTest(int i) {
		i++;
		System.out.println("I from method = " + i);
		return i;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

}
