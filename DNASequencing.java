public class DNASequencing {
    
    public static void main(String [] args){
        /*
        Name:       Mackenzie Cooper
        ID:         V#00892515
        Date:       October 23rd 2017
        Filename:   DNASequencing.java
        Details:    \csc110\ Assignment 5
        */
    //Change this array to test a specific DNA chain
    
    String[] testarray ={"blue","blue","red","yellow","green","blue","orange"};  
    printArray(testarray);
    String longest = findLongest(testarray);
    System.out.println("The longest string object is " + longest + " with a total of " + longest.length() + " characters." );
    findFrequency(testarray[0],testarray);
    hasMutation(testarray[0]);
    //boolean condition = derivedMutation(testarray[0]);
    int num = findFreqWithMutations(testarray[0],testarray);
    System.out.println("The targeted sequence has " + num + " mutations.");
    int numMutations = countTotalMutations(testarray);
    System.out.println("This sequence has " + numMutations + " mutations.");
    }//end of main
 
 
 
    public static void printArray(String[] strings) {
    //Prints out the contents of an array, one item per line.  
        for (int i=0; i<strings.length;i++) {
            System.out.println(strings[i]);
        }//end of for loop
    }//end of printArray method
 
 
 
    public static String findLongest(String[] strings) {
    //Finds the first occurrence of the longest item in an array of String objects.
    String longest = strings[0];  
        for (int i=0; i<strings.length; i++) {
            String referencevalue = strings[i];
                if(referencevalue.length() > longest.length()) {
                longest = referencevalue;
                }  
        }//end of for loop
   
    return longest;
    }//end of findLongest method
 
 
 
    public static int findFrequency(String target,String[] strings) {
    //Determines the number of times a particular item occurs within an array of String objects.
    int repeatcount = 1;  
        for(int i=0; i<strings.length-1; i++ ) {
            if (target==strings[i+1]) {
                repeatcount++;
            }
        }//end of for loop
   
    System.out.println("The string object " + target + " is repeated " + repeatcount + " times within the array.");
    return repeatcount;
    }//end of findFrequency method
 
 
 
   public static int findFreqWithMutations(String target,String[] seqArray) {
    int num = 0;
    for (int i=0; i < seqArray.length; i++) {
        String nonMutated = derivedMutation(seqArray[i]);
        if (nonMutated.equals(seqArray[i]) && target.equals(nonMutated)) {
          num++;
        }
    }
   
   
    return num;
    }//end of findFreqWithMutations method
   
 
    public static int countTotalMutations(String[] seqArray) {
    //Counts the number of mutated DNA sequences that occur within an array.
    int numMutations = 0;
    for (int i= 0; i<seqArray.length; i++) {
        if (hasMutation(seqArray[i])) {
            numMutations++;
        }
    }
   
    return numMutations;
   
    }//end of countTotalMutations method
 
 
 
    public static boolean hasMutation(String sequence) {
    //Determines if a given DNA sequence has a mutation.
    boolean hasCharacterRun = false;
        for (int i = 0; i<sequence.length()-1; i++) {
            if (sequence.charAt(i)==sequence.charAt(i+1)) {  
            hasCharacterRun = true;
            return hasCharacterRun;
            }
        }//end of for loop
        return hasCharacterRun;
    } //end of hasMutation method
 
    public static String derivedMutation(String target) {
        String nonMutation = target.charAt(0)+"";
        char hold = target.charAt(0);
        for (int i =0; i<target.length(); i++) {
            if (hold != (target.charAt(i))) {
                hold = target.charAt(i);
                nonMutation += hold;
           
            }
   
        }
        // System.out.println(nonMutation);
    return nonMutation;
    }  
}  