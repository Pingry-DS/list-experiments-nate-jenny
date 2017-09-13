import java.util.Comparator;

public class InverseAlpha implements Comparator<String>
{
	public int compare(String a, String b)
	{
		return b.compareTo(a);
	}
}