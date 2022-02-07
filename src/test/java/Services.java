public class Services
{
	public String RandomNumber(int min, int max)
	{
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		System.out.println(random_int);
		return String.valueOf(random_int);
	}
}
