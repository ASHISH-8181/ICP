class Solution {
    public void permutation(int[]arr,List<List<Integer>>ans, List<Integer>temp,boolean[]visited){
        if(arr.length==temp.size()){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(visited[i]==false){
                visited[i]=true;
                temp.add(arr[i]);
                permutation(arr,ans,temp,visited);
                visited[i]=false;
                temp.remove(temp.size()-1);

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[]visited=new boolean[nums.length];
        permutation(nums,ans,temp,visited);
        return ans;
        

        
    }
}