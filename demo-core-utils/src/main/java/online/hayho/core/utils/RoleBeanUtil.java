package online.hayho.core.utils;

import online.hayho.core.dto.utils.RoleDTO;
import online.hayho.core.persistence.entity.RoleEntity;

public class RoleBeanUtil {
    public static RoleDTO entitytoDto(RoleEntity entity){
        RoleDTO dto = new RoleDTO();
        dto.setRoleid(entity.getRoleid());
        dto.setName(entity.getName());
        return dto;
    }
    public static RoleEntity dto2Entity(RoleDTO dto){
        RoleEntity entity = new RoleEntity();
        entity.setRoleid(dto.getRoleid());
        entity.setName(dto.getName());
        return entity;
    }
}
