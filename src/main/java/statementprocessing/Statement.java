package statementprocessing;

public class Statement
{
    private String regDate;
    private String applicant ;
    private String actionType;
    private String status;

    private double debtSum = 0.00;



    public Statement(String regDate, String applicant, String actionType, String status, double debtSum){
        this.regDate = regDate;
        this.applicant= applicant;
        this.actionType = actionType;
        this.status = status;
        this.debtSum = debtSum;
    }

    public boolean isAbleToResend () {
        return actionType == "01";
    }

    public String getActionType(){
        return this.actionType;
    }
    public boolean isOutOfDate( ){
        // как найти текущую дату
        // как сравниваются даты

        return regDate.equals("20231012");
    }

    public double debtRemainedAfterPayment ( double payment ){
        if (debtSum < payment) return 0;
        else return debtSum - payment;
    };

}
