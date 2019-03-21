public class coinSum {
  public static void main(String[] args){
      int[] a = {1,2,5,10,20,50,100,200};
      int[] max = new int[8];
      int n =1;
      int count =0;
      for(int i =0;i<8;i++){
          max[i]=200/a[i];
      }
      while(n!=100){
          int amount =200;
            for(int i = 7;i>=1;i--){
                for(int j = max[i];j>0;j--){
                    int k =i;
                    while(amount !=0){
                        if(max[k]*a[k]>amount){
                            k--;
                            
                        }
                        else{
                            amount-=a[k];
                        }
                            
                    }
                }
            }
      }
  }  
}
