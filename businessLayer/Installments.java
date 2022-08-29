package businessLayer;

import java.time.LocalDate;

public class Installments {
LocalDate duedate;
int amount;
int loannumber;

public LocalDate getDuedate() {
	return duedate;
}

public void setDuedate(LocalDate duedate) {
	this.duedate = duedate;
}


}
