package businessLayer;

import java.time.LocalDate;
import java.util.Random;

public class ChequeBook {
LocalDate expiry_date;
LocalDate issue_date;
int chequeNumber;
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
public ChequeBook() {
	Random rand=new Random();
	this. chequeNumber = rand.nextInt(1000);
}




}
