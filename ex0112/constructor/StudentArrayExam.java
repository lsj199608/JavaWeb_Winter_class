package ex0112.constructor;

public class StudentArrayExam {
    Student stArr[] = new Student[5];

    /**
     * 여러명의 학생의 정보를 저장
     */

    public void addStudent(String [][] data){ //2차원 배열의 주소값 전달
        System.out.println(stArr);

        /*for(Student st : stArr){ //향상된 for문. 아래와 같은 내용
            System.out.println(st);
        }*/
        for(int i=0; i<stArr.length; i++){
            System.out.println("stArr["+i+"] =" + stArr[i]); //null
        }

        //저장
        /**
         * 문자열String - 정수형 int 변환 ===캐스팅 안됨.
         *  : int no = Integer.parseInt(String s);
         *
         * 정수형 - 문자열 변환
         * String s = Integer.toString(int no);
         */
        System.out.println("--------생성후---------");
        for(int i=0; i< data.length; i++){
            //stArr[i] = this.create(data[i][0], Integer.parseInt(data[i][1]), data[i][2]);
            stArr[i] = this.create(data[i]);

        }

    }
    /**
     * Student 객체를 생성해서 데이터를 초기화하고 리턴해주는 메소드를 작성한다.
     */
    private Student create(String[] row){
        Student st = new Student(row[0], Integer.parseInt(row[1]), row[2]);

        return st;
    }
    /*private Student create(String name, int sno, String addr){ // == 매개변수 (String[] row)
        Student st = new Student();
        st.setName(name); //(row[0]);
        st.setSno(sno); //(Integer.parseInt(row[1]));
        st.setAddr(addr); //(row[2]);

        return st;
    }*/

    /**
     * 모든 학생의 정보를 출력하는 메소드
     */

    public void printStudent(){
        System.out.println("모든 학생의 정보 : "+ stArr.length+ "명 ---");
        for(int i=0; i<stArr.length; i++){ // == for(Student s:stArr)
            System.out.print("배열의 주소 : "+ stArr[i] + "\t");
            System.out.print("이름 : "+ stArr[i].getName() + "\t");
            System.out.print("학번 : "+ stArr[i].getSno() + "\t");
            System.out.print("주소 : "+ stArr[i].getAddr() + "\n");

        }
    }
    /**
     * 학번에 해당하는 학생의 정보 검색하기
     */
    public void search(int sno){
        for(Student st : stArr){
            if(st.getSno() == sno){
                System.out.println(st.getName()+"님의 주소는 "+st.getAddr());
                //break; //반복문을 벗어남
                return; // == 함수(메소드)를 벗어남
            }
        }
        System.out.println(sno+"의 정보는 존재하지 않습니다."); // return일 경우
    }

    /**
     * 회원 정보 수정(학번에 해당하는 학생의 이름, 주소 변경)
     */
    public void update(Student student){ //3개 속성값 관리
        //전달 학번에 해당하는 학생의 정보를 찾아서 이름과 주소 변경
        for(Student st : stArr){
            if(st.getSno() == student.getSno()){
                //값변경
                st.setName(student.getName());

                //st = student;<--이렇게 하면 안됨. 주소가 바뀌기 때문에 새로운 객체가 되는 것임.
                return;
            }
        }
    }
    public static void main(String[] args){
        /**
         * 학생의 초기치 데이터를 2차원 배열로 준비
         */
        //String [][] data = new String[5][3];
        String [][] data = new String[][] {
                {"희정", "100", "서울"},
                {"혜영", "200", "분당"},
                {"재훈", "300", "경기"},
                {"태호", "400", "강원"},
                {"민수", "500", "부산"},
        };
        StudentArrayExam sae = new StudentArrayExam();
        sae.addStudent(data);
        sae.printStudent();

        System.out.println("***검색하기 **");
        sae.search(300);
        sae.search(10);

        System.out.println(" ------------------------");
        Student st = new Student("희영", 200); //수정할 때 학번에 해당하는 이름 변경

        sae.update(st);
        sae.printStudent();

    }
}
