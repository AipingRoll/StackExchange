package persistence;

import domain.Account;

/**
 * Created by 温 睿诚 on 2016/4/12/0012.
 */
public interface AccountDao {
     Account findAccountByUsername(String username);
    Account findAccountByUsernameAndPassword(String username,String password);
    int inserAccount(Account account);
    int editAccount(Account account);
}
