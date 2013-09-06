
public class StringConvert {
	
	public static void main(String args[]){

		System.out.println(new StringConvert().convertString("Adrian".toCharArray()));
		System.out.println(new StringConvert().convertString("joe".toCharArray()));
		System.out.println(new StringConvert().convertString("jo..e".toCharArray()));
	}
	
	private String convertString(final char[] stringToConvert)
	{
		System.out.println(System.currentTimeMillis());
		if (stringToConvert == null || stringToConvert.length == 0)
		{
			return "";
		}

		boolean booleanTest = true;

		for (int i = 0; i < stringToConvert.length; i++)
		{

			if (booleanTest)
			{
				stringToConvert[i] = Character.toUpperCase(stringToConvert[i]);
				booleanTest = false;
			}

			if (!Character.isLetterOrDigit(stringToConvert[i]))
			{
				booleanTest = true;
			}

		}

		System.out.println(System.currentTimeMillis());
		
		return new String(stringToConvert);
	}
	

}
