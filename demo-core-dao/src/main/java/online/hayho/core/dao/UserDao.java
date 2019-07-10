package online.hayho.core.dao;

import online.hayho.core.data.dao.GenericDao;
import online.hayho.core.persistence.entity.UserEntity;

public interface UserDao extends GenericDao<Integer , UserEntity> {
    UserEntity isUserExitst(String name, String password);
    UserEntity findRoleByUser(String name, String password);
}
