import java.util.Arrays;

public class operations{
  public static void main(String[]args){
    double[][] ar ={{1,3,4},
                {5,3,7}};
    matrix a= new matrix(ar);
    System.out.println("matrix a:");
    System.out.println(a.toStr());
    a.switchrs(0,1);
    System.out.println("matrix a switched:");
    System.out.println(a.toStr());
    a.scalers(3,0);
    System.out.println("matrix a[0]*3:");
    System.out.println(a.toStr());
    a.scalers(1.0/3,0);
    System.out.println("matrix a[0]*1/3:");
    System.out.println(a.toStr());
    
    a.combo(2,1,0);
    System.out.println("matrix a[1)*2+0:");
    System.out.println(a.toStr());
  }

}