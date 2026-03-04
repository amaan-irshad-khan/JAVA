class StringPatternSearch{
	public static void main(String[] args){
		String str = "I am an Integralite from Lucknow";
		String ptr = "gral";
		boolean token = false;
		for(int i=0; i <=(str.length()-ptr.length());i++){
			if(ptr.charAt(0) == str.charAt(i)){
				int j=1;
				while(j < ptr.length()){
					if(ptr.charAt(j) != str.charAt(i+j))break;
					j++;
				}
				if(j==ptr.length()){
					System.out.println("Pattern found at+ " + i);
					token = true;
					break;
				}
			}
		}
	//	if(token==false){
		if(!token){
			System.out.println("Pattern not found");
		}
	}
}


