package stringtasks;

public class smallToCapital {

	public static void main(String[] args) {
		
			String str="SandHya";
			System.out.println("String before conversion:"+str);
			StringBuffer sb=new StringBuffer(str);
			for(int i=0;i<str.length();i++) {
				if(Character.isLowerCase(str.charAt(i))) {
					sb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
				}
			}
			System.out.println("String after conversion:"+sb);
		
	       }
	}

