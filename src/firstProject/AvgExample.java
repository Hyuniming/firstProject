package firstProject;

public class AvgExample {

	public static void main(String[] args) {
		
		// 국,영,수 ( 0~100)
		// 국어 : 85 수학 : 88 영어 : 83
		// 합계, 평균
		int kor = 85;
		int Eng = 88;
		int Math = 83;
		
		int sum = kor+Eng+Math ;
		double avg = sum/3.0;
		
		String name = "홍길동";
		
		
		System.out.println("국,영,수 합계 = " + sum);
		System.out.println("국,영,수 평균 = " + avg);
		System.out.println ( name + "의  점수합계는 =" + sum + "평균은: " + avg + "입니다.");
		
		// TODO Auto-generated method stub

	}

}
