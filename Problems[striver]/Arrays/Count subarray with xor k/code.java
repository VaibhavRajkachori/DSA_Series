public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int prefixXor=0;
        map.put(0,1);
        for(int i=0;i<A.size();i++){
            prefixXor^=A.get(i);
            if(map.containsKey(prefixXor^B)) count+=map.get(prefixXor^B);
            //if(!map.containsKey(prefixXor)) map.put(prefixXor,map.getOrDefault(prefixXor,0)+1);
            map.put(prefixXor,map.getOrDefault(prefixXor,0)+1);
            
        }
        return count;
    }
}
