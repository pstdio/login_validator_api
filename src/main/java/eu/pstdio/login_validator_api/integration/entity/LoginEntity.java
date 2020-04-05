package eu.pstdio.login_validator_api.integration.entity;

/**
 *
 * @author mib
 */
public interface LoginEntity {
    void setId(Long id);
    Long getId();
    void setHashedPasswd(String hashedPasswd);
    String getHashedPasswd();
    void setSlat(String salt);
    String getSalt();
    void setDisabled(boolean disabled);
    boolean isDisabled();
}
