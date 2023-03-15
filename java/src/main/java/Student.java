/**
 * @author yuanyi
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2023/3/2 9:05
 * @updateDate 2023/3/2 9:05
 **/
class Student extends Teacher{
   private String name = "student";

    public String getName(){
        return name;
    }

    public Student() {
        System.out.println("StudentConstructor");
    }
    public static void main(String[] args) {
        String str = "runoob";
        str = str.toUpperCase();
        str += "wwwrunoobcom";
        String string = str.substring(2,13);
        string = string + str.charAt(4);;
        System.out.println(string);
 /*       Student student = new Student();
        System.out.println(student.getName());

        String s = "BECA";
        System.out.println(getString(s));

        //执行for循环的顺序
        for (prinString(2);1==prinString(1);prinString(4)){
            prinString(3);
        }*/

    }

    //处理字符串
    private static String getString(String s){
        String s1 = "";
        s1 = s.replace("A","E");
        s1.toLowerCase();
        return s1;
    }

    private static int prinString(int s){
        System.out.println(s);
        return  s;
    }
}

class Teacher{
    public Teacher() {
        System.out.println("TeacherConstructor");
    }

    private String name = "teacher";
    public String getName(){
        return name;
    }
}
