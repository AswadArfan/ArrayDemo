/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *Modified on jan 17th at 2:28pm by Aswad
 * Modified for third commit
 * @author aswad
 */
public class StudentList {
    public static void main(String[] args) {
        Student s1 = new  Student(1, "Aswad");
        Student[] StudentList = new Student[3];
        StudentList[0]=s1;
        StudentList[1]=new Student(2, "Arfan");
        StudentList[2]=new Student(3, "ABC");
        
        for (int i = 0; i<StudentList.length; i++){
            System.out.println(StudentList[i].getsName());
        }
    }
}
