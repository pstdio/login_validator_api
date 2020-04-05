package eu.pstdio.login_validator_api.integration.dao;

import eu.pstdio.login_validator_api.integration.entity.LoginEntity;

/**
 *
 * @author mib
 */
public interface LoginDao {
    LoginEntity getById(Long id);
}
