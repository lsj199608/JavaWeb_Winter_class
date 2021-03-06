package ex0112.constructor;

/**
 * 학생의 정보를 관리(조회, 변경)하는 클래스
 */
public class Student {
    /**
     * 필드선언 = 멤버변수 = 전역변수 : 외부로부터 데이터 보호(private 선언)
     *  : 외부에서 직접 접근 불가, 반드시 내부에 제공되는 메소드를 이용해서
     *  데이터 접근할 수 있도록 하는것(setXxx( ), getXxx()제공!!!)
     */
    private String name;
    private int sno;
    private String addr;

    /**
     * 생성자 작성
     *  : 관례적으로 기본생성자 만들고 오버로딩 하는 것 권장.
     */
    public Student(){}
    public Student(String name, int sno, String addr){
        //데이터 초기화
        this(name, sno);
    }

    //수정할때 사용할 생성자 ==>위의 생성자와 중복됨.
    public Student(String name, int sno){
        this.name=name;
        this.sno=sno;
    }
    /**
     * setXxx 메소드 : 제한자는 public, 리턴타입은 void, 인수 필수
     * getXxx 메소드 : 제한자는 public, 리턴타입은 필수, 인수 없음
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
