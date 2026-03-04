/*class StringDemo {
    public static void main(String[] args) {
        String s = "Lucknow Junction";
        String s1 = "Lucknow Junction";
        String s2 = "lucknow JUNCTION";

        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
    }
}*/


/*class StringDemo{
	public static void main(String[] args){
		String s=" Lucknow Junction ";
		String s2=s.trim();
		System.out.println(s.length());
		System.out.println(s2.length());
	}
}*/


/*class StringDemo{
	public static void main(String[] args){
		String st = "Lucknow Junction";
		System.out.println(s.LastIndexOf('n'));
		char[] ch = s.toCharArray();
		System.out.println(ch.length);
		String s5 = new String(ch);
	}
}

class StringDemo {
    public static void main(String[] args) {

        String st = "Lucknow Junction";

        System.out.println(st.lastIndexOf('n'));

        char[] ch = st.toCharArray();
        System.out.println(ch.length);

        String s5 = new String(ch);
        System.out.println(s5);
    }
}*/




/*class StringDemo{
	public static void  main(String[] args){
		String s = "Lucknow";
		String s1 = s.substring(0,4);
		System.out.println(s1);
		String s2 = s.substring(4,7);
		System.out.println(s2);
		String s3 = s.substring(2);
		System.out.println(s3);
	}
}*/


/*class StringDemo{
	public static void main(String[] args){
		String s = "Lucknow-Kanpur-Banaras";
		String[] sa = s.split("-");
		for(int i=0; i<sa.length; i++){
			System.out.println(sa[i]);
		}
	}
}*/


/*class StringDemo{
	public static void main(String[] args){
		String s = "Lucknow";
		char[] ch = s.toCharArray();
		int i =0;
		int j=ch.length - 1;
		while(i<j){
			char temp = ch[i];
			ch[i] =ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		s = new String(ch);
		System.out.println(s);
	}
}*/

class StringDemo{
		public static void main(String[] args){
			String st = "Arafat";
			System.out.println(st);
		}
}




















 
