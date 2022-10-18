


/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager 
{
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, 
	 * false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) 
	{
		
	boolean result = false;	
	
			//Iterate through string to see if it is within lower to upper range
		 for(int i = 0; i < plainText.length(); i++)
		 {
			
			 //If it is less than lower range or greater than upper range
			//return false, else return true.
			 
			 //char ch is a character in plainText
			char ch = plainText.charAt(i);
			
			if(!(ch>= LOWER_RANGE && ch<=UPPER_RANGE ))
			{
			result = false;	
			}
			result= true;
		 }
		return result;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher. The integer key specifies
	 *  an offset and each character in plainText is replaced by the character 
	 *  \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) 
	{
		
		
		//encryptedString is the String that results after plainText is encrypted
		//via Cesar Cipher
		String encryptedString = "";
		//Loop through plainText one character at a time
		for(int i =0; i<plainText.length(); i++)
		{
			
			//If the plainText is not in bounds, the method returns: 
			//The selected string is not in bounds, Try again.
			if ((plainText.charAt(i) <= LOWER_RANGE && plainText.charAt(i) >= UPPER_RANGE))
				{
			System.out.println("The selected string is not in bounds, Try again");
			    }
	
			
				//Individual character in plainText denoted by int letter
			int letter = plainText.charAt(i);
			
	        //letter is shifted by offset/key .Use modulo(%) for wrap around (no>26)
			int shiftedValue = (key + letter)%26;
			
			//The newValue is the value of the character in plainText after 
			//shifting 
			char newValue =plainText.charAt(shiftedValue);
			
			//The encryptedString is the result of encrypting plainText
			 encryptedString +=newValue;
		}
		
		return encryptedString;
		
		}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText 
	 * is offset  according to the ASCII value of the corresponding character in 
	 * bellasoStr, which is repeated to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, 
	 * character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr)
	{
		
	
		
	  String Result = "";
		//String Result = "";
		//loop through plainText
		for (int i = 0, j=0;  i<plainText.length(); i++)
		{
			char ch = plainText.charAt(i);
			
			//Check if the String is within the desired range
			if (ch < LOWER_RANGE || ch > UPPER_RANGE)
			continue;
			
			Result += (char)(ch - plainText.charAt(j)+ 26)% 26 + LOWER_RANGE;
			j = ++j % bellasoStr.length();
		}
			return Result; 
	}
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies 
	 * an offset and each character in encryptedText is replaced by the 
	 * character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key)
	{
		
		
		//plainText is the String that results after decryption via Cesar Cipher
		String plainText = "";
		
	
		//Loop through plainText one character at a time
		for(int i =0; i<encryptedText.length(); i++)
		{
			
			
		//Position of char in plainText
			int letter = encryptedText.charAt(i);
			
	        //Shift value according to key:
			//ShiftedValue is char +  key/offset Use modulo 26 to account for 
			//wrap around
			int shiftedValue = (key - letter)%26;
			
			if(shiftedValue <0)
			{
				shiftedValue = encryptedText.length() + shiftedValue;
			}
			//The newValue is the value of the character in plain text after 
			//shifting 
			char newValue =encryptedText.charAt(shiftedValue);
			
			//The encryptedString is the result of encrypting plainText
			 plainText +=newValue;
		}
		return plainText;
		}
	

	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) 
	{
		
	
	String decrypted="";
				//String decrypted ="";
				//loop through plainText
				for (int i = 0, j=0;  i<encryptedText.length(); i++)
				{
					//ch represent char in encryptedText
					char ch = encryptedText.charAt(i);
				
				
					//check if character is valid
					while(ch < LOWER_RANGE || ch > UPPER_RANGE)
					{
					System.out.print("Invalid character, Please enter valid character");
					}
					//implementation of Bellaso Cipher
					decrypted += (char)(((ch - encryptedText.charAt(j)+ 26)%26) + 
							LOWER_RANGE);
					j = ++j % bellasoStr.length();
					
				}
					return decrypted; 
				}  

}