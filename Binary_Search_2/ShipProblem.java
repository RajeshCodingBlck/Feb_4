class Solution {
    public boolean Api_ispossible(int [] arr, int d, int mid){
        
        int kitne_din_lagega=1;
        int sum=0;
        for(int i=0; i<arr.length;i++){ 
            sum+=arr[i];
            if(sum<=mid){
                continue;
            }else{
                kitne_din_lagega++;
                sum=arr[i];
            }
        }
        
        if(kitne_din_lagega<=d){
            
            return true;
        }else{
            return false;
        }
    }
    public int shipWithinDays(int[] weights, int days) {
        
        
       int max_val=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0; i<weights.length;i++){
            
            max_val= Math.max(max_val, weights[i]);
            sum+= weights[i];
        }
        
        int low= max_val;
        int high=sum;
        
        int ans=-1;
        while(low<=high){
            
            
            int mid= low+ (high-low)/2;
            
            System.out.println(mid+ ","+ Api_ispossible(weights, days, mid) );
            if(Api_ispossible(weights, days, mid)==true){
                
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
                
            }
        }
        return ans;
        
    }
}
