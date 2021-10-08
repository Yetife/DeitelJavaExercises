package schoolOOP;

//import chapterThree.Date;

import java.math.BigDecimal;
import java.util.Date;

public class Employee extends Person{
    private String office;
    private BigDecimal Salary;
    private Date dateHired;

    public void dateHired(Date datehired)
    {
        this.dateHired = datehired;
    }
    public Date getDateHired() {
        return dateHired;
    }

}
