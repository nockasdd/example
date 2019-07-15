package online.hayho.core.utils;

import online.hayho.core.dto.utils.ListenGuidelineDTO;
import online.hayho.core.persistence.entity.ListenGuidelineEntity;

public class ListenGuidelineBeanUtil {
    public static ListenGuidelineDTO entitytoDto(ListenGuidelineEntity entity){
        ListenGuidelineDTO dto = new ListenGuidelineDTO();
        dto.setListenGuideLineId(entity.getListenGuideLineId());
        dto.setContent(entity.getContent());
        dto.setImage(entity.getImage());
        dto.setTitle(entity.getTitle());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setModifiedDate(entity.getModifiedDate());
        return dto;
    }
    public static ListenGuidelineEntity dto2Entity(ListenGuidelineDTO dto){
        ListenGuidelineEntity entity = new ListenGuidelineEntity();
        entity.setListenGuideLineId(dto.getListenGuideLineId());
        entity.setContent(dto.getContent());
        entity.setImage(dto.getImage());
        entity.setTitle(dto.getTitle());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setModifiedDate(dto.getModifiedDate());
        return entity;
    }
}
