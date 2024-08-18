class Pair{

    int value;
    int fre;
    Pair(int value, int fre){

        this.value=value;
        this.fre=fre;
    }
}

class cmp implements Comparator<Pair>{

    public int compare(Pair p1, Pair p2){

         if(p1.fre ==p2.fre){

           if(p1.value > p2.value){
              return -1;
           }else{
            return 1;
           }
         }else{

             if(p1.fre <p2.fre){
                return -1;
             }else{
                return 1;
             }
         }
    }
}



class Solution {

    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> m= new HashMap();
        for(int i=0; i<nums.length;i++){
          
          if(m.containsKey(nums[i])){
             int old_fre=m.get(nums[i]);
             m.put(nums[i], old_fre+1);
          }else{
             m.put(nums[i],1);
          }
        }

        ArrayList<Pair> arr= new ArrayList();
        for( Integer key : m.keySet()){
            arr.add(new Pair(key,m.get(key)));
        }
      
      Collections.sort(arr, new cmp());
      
    //   for(Pair p : arr){
    //     System.out.println(p.value + " -> "+ p.fre);
    //   }

      int [] ans= new int[nums.length];
      int index=0;

      for(Pair p : arr){
         int fre= p.fre;
         while(fre>0){
            ans[index++]=p.value;
            fre--;
         }
      }

      return ans;

    }
}
