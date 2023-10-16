package statementprocessing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StatementResendTests {
/*
    public String regDate;
    public String applicant ;
    public String actionType;
    public String status;



    public StatementResendTests(String regDate, String applicant, String actionType, String status){
        this.regDate = regDate;
        this.applicant= applicant;
        this.actionType = actionType;
        this.status = status;
    }
*/


    @Test
    public void isAbleToResendTest() {
        Statement statement = new Statement("20231015", "Королев Сергей", "07", "inProgress", 500);

        System.out.println("actionType = " + statement.getActionType());

        assertEquals("Возможность повторной отправки определена неверно", false, statement.isAbleToResend());
    }
}


