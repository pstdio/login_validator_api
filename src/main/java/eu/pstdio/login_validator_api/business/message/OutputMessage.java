package eu.pstdio.login_validator_api.business.message;

/**
 *
 * @author mib
 */
public interface OutputMessage {
    void setValid(boolean valid);
    boolean isValid();
}
