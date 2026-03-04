class CharFreq{
	public static void main(String[] args){
		int i=0;
		int j=0;
		int count=0;
		String st = "Lucknow Junction";
		char[] ch = st.toCharArray();

		for(i=0; i<ch.length-1; i++){
			for(j=0; j < ch.length-1; j++){
				if(st.charAt(j) == st.charAt(i)){
					count ++;
				}
				System.out.println("Your count is: " count);
				else if(j < i && charAt[i] == CharAt[j]){
					System.out.println(ch[i] + "- " + count);
				}









class CharFreq{
	public static void main(String[] args){
		String s = "Lucknow Junction";
		int count = 0;
		ab:
		for(int i=0 ; i< s.length(); i++){
			if(s.charAt(i) == ' ')continue;
			count = 0;
			for(int j=0; j<s.length(); j++){
				if(j < i && s.charAt(i) == s.charAt(j)){
					continue ab;
				}
				if(s.charAt(i) == s.charAt(j)){
					count ++;
				}
			}
			System.out.println("Character" + s.charAt(i) + "freq" + count);
		}
	}
}




/*
class CharFreq {
    public static void main(String[] args) {

        String s = "Lucknow Junction";
        int count;

        ab:
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ')
                continue;

            count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (j < i && s.charAt(i) == s.charAt(j)) {
                    continue ab;
                }

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            System.out.println("Character " + s.charAt(i) + " freq = " + count);
        }
    }
}
*/



class CharFreq{
	public static void main(String[] args){
		int i=0;
		int j=0;
		int count;
		String s ="Lucknow Junction";

		char[] ch = st.toCharArray();

		for(i = 0; i < ch.length-1; i++){
			if( ch[i] == " " ){
				continue;
				count = 0;
			}

			for(j = 0; j < ch.length-1; j++){
				if( ch[i] 
