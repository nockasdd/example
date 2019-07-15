package online.hayho.core.utils;

import online.hayho.core.dto.utils.UserDTO;
import online.hayho.core.persistence.entity.UserEntity;

public class UserBeanUtil {
    public static UserDTO entity2Dto(UserEntity entity){
        UserDTO dto = new UserDTO();
        dto.setUserId(entity.getUserId());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setFullName(entity.getFullName());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setRoleDTO(RoleBeanUtil.entitytoDto(entity.getRoleEntity()));
        return  dto;
    }
    public static UserEntity dto2Entity(UserDTO dto){
        UserEntity entity = new UserEntity();
        entity.setUserId(entity.getUserId());
        entity.setName(entity.getName());
        entity.setPassword(entity.getPassword());
        entity.setFullName(entity.getFullName());
        entity.setCreatedDate(entity.getCreatedDate());
        entity.setRoleEntity(RoleBeanUtil.dto2Entity(dto.getRoleDTO()));
        return  entity;
    }
}
