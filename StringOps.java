public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string){
        String vowels = "aeiouAEIOU";
        String str ="";
        for (int i = 0; i < string.length(); i++) {
            char check = string.charAt(i);
            if (vowels.indexOf(check) != -1) {
                // Convert to uppercase using ASCII values
                if (check >= 'a' && check <= 'z') {
                    str=str+((char)(check - 32));
                } else {
                    str+=check;
                }
            }else if (check >= 'A' && check <= 'Z') {
                // Convert to lowercase using ASCII values
                str=str+((char)(check + 32));
            } else {
                str+=check;
            } 
                
                
            
            
        }
        return str;
    }
    

    public static String camelCase(String string) {
        String result = "";
        boolean newWord = true;
    
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == ' ') {
                newWord = true;
            } else {
                if (newWord && result=="") {
                    if (c>='A'&&c<='Z') {
                        result=result+((char)(c + 32));
                    }else  {
                        result+=c;
                    }
                    
                    newWord = false;
                } else if (newWord) {
                    if (c>='a'&&c<='z') {
                        result=result+((char)(c - 32));
                    }else  {
                        result+=c;
                    }
                    newWord = false;
                } else {
                    if (c>='A'&&c<='Z') {
                        result=result+((char)(c + 32));
                    }else  {
                        result+=c;
                    }
                    
                }
            }
        }
    
        return result;
    }
    
        

    public static int[] allIndexOf (String string, char chr) {

        int len=0;
        int index=0;
        for (int i = 0; i < string.length(); i++) 
        {
            char check=string.charAt(i);
            if (check==chr) {
                len++;

            }
        }
        int[] loc=new int[len];
        for (int i = 0; i < string.length(); i++) 
        {
            char  check=string.charAt(i);
            if (check==chr) {
                loc[index]=i;
                index++;

            }
        }


        return loc;
    }
}
