class Solution {

    public String encode(List<String> strs) {

        String res="";
        for(String str:strs){
            res=res+str.length()+"#"+str;
        }
        return res;
    }

    public List<String> decode(String str) {
        System.out.print(str);
        List<String> list=new ArrayList<>();
        int i=0;
        String number="";
        while(i<str.length()){
            char ch=str.charAt(i);
            if(ch!='#'){
                number+=ch;
                i++;
            }else{
                int len=Integer.parseInt(number);
                int startIndex=i+1;
                list.add(str.substring(startIndex,len+startIndex));
                i=len+startIndex;
                number="";
            }
        }
        return list;

    }
}
