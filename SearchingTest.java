class SearchingTest{
	public static void main(String[] args){
		int[] a = {2,20,8,7,15,4,9,58};
		int x = 4;
		SearchingAlgos sa = new SearchingAlgos();
		int result = sa.LinearSearch(a,x);
		if(result == -1){
			System.out.println("Does not found");
		}else{
			System.out.println("found at " + result);
		}
	}
}
