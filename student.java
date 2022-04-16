import java.util.*;
class students{
    String name;
    int cls;
    int marks;
    void setDetails(){
    Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Name of student:");
    name = sc.nextLine();
    System.out.println("Class of the student");
    cls = sc.nextInt();
    System.out.println("Marks obtained by the student");
    marks = sc.nextInt();
}
    void getDetails(){
        if (marks > 40){
            System.out.println("Name of the student - "+name+". Class of the student - "+cls+". Marks obtained by the student - "+marks+". Has the student passed? Yes");
} else if (marks < 40){
            System.out.println("Name of the student - "+name+". Class of the student - "+cls+". Marks obtained by the student - "+marks+". Has the student passed? No");
}
}}
    public class student{
        public static void main(String[] args){
        students st1 = new students();
        st1.setDetails();
        st1.getDetails();
        students st2 = new students();
        st2.setDetails();
        st2.getDetails();
        students st3 = new students();
        st3.setDetails();
        st3.getDetails();
        students st4 = new students();
        st4.setDetails();
        st4.getDetails();
        students st5 = new students();
        st5.setDetails();
        st5.getDetails();
        
}
}
    



















