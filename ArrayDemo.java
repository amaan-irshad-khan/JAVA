class ArrayDemo{
/*	public static void main(String[] args){
		int[][] td= {{1,2,3,4},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19}};
		int sum=0;
		for(int i=0; i<td.length; i++){
			sum += td[i][i];
		}
		System.out.println(sum);
	}*/


/*	public static void main(String[] args){
		int[][] td= {{17,21,33,41},{5,6,7,8},{10,11,12,13},{15,16,17,19}};
		int  sum=0;
		for(int i=0; i<td.length; i++){
			sum += td[i][td.length-1-i];
		}
		System.out.println(sum);

	}*/


/*	public static void main(String[] args){
		int[][] arr = new int[5][];
		for(int i=0; i<arr.length; i++){
			arr[i] =new int[] {0,0,0,0,0};
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}*/



/*	public static void main(String[] args){
		int[][] arr = {{17,21,33,41},{54,65,76,87},{10,11,12,13},{15,16,17,19}};

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}*/


	public static void main(String[] args){
		int  arr[][] = {{17,21,33,41},{54,65,76,87},{10,11,12,13},{15,16,17,19}};
		int temp;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<i; j++){
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}

		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.println(arr[i][j] + " ");
			}
		}

	}

}
