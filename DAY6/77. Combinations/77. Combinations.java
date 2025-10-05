class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        comb(n,k,ans,temp,1);
        return ans;
    }
    public void comb(int n,int k,List<List<Integer>> ans, List<Integer> temp, int i){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i>n)return;
        // include 
        temp.add(i);
        comb(n,k,ans,temp,i+1);
        //exclude
        temp.remove(temp.size()-1);
         comb(n,k,ans,temp,i+1);
        
    }
}
