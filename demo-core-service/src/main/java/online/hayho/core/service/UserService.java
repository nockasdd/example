package online.hayho.core.service;

import online.hayho.core.dto.utils.UserDTO;

public interface UserService {
    UserDTO isUserExist(UserDTO dto);
    UserDTO findRoleByuser(UserDTO dto);
}
