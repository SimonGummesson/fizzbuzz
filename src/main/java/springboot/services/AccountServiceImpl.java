package springboot.services;
 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import springboot.domainmodels.Account;
import springboot.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService  {
    
    @Autowired
    public AccountServiceImpl() {}

    @Autowired
    private AccountRepository acc_rep;
 
    //@Transactional
    //public Account getAccount(String username) {
    //    return acc_rep.findByUsername(username);
    //} 

    public boolean login(String username, String password) {
        Optional<Account> a = acc_rep.findByUsername(username);
        if (a.isPresent() && a.get().getPassword() == password)
            return true;
        else
            return false;
    }

    public void logout(int session_id) {
        //cookie_rep.deleteById(session_id);
    }

    public boolean is_authenticated(int session_id) {
        //return acc_rep.findById(session_id).isPresent();
        return true;
    }
}