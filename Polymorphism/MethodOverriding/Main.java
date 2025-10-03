package Polymorphism.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        School s1 = new Elementary();   
        School s2 = new MiddleSchool(); 
        School s3 = new HighSchool();  

        s1.study(); 
        s2.study(); 
        s3.study(); 
    }
}
