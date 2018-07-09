package question1;

/**
 * Please implement Dynamic Array Interface 
 * @author 
 *
 */
public class MyCollection implements DynamicArray{
// Uncomment commented section
	
	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private int[] numArray;
	/**
	 * It constructs an empty Collection object with an array capacity specified by the integer
		parameter "arraySize".
	 */
	public MyCollection(int arraySize){
		numArray = new int[arraySize];
	}

	public int search(int searchingNum) {
		// TODO Auto-generated method stub
		for(int i=0;i<numArray.length;i++)
		{
			if(numArray[i]==searchingNum)
			{
				return i;
				
			}
		
		}
		return -1;
	}

	public boolean add(int numberToAdd) {
		// TODO Auto-generated method stub
	int exists=	search(numberToAdd);
	int result=getCount();	
	if(exists!=-1&&result<10)
	{
		for(int i=0;i<numArray.length;i++)
		{
			
		}
	}
	else if(result>10)
	{
		doubleCapacity();
		
	}
		
	else
	return false;
	}
		

	public void doubleCapacity() {
		// TODO Auto-generated method stub
		int[] doubled = new int[numArray.length * 2];
        for (int i = 0; i < numArray.length; i++) {
            doubled[i] = numArray[i];
        }
     
     }
		
	

	public boolean remove(int numberToRemove) {
		// TODO Auto-generated method stub
		if(search(numberToRemove)==-1)
		return false;
		else
		{
			for(int i=0;i<numArray.length;i++)
			{
				
			}
		}
	}

	public int getCount() {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<numArray.length;i++)
		{
			count++;
		}
		
		return count;
	}

	public int[] rotate(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
