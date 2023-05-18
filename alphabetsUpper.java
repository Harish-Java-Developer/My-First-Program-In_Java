class alphabetsUpper{
	public static void main (String []args){
		char i='a';
		for (i='a';i<='z';i++){
		 	 if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
                continue;
		 	 System.out.println(i);
		}System.out.println("there are 21 consonants over here");
		char j='z';
	    for (j='z';j>='a';j--){
		 	 if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u')
		System.out.println(j);
	}System.out.println("there are 5 vowels over here");
 }
}
				