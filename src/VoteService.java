public class VoteService {
	@FunctionalInterface
	interface Vote{
		public String voteCheck(String name,int age,String location);
	}
	public static void main(String[] args) {
		Vote v1=(name,age,location) -> age>=18 && 
				location.equalsIgnoreCase("hyderabad")?"eligible":"not eligible";
         String s2= v1.voteCheck("karthik", 22, "Hyderabad");
         System.out.println(s2);
         System.out.println("***********");
         String s3= v1.voteCheck("karthik", 18  , "Hyderabad");
         System.out.println(s3);
	}
}
