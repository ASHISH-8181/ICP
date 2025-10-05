class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> temp=new ArrayList<>();
        add(candidates,target,ans,temp,0);
        return ans;
        
    }
    void add(int[]arr,int target,List<List<Integer>>ans, List<Integer> temp,int index){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1])continue;//skip duplicate
            if(arr[i]>target)break;// invalid element
        
        
        // include 
        temp.add(arr[i]);
        add(arr,target-arr[i],ans,temp,i+1);// index should be reused
        // exclude
        temp.remove(temp.size()-1);
        }
    }

}
