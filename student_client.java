package oops;

public class student_client {
      public class Student_client{
        public static void main(String[] args) {
          // here s ,s1 and s2 are objects comprising of class student which is defines in the previous file student.java
          
          student s = new student();
          s.name = "john price";
          s.age = 47;
          s.work = "captain";
          s.intro();
          //System.out.println(s); // this will show the address of the object

          student s1 = new student();
          s1.name = "laswell";
          s1.age = 42;
          s1.work = "station cheif";
          s1.intro();

          student s2 = new student();
          s2.name = "soap";
          s2.age = 35;
          s2.work = "sergent";
          s2.intro();
        }
      }
}
