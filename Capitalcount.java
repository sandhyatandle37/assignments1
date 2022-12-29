package stringtasks;

public class Capitalcount {

	public static void main(String[] args) {
		String str ="THat Is a Chair";
		System.out.println("given string:"+" "+str);
		for(int i=0;i<=str.length();i++) {
			if(str.charAt(i)>=65&&str.charAt(i)<=90) {
				System.out.println(str.charAt(i));
			}
				
		}

	}

}
