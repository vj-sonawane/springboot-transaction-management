package com.saksoft.transactionmanagement.uitil;

import com.saksoft.transactionmanagement.exception.InsufficientBalanceException;

import java.util.HashMap;
import java.util.Map;

public class PaymentGatewaySimulator {
    private static Map<String, Double>  accountBalanceMap = new HashMap<>();

    static  {
        accountBalanceMap.put("6204473777",2000.00);
        accountBalanceMap.put("3371414644",4000.00);
        accountBalanceMap.put("7387363383",3000.00);
        accountBalanceMap.put("9637118557",1200.00);
        accountBalanceMap.put("8600581705",1850.00);
        accountBalanceMap.put("9860167778",1760.00);
        accountBalanceMap.put("8956573272",920.00);
        accountBalanceMap.put("9421310028",618.00);
        accountBalanceMap.put("9158907039",8769.00);
    }

    public static boolean validateBalanceCriteria(String accountNo, Double fare) throws InsufficientBalanceException {
        if(fare > accountBalanceMap.get(accountNo)){
            throw new InsufficientBalanceException("You do not have sufficient funds to do this transaction");
        }
        return true;
    }


}
