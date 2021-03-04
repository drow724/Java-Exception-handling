
public class Program {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int result = 0;

		result = Calculator.add(3,1004);
		System.out.printf("add : %d\n", result);
		result = Calculator.sub(3,4);
		System.out.printf("sub : %d\n", result);
		result = Calculator.multi(3,4);
		System.out.printf("multi : %d\n", result);
		result = Calculator.div(3,4);
		System.out.printf("div : %d\n", result);
//		스태틱 메소드 방식으로 사용
//		넘겨받은 지역 변수를 사
	}
}