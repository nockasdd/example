package online.hayho.core.dao;

import online.hayho.core.data.dao.GenericDao;
import online.hayho.core.persistence.entity.UserEntity;

public interface UserDao extends GenericDao<Integer , UserEntity> {
    UserEntity findByUser(String name,String password);
}
