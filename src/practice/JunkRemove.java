package practice;

public class JunkRemove {

	public static void main(String[] args) {

		String junk = "$$0#@!hello,123";
		// By using regular expression  [^a-zA-Z0-9]
		//here except 0-9 everything will be replaced
		//what ever will be given in regular expression will be excluded 
		junk = junk.replaceAll("[^0-9]", "");
		System.out.println(junk);
						
	}

}
