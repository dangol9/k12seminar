import org.junit.*;

public class hobujoud{

	public static int leiahobujoud(int rpm, int ft, int rdps){
		return (rpm * ft) / rdps ;
	}
	
	public static void main(String[] arg){
		System.out.println("Hobujoud on: " + (leiahobujoud(3000,440,5252)));
	}
	
	@Test
	public void test(){
		int expected = (3000 * 440) / 5252;
		Assert.assertEquals(expected, leiahobujoud(3000,440,5252));
	}
}