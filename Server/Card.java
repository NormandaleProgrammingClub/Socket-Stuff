//Card Declaration file

import java.util.*;


public class Card
{
	int r;
	int s;
	String c;
	
	private String Card(int a)
	{
		r = a%13;
		s = a%4;
		
		switch(r)
		{
			case 0: c = "Ace";break;
			case 1: c = "Two";break;
			case 2: c = "Three";break;
			case 3: c = "Four";break;
			case 4: c = "Five";break;
			case 5: c = "Six";break;
			case 6: c = "Seven";break;
			case 7: c = "Eight";break;
			case 8: c = "Nine";break;
			case 9: c = "Ten";break;
			case 10: c = "Jack";break;
			case 11: c = "Queen";break;
			case 12: c = "King";break;
		}
		switch (s)
		{
			case 0: c = c + " of Spades";break;
			case 1: c = c + " of Diamonds";break;
			case 2: c = c + " of Clubs";break;
			case 3: c = c + " of Hearts";break;
		}
		return c;
	}
	String fill(int a)
	{
		String card;
		card = Card(a);
		return card;
	}
}
		
