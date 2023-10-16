package statementprocessing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class StatementParameterizedTests {

    @Parameter(0)
    public String regDate;
    @Parameter(1)
    public String applicant ;
    @Parameter(2)
    public String actionType;
    @Parameter(3)
    public String status;
    @Parameter(4)
    public double debtSum;
    @Parameter(5)
    public double payment;
    @Parameter(6)
    public double expectedSum;




// нужно вернуть в параметризованные тесты два теста по дате заявления и возможности повторной отправки, а в отдельные тесты вынести что-нибудь другое

/*
    public StatementTests(String regDate, String applicant, String actionType, String status){
        this.regDate = regDate;
        this.applicant= applicant;
        this.actionType = actionType;
        this.status = status;
    }
*/

    @Parameters(name = "Заявление за дату {0} от заявителя {1} по УНД {2} в статусе {3} и суммой долга {4}")
    public static Object[][] getData(){
        return new Object[][]
                {
                        {"20231015", "Королев Сергей", "07", "inProgress", 500, 400, 100},
                        {"20231015", "Королев Сергей", "07", "inProgress", 1000, 1000, 0},
                        {"20231015", "Королев Сергей", "07", "inProgress", 300, 1000, 0},
                };

    }

    @Test
    public void paymentTest(){

        Statement statement = new Statement(regDate,  applicant,  actionType, status, debtSum );

        assertEquals ("Оставшийся долг рассчитан неверно", expectedSum, statement.debtRemainedAfterPayment(payment));
    }

}
