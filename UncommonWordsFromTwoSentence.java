class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map=new HashMap<>();
        String[] strArr1=s1.split(" ");
        for(String str : strArr1){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        String[] strArr2=s2.split(" ");
        for(String str : strArr2){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        String ans="";
        for (String key : map.keySet()) {
            if(map.get(key)==1) ans+=key+" ";           
        }
        return ans.equals("") ? new String[0] :ans.split(" ");
    }
}
