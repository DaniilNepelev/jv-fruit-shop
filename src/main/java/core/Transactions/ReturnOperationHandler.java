package core.Transactions;

import core.Exception.FruitException;

public class ReturnOperationHandler implements OperationHandler {
    @Override
    public int getTransaction(int currentAmount, int operationAmount) {
        int sum = currentAmount + operationAmount;
        if (sum < 0) {
            throw new FruitException("Balance can not be less than 0");
        }
        return sum;
    }
}
