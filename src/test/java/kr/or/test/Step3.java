package kr.or.test;

import java.util.Calendar;

/**
 * 외부Enum클래스를 이용해서 열거형 자료형 테스트
 * 
 * @author 김수연
 *
 */
public class Step3 {

	public static void main(String[] args) {
		// 메인 메서드-스레드 시작.
		Week today = null;// week자료형용 today 변수
		// String today2 = null; //String자료형용 today2 변수생성
		// MemberVO memberVO = new MemberVO();
		// MemberVO자료형용 memberVO변수선언
		// 현재 날짜가 무슨 요일인지 한글로 확인 하는 프로그램(아래)
		Calendar calendar = Calendar.getInstance();// 객체선언 calendar객체변수 =인스턴스변수
		// calendar 오브젝트에서 현재요일을 반환받기(1~7까지 반환)
		int intweek = calendar.get(Calendar.DAY_OF_WEEK);
		// 스위치 조건문으로 1~7까지 반환값으로 한글로 변환(아래)
		switch (intweek) {
		case 1: 
			today = Week.일; break;//브레이크는 case문장을 빠져나가는 문장
		case 2: 
			today = Week.월; break;
		case 3: 
			today = Week.화; break;
		case 4: 
			today = Week.수; break;
		case 5: 
			today = Week.목; break;
		case 6: 
			today = Week.금; break;
		case 7: 
			today = Week.토; break;
		}
		System.out.println("PC의 오늘 요일은: " + today + "요일 입니다.");
		
		if(today == Week.수) {//이번엔 if조건문을 사용.
			System.out.println("수요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
		//Calendar클래스는 달력에서 날짜, 본인 컴퓨터 날짜라서 사용자가 날짜를 수정하면 훼손됨
		//이 때 해결책은 서버시간을 가져와서 출력하면, 사용자가 날짜를 수정 못하게 됩니다.
	}

}
