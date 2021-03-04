
public class Program {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
//		calc.add();
// 		인스턴스화 시켜서 사용 Cal클래스 전역 변수를 사용
		int result = 0;
		try {
			result = Calculator.add(3,1004);
			System.out.printf("add : %d\n", result);
			result = Calculator.sub(3,4);
			System.out.printf("sub : %d\n", result);
			//예외 처리가 같으므로 같은 try문 안에 넣음
		}
		catch(천을_넘는_예외 e) {
			System.out.println("특화된 처리.");
			} 
		//한 가지 오류에 특화된 예외처리
		catch(Exception e) {
			System.out.println("음수 처리.");
			} 
		//나머지 예외 처리
		//Exception은 항상 마지막에
		finally {
			System.out.println("입력 값에 오류가 있습니다.");
		}
		//나머지 예외 처리
		//Exception은 항상 마지막에
//		try {
//			try {
//				result = Calculator.add(3,-4);
//			} catch (음수가_되는_예외 e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		//try 중첩 (좋은 예외 처리는 아님)
//		catch(천을_넘는_예외 | 음수가_되는_예외 e) {
//			System.out.println(e.getMessage());
//			} 
		//예외 처리가 같을 경우
//			catch (음수가_되는_예외 e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//둘의 예외가 다를 경우

		result = Calculator.multi(3,4);
		System.out.printf("multi : %d\n", result);
		result = Calculator.div(3,4);
		System.out.printf("div : %d\n", result);
//		스태틱 메소드 방식으로 사용
//		넘겨받은 지역 변수를 사
	}
}