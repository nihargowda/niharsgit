package eg1;

public class Builder {

	public static void main(String[] args) {
		String s1="hello hi good ";
		StringBuilder sb= new StringBuilder();
		String s3[]= s1.split(" ");
		for(String x:s3) {
			sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1));
		}
System.out.println(sb);
	}

}
