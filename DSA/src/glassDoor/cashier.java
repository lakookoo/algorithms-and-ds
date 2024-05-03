package glassDoor;
// Problem Statement:
// You are working as a cashier in a supermarket, and you need to provide correct change to customers after they make purchases. Your task is to write a function that takes two arguments:

import java.util.HashMap;
import java.util.Map;

// The total purchase amount in cents (an integer).
// The amount of cash given by the customer in cents (an integer).
// Your function should return the minimum number of coins and bills required to make change for the customer, using the available denominations of currency (coins and bills). The denominations available are:

// 100 cents (one dollar bill)
// 50 cents (fifty-cent coin)
// 25 cents (quarter)
// 10 cents (dime)
// 5 cents (nickel)
// 1 cent (penny)
// Your function should return a dictionary or map containing the counts of each denomination of coins and bills used to make change. If exact change cannot be provided, return "Not enough cash provided."

// Example:
// Input:

// Total purchase amount: 725 cents
// Cash given by customer: 1000 cents
// Output:

// { "dollars": 2, "quarters": 3 }
// Explanation:

// The total purchase amount is 725 cents, and the customer gives 1000 cents.
// The change to be returned is 275 cents.
// The optimal way to make change is to return 2 one-dollar bills (200 cents) and 3 quarters (75 cents).
// Therefore, the function should return { "dollars": 2, "quarters": 3 } as the output.
// Constraints:
// The total purchase amount and cash given by the customer are integers.
// The total purchase amount is between 1 cent and 10,000 cents (inclusive).
// The cash given by the customer is greater than or equal to the total purchase amount.
// All denominations of coins and bills are available for making change.
public class cashier {

    public static void main(String[] args) {
        int purchaseAmount = 325;
        int cashGiven = 1000;
        Map<Integer, Integer> change = makeChange(purchaseAmount, cashGiven);
        System.out.println(change);
        System.out.println("Contents of the HashMap:");
        for (Map.Entry<Integer, Integer> entry : change.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static Map<Integer, Integer> makeChange(int purschaseAmount, int cashGiven){
        int[] denominations = {100, 50, 25, 10, 5, 1};
        int changeAmount = cashGiven - purschaseAmount;
        Map<Integer, Integer> change = new HashMap<>();
        for (int denom : denominations) {
            int num_of_denom = changeAmount / denom;
            if (num_of_denom > 0 ) {
                change.put(denom, num_of_denom);
                changeAmount -= num_of_denom * denom;
            }
        }

        return change;
    }

}
