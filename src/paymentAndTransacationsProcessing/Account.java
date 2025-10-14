package paymentAndTransacationsProcessing;

public class Account {
	
	int id;
	Transaction[] transactions = new Transaction[0];

	public Account(int id) {
	    this.id = id;
	}

	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
	    if (accountTo == null || moneyAmount == 0.0) {
	        return; // invalid input, do nothing
	    }

	    Transaction sendTransaction = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
	    Transaction receiveTransaction = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
	    
	    this.transactions = addTransaction(this.transactions, sendTransaction);
	    accountTo.transactions = addTransaction(accountTo.transactions, receiveTransaction);
	}
	
	public void withdrawMoney(double moneyAmount) {
		Transaction withdrawTransaction = new Transaction(this, null, moneyAmount, StandardAccountOperations.WITHDRAW);
		this.transactions = addTransaction(this.transactions, withdrawTransaction);
	}
	
	public Transaction[] getTransactions() {
		return transactions;
	}
	
	private Transaction[] addTransaction(Transaction[] original, Transaction newTransaction) {
	    Transaction[] newArray = new Transaction[original.length + 1];
	    for (int i = 0; i < original.length; i++) {
	        newArray[i] = original[i];
	    }
	    newArray[original.length] = newTransaction;
	    return newArray;
	}

	public static class Transaction {
        Account accountFrom;
        Account accountTo;
        double moneyAmount;
        StandardAccountOperations operation;

        public Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation) {
            this.accountFrom = accountFrom;
            this.accountTo = accountTo;
            this.moneyAmount = moneyAmount;
            this.operation = operation;
        }

        public Account getAccountFrom() {
            return accountFrom;
        }

        public Account getAccountTo() {
            return accountTo;
        }

        public double getMoneyAmount() {
            return moneyAmount;
        }

        public StandardAccountOperations getOperation() {
            return operation;
        }
	}


}
