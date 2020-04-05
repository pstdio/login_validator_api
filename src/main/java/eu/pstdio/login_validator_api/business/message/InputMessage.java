package eu.pstdio.login_validator_api.business.message;

/**
 *
 * @author mib
 */
public interface InputMessage {
    void setLoginId(Long loginId);
    Long getLoginId();
    void setPasswd(String passwd);
    String getPasswd();
}
