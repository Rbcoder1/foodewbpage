public class Main {
 
    public static void main(String[] args) {        
        Main main = new Main();
        int result = main.pivotIndex(new int[] {4, 7, 3, 6, 8, 6});
        System.out.print(result);       
    }
     
    /* Solution */   
    public int pivotIndex(int[] nums) {
         
        int sum = 0;
        for(int value : nums){
            sum = sum + value;
        }
         
        int start = 0, index = 0;
        for(index=0; index<nums.length; index++){
             
            sum = sum - nums[index];
            if(start == sum){
                return index;
            }
            start = start + nums[index];
        }
        return -1;
    }
}
