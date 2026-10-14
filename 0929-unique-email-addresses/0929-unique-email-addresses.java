class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> st=new HashSet<>();
        for(String email:emails){
            String clean_email=" ";
                String domain="";
                for(int i=0;i<email.length();i++){
                    if(email.charAt(i)=='.') continue;
                    if(email.charAt(i)=='+' || email.charAt(i)=='@') break;
                    clean_email+=email.charAt(i);
                }
                for(int i=email.length()-1;i>0;i--){
                    if(email.charAt(i)!='@'){
                        domain+=email.charAt(i);
                    }
                    else{
                        break;
                    }
                    
                }
                String new_email=clean_email+domain;
                st.add(new_email);                
        }
        return st.size();
    }
}