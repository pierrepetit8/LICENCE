package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Money {
	private int amount ;
	private String curr ;
	private Convertion convertion;
	private List<String> list = new ArrayList();
	
	public Money( int amount , String currency ) throws IllegalArgumentException {
		list.add("EUR");
		list.add("USD");
		
		if(amount == 0 || amount < 0 || !list.contains(currency) || currency == null) {
			throw new IllegalArgumentException();
		}
		else {
			this.amount = amount;
			this.curr = currency;
		}
		convertion = new Convertion();
		
	}

	public int amount ( ) {
		return amount;
	}

	public String currency ( ) {
		return curr;
	}

	public void add (Money m) throws IllegalArgumentException{
		if (m == null) throw new IllegalArgumentException();
		
		if (!curr.equals(m.currency()))
			add(m.amount, m.curr);
		else
			amount += m.amount;
	}

	public void add (int namount , String ncurrency ) throws IllegalArgumentException {
		Double conv = 	convertion.unit_Convertion(ncurrency);
		if (ncurrency == "USD")
			amount += namount * conv;
		else if(ncurrency == "EUR")
				amount += namount / conv;
		else throw new IllegalArgumentException();
	}
	
	public void sub(int namount, String ncurrency) {
		
		amount -= namount;
	}
}
