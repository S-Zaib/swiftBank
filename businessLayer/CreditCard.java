package businessLayer;

import java.time.LocalDate;
import java.util.Random;

public class CreditCard {
	LocalDate expiry_date;
	LocalDate issue_date;
	int card_number;
	public LocalDate getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}
	public LocalDate getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(LocalDate issue_date) {
		this.issue_date = issue_date;
	}
	public int getCard_number() {
		return card_number;
	}
	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}
	public CreditCard() {
		Random rand1 = new Random();
		this.card_number=rand1.nextInt(10000);
		
	}
	
}
