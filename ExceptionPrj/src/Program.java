
public class Program {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
//		calc.add();
// 		인스턴스화 시켜서 사용 Cal클래스 전역 변수를 사용
		int result = 0;
		result = Calculator.add(3,4);
		result = Calculator.sub(3,4);
		result = Calculator.multi(3,4);
		result = Calculator.div(3,4);
//		스태틱 메소드 방식으로 사용
//		넘겨받은 지역 변수를 사
	}
}