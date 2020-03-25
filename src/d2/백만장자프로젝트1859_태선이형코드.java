package d2;
import java.util.Scanner;
class 백만장자프로젝트1859_태선이형코드
{
   public static void main(String args[]) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int T;
      T=sc.nextInt();
       
        long sum = 0;
      for(int test_case = 1; test_case <= T; test_case++)
      {
         int day = sc.nextInt();
            int[] cost = new int[day];
            for(int i = 0; i < day; i++){
                cost[i] = sc.nextInt();
            }
             
         sum = 0;
            for(int i = 0; i < day-1; i++){
                  int max = 0;
                for(int k = i+1; k<day;k++){
               if(cost[i] < cost[k]){
                  max = cost[k];
                  for(int j = k+1; j <day; j++){
                     if(max < cost[j]){
                        max = cost[j];   
                     }
                  }
                  sum = sum + max - cost[i];
                        break;
               }
            }
            }
            System.out.println("#"+test_case+" "+sum);
      }
   }
}