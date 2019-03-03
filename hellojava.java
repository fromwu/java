
public class hellojava {
    public static void main(String []args) {
       System.out.println("Hello World");
       String s1 = "Canada";        //String作为基本类型，基本类型==比较的是值
       String s2 = "Canada";

       String s3= new String(s1);       //String为对象，引用类型，引用类型==比较的是堆荐地埴；equals比较的是值
       String s4= new String("Canada"); 
       
       if(s1 == s2) System.out.println("s1 == s2");
       if(s1 == s3) System.out.println("s1 == s3");
       if(s3 == s4) System.out.println("s3 == s4");
      
       if(s1.equals(s2)) System.out.println("s1.equals(s2)");
       if(s1.equals(s3)) System.out.println("s1.equals(s3)");
       if(s1.equals(s4)) System.out.println("s1.equals(s4)");
    }
}