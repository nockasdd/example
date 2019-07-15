package online.hayho.core.serviceimpl;

import online.hayho.core.dao.UserDao;
import online.hayho.core.daoimpl.UserDaoImpl;
import online.hayho.core.dto.utils.UserDTO;
import online.hayho.core.persistence.entity.UserEntity;
import online.hayho.core.service.UserService;
import online.hayho.core.utils.UserBeanUtil;

public class UserServiceImpl implements UserService {

    public UserDTO isUserExist(UserDTO dto) {
        UserDao userDao = new UserDaoImpl();
        UserEntity entity = userDao.findByUser(dto.getName(), dto.getPassword());
        return UserBeanUtil.entity2Dto(entity);
    }


    public UserDTO findRoleByuser(UserDTO dto) {
        UserDao userDao = new UserDaoImpl();
        UserEntity entity = userDao.findByUser(dto.getName(), dto.getPassword());
        return UserBeanUtil.entity2Dto(entity);
    }
}
