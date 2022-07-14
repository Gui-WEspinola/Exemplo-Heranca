package entities;

public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // utiliza a lógica utilizada pela superclasse Account
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10; // A utilização do atributo balance de Account como sendo *protected* se faz necessária para que possamos acessar pela subclasse.
        }
    }
}
