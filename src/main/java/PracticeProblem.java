public class PracticeProblem {

	public static void main(String args[]) {
		double[] arr = new double[] {9, 7, 4, 2, 1, 0};
		System.out.println(insertionSort(arr)[0]);

		for (int i = 0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	public static int[] bubbleSort(double[] nums){
		int[] values = new int[] {0, 0};
		boolean didSort = true;
		double temp = 0;
for (int i = 1; i<nums.length-1&&didSort;i++){
	didSort = false;	
	for (int j = 0; j<nums.length-i;j++){

	values[1]++;
		if (nums[j]>nums[j+1]){
			//swap
			temp = nums[j];
			nums[j] = nums[j+1];
			nums[j+1] = temp;
			values[0] = values[0]+3; 
			didSort = true;	
		}
	
	}
}
		return values;
	}

	public static int[] selectionSort(double[] nums){
		int[] values = new int[] {0, 0};
		double temp = 0;
		int Index = -1;
for (int i = 0; i<nums.length-1;i++){
Index = i;
	for (int j = i+1; j<nums.length;j++){
		if (nums[j]<nums[Index]){
			Index = j;
			values[0]++;
		
		}	
		values[1]++;
	}
	temp = nums[Index];
	nums[Index] = nums[i];
	nums[i] = temp;
	values[0] = values[0]+3; 
}
		return values;
	}

public static int[] insertionSort(double[] nums){
int[] values = new int[] {0, 0};
double key;
for (int i = 1; i<nums.length;i++){
key = nums[i];
values[0]++;
int index = i-1;

	while (index>=0 && key<nums[index]){
		values[1]++;
		//move up
		nums[index+1] = nums[index];
		values[0]++;
		index--;
	}
	nums[index+1]=key;
	values[0]++;
}



return values;
}

public static String leastSwaps(double[] nums){
	String sort = "Bubble";
double[] numsCopy = new double[nums.length];
for (int i = 0; i<nums.length;i++){
	numsCopy[i] = nums[i];
}
int bSort = bubbleSort(numsCopy)[0];
for (int i = 0; i<nums.length;i++){
	numsCopy[i] = nums[i];
}
int iSort = insertionSort(numsCopy)[0];
for (int i = 0; i<nums.length;i++){
	numsCopy[i] = nums[i];
}
int sSort = selectionSort(numsCopy)[0];
for (int i = 0; i<nums.length;i++){
	numsCopy[i] = nums[i];
}

if (bSort>iSort){
	if (sSort > iSort){
sort = "Insertion";
	}
	else{
sort = "Selection";
	}

}
	return sort;
}

public static String leastIterations(double[] nums){
	String sort = "Bubble";
double[] numsCopy = new double[nums.length];
for (int i = 0; i<nums.length;i++){
	numsCopy[i] = nums[i];
}
int bSort = bubbleSort(numsCopy)[1];
for (int i = 0; i<nums.length;i++){
	numsCopy[i] = nums[i];
}
int iSort = insertionSort(numsCopy)[1];
for (int i = 0; i<nums.length;i++){
	numsCopy[i] = nums[i];
}
int sSort = selectionSort(numsCopy)[1];
for (int i = 0; i<nums.length;i++){
	numsCopy[i] = nums[i];
}

if (bSort>iSort){
	if (sSort > iSort){
sort = "Insertion";
	}
	else{
sort = "Selection";
	}

}
	return sort;
}

}