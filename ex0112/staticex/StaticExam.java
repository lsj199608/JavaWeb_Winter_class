package ex0112.staticex;

class Test{
    int a=5;
    static int b=7;// 여러개의 객체가 공유하는 변수가 된다.

    public void aa(){
        System.out.println(a); //5
        System.out.println(this.a); //5

        System.out.println(b);//7
        System.out.println(this.b);//7
        System.out.println(Test.b);//7 - 권장
    }
    public void bb(){
        aa();
        this.aa();

        cc();
        this.cc();
        Test.cc(); //-권장
    }

    /**
     * static 메소드는 객체 생성없이 클래스이름.메소드이름() 호출 가능
     * static 영역 안에서 non-static 호출할 수 없다.
     * static 메소드 안에서 this 키워드 사용 불가
     */
    public static void cc(){
        //System.out.println(a); //5
        //System.out.println(this.a); //5

        System.out.println(b);//7
        //System.out.println(this.b);//7
        System.out.println(Test.b);//7 - 권장
    }
    public static void dd(){
        //aa();
        //this.aa();

        cc();
        //this.cc();
        Test.cc(); //-권장
    }

}
public class StaticExam {
    public static void main(String[] args){
        //aa를 호출
        //Test t = new Test();
        //t.aa();

        //Test.cc();

        System.out.println("-----------------------");
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        System.out.println("t1 = "+t1);
        System.out.println("t2 = "+t2);
        System.out.println("t3 = "+t3);

        System.out.println(t1.a);
        System.out.println(t2.a);
        System.out.println(t3.a);

        t1.a = 100;
        System.out.println("non-static 변수 값 변경 후");
        System.out.println(t1.a);
        System.out.println(t2.a);
        System.out.println(t3.a);

        System.out.println("---------static 변수인 경우");
        System.out.println(t1.b);
        System.out.println(t2.b);
        System.out.println(t3.b);

        t1.b=50; // = Test.b =70; 즉, static은 모든 것을 공유
        System.out.println(t1.b);
        System.out.println(t2.b);
        System.out.println(t3.b);

    }
}
