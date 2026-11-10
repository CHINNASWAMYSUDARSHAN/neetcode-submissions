class Solution {
    public String longestCommonPrefix(String[] strs) {
        String min=strs[0];
        int min_len=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min_len){
            min_len=strs[i].length();
            min=strs[i];
            }
        }

        String res="";
        for(int i=0;i<min.length();i++){
            char ch=min.charAt(i);
            boolean same=true;
            for(int j=0;j<strs.length;j++){
                if(ch!=strs[j].charAt(i)){
                    same=false;
                    return res;
                }
            }
            if(same){
                res+=ch;
            }
        }
return res;
        
    }
}