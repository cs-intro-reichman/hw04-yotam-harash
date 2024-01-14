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

    public static String capVowelsLowRest (String string) {
       
        String vowels="aeiou";
        String str ="";
        for (int i = 0; i < string.length(); i++) {
            char  check=string.charAt(i);
            if (!(vowels.indexOf(check)==-1)) {
                str=str+ (char)(check-32);
            }else if (check>='A'&&check<='Z') {
                str=str+ (char)(check+32);
            }else {
                str+=str;

            }

        }


        return str;
    }

    public static String camelCase (String string) {
        
        int count=0;
        String str ="";
        boolean stop=true;
        boolean first=true;
        int firstlet=0;
        //takes care of short words
        if (str.length()==1) {
            char  check=string.charAt(1);
            if (check>='A'&&check<='Z') {
                return str=str+ (char)(check+32);

            }

            return string;
        }
        //delete first spaces
        for (int i = 0; i < string.length()&&first; i++) 
        {
            char  check=string.charAt(i);
            if (!(check==' ')) {
                first=false;
                

            }else{
                count++;
            }

        }
        //change the  first word to small  letters
        for (int i = count+1; i < string.length()&&stop; i++) 
        {
            char  check=string.charAt(i);
            if ((check==' ')) {
                stop=false;
                break;
            }
            if ((check>='A'&&check<='Z')){
        
                str=str+ (char)(check+32);
                count++;

            }else{

                str+=check;
                count++;
                
            }
            
            

        }
        //advance to the rest of the words and changes the first letter only to capital
        for (int i = count+1; i < string.length(); i++) 
        {
            char  check=string.charAt(i);
            if ((!(check==' '))) {
                if (firstlet==0) {
                    if ((check>='a'&&check<='z')) {
                        str=str+ (char)(check-32);
                        firstlet++;
        
                    }else  {
                        str+=check;
                        firstlet++;
                    }
                }else if ((check>='A'&&check<='Z')) {
                    str=str+ (char)(check+32);
                }else{
                    str+=check;
                }

                
            }else{
                firstlet=0;
            }

           
        }



        return str;
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
