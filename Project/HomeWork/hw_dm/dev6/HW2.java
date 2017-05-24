
import java.util.*;

public class HW2{
  public static void main(String[] args){
    int k=1,w=2;
    int num=0;
    int sum=2;
    while(num <= 4000000)
    {
      num=k+w;
      if(num%2==0){
        sum+=num;
        System.out.println("num : "+num +" sum :" +sum);
      }
      k=w;
      w=num;
    }
    System.out.println("sum :" +sum);

}
}
