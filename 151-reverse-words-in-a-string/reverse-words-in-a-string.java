class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String [] words=s.split("\\s+");
       int n=words.length;
       StringBuilder str=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(i==0) str.append(words[i]);
            else str.append(words[i]+" ");
        }
        return str.toString();
    }
}









//  s=s.trim();
//         s=" "+s;
//         int end=s.length()-1;
//         String str="";
//         for(int i=end;i>0;i--){
//             if(s.charAt(i)==' '){
//                 end=i-1;
//             }
//             else{
//                 if(s.charAt(i-1)==' '){
//                     str=str+s.substring(i,end+1)+" ";

//                 }
//             }
//         }
//         return str.trim();