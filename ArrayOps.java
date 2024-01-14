public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        
        int missing=0;

        if (array.length==1) {
            return 1;
        }
        for (int i=0;i<array.length;i++)
        { 
            if (!(isExs(array, i))) {
                return i;
            }
            
        }
        return missing;
    }

    public static boolean isExs (int [] array,int x) {
        
        
        for (int i=0;i<array.length;i++) {
            if (array[i]==x) {
                return true;
            }
        }
        return false;
    }

    public static int secondMaxValue(int [] array) {
        
        int  max=0;
        int secmax=0;
        for (int i=0;i<array.length;i++) {
            if (max<=array[i]) {
                secmax=max;
                max=array[i];
            }
        }
        
        return secmax;
    }

    public static int MaxValue(int [] array) {
        
        int  max=0;
        for (int i=0;i<array.length;i++) {
            if (max<=array[i]) {
                max=array[i];
            }
        }
        
        return max;
    }


    

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        
        int maxlen=Math.max(array1.length, array2.length);
        if (array2.length>=array1.length) {
            for (int i=0;i<maxlen;i++) {
                if (!(isExs(array1,array2[i]))) {
                    return false;

                }
    
            }
        }else{
            for (int i=0;i<maxlen;i++) {
                if (!(isExs(array2,array1[i]))) {
                    return false;

                }
    
            }


        }

        
        

        return true;
    }

    public static boolean isSorted(int [] array) {
        
        if (array.length <= 1) {
            return true; 
        }
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                decreasing = false;
            } else if (array[i] < array[i - 1]) {
                increasing = false;
            }

            
            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;




       
    }


}
