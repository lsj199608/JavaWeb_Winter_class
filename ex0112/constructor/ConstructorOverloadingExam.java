package ex0112.constructor;
class Puppy3{
	/*String 타입 전역 변수 선언
		int 타입 전역 변수 선언*/
	String a;
	int b;

	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	Puppy3(){
		this.a = "메리";
		System.out.println("public puppy3() 호출되었습니다!");
		System.out.println(a);
		System.out.println(b);

	}

	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	Puppy3(String a){
		this.a = a;
		System.out.println("public Puppy3() 호출되었습니다.");
		System.out.println(this.a);
		System.out.println(this.b);
	}

	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/
	Puppy3(String a, String b){
		this(a+b);
		System.out.println("public Puppy3() 호출되었습니다");
	}


	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/
	Puppy3(boolean a){
		this("쫑"+a);
		System.out.println("public Puppy3() 호출되었습니다.");
	}


	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/
	Puppy3(char a){
		this();
		this.b = a;
		System.out.println("public Puppy3() 호출되었습니다");
		System.out.println(this.b);
	}


	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/
	void printMemberVariable(){
		System.out.println(this.a);
		System.out.println(this.b);
	}


}


class ConstructorOverloadingExam{
	//메인메소드에서
	public static void main(String [] args){
		//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
		Puppy3 p1 = new Puppy3();
		Puppy3 p2 = new Puppy3("Java");
		Puppy3 p3 = new Puppy3("Java", "Hi");
		Puppy3 p4 = new Puppy3(true);
		Puppy3 p5 = new Puppy3('A');

		System.out.println("=========주소값출력======");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		//각 객체의 printMemberVariable메소드를 한번씩 호출
		p1.printMemberVariable();
		p2.printMemberVariable();
		p3.printMemberVariable();
		p4.printMemberVariable();
		p5.printMemberVariable();
	}
}