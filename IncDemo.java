class IncDemo{
	public static void main(String[] args){
		int x=10;
		int y=20,z=30;
		boolean b=(++x<y++) || (++y<++z);

/*		int a=++x;
		int b=y++;*/
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	//	System.out.println(b);

		boolean b=(++x<y++) || (++y<++z);
	}
}
