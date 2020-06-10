package springboot.services;

public interface AccountService {
    public abstract boolean login(String username, String password);
    public abstract void logout(int session_id);
    public abstract boolean is_authenticated(int session_id);
}