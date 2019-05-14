public class Main 
{
	public static void main(String args[]){
	  //Question 1
	  int[] myArray = {2, 4, 5, 1, 3, 4, 5};
	  System.out.println(firstDuplicateIn(myArray));
	  int[] myArray2 = {2, 6, 5, 1, 3, 4, 5, 4};
	  System.out.println(firstDuplicateIn(myArray2));
	  
	  //Question 2
	  System.out.println(isPalindrome("radar"));
	  System.out.println(isPalindrome("bob"));
	  System.out.println(isPalindrome("asdfdsa"));
	}
	
	public static int firstDuplicateIn(int[] array){
	  //Checks for duplicate numbers, returns when it finds a pair of duplicates
	  for(int i = 0; i < array.length; i++){
		for(int a = 0; a < array.length; a++){
          if(a != i && array[a] == array[i]){
		    return array[a];
		  }
	    }
	  }
	  //Returns the first item in the array if there are no duplicates
	  return array[0];
	}
	
	public static boolean isPalindrome(String testString){
	  String reverse = "";
	  for(int i = testString.length() - 1; i >= 0; i--){
	    reverse += testString.charAt(i);
	  }
	  
	  if(testString == reverse){
	    return true;
	  }
	  return false;
	}
}
