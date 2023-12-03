    /**
 *
 * @author Taha Ghori
 */
package coe318.lab4;

public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account[] accounts;
    private int numAccounts;//number of active accounts

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name; //Fix this
    }

    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
        return numAccounts; //Fix this
    }

    public Account[] getAccounts() {
        return accounts; //Fix this
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */

    public boolean hasAccountNumber(int accountNumber) {

        boolean check = false;
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getNumber() == accountNumber) { //looping through array and checking
                check = true;
            } else {
                check = false;
            }
        }
        return check;

    }

    /**
     * 
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {

        boolean check = false;
        // checking for dupplicate accounts, and if its not a duplicate account then we want to add it
        if (hasAccountNumber(account.getNumber())) {
            check = false;
        } else {
            accounts[numAccounts] = account;
            numAccounts++; //add account to the end of the accounts array by increasing its length.
            check = true;
        }
        return check;
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for (Account account : getAccounts()) {
            if (account == null)
                break;
            s += "\n  " + account;
        }
        return s;
    }
}

    
