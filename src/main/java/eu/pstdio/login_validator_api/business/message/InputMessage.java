package eu.pstdio.login_validator_api.business.message;

/**
 *
 * @author mib
 */
public interface InputMessage {
    void setId(Long id);
    Long getId();
    void setPasswd(String passwd);
    String getPasswd();
}
