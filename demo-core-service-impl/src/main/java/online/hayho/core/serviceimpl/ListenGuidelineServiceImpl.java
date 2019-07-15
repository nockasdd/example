package online.hayho.core.serviceimpl;

import online.hayho.core.dao.ListenGuidelineDao;
import online.hayho.core.daoimpl.ListenGuidelineImpl;
import online.hayho.core.dto.utils.ListenGuidelineDTO;
import online.hayho.core.persistence.entity.ListenGuidelineEntity;
import online.hayho.core.service.ListenGuidelineService;
import online.hayho.core.utils.ListenGuidelineBeanUtil;

import java.util.ArrayList;
import java.util.List;

public class ListenGuidelineServiceImpl implements ListenGuidelineService {
    private ListenGuidelineDao listenGuidelineDao = new ListenGuidelineImpl();
//    @Override
//    public Object[] findListenGuidelineByProperties(String property, Object value, String sortExpression, String sortDirection, Integer offset, Integer limits) {
//        List<ListenGuidelineDTO> result = new ArrayList<ListenGuidelineDTO>();
//        Object[] objects = listenGuidelineDao.findByProperty(property,value,sortExpression,sortDirection,offset,limits);
//        for (ListenGuidelineEntity item: (List<ListenGuidelineEntity>) objects[1]){
//            ListenGuidelineDTO dto = ListenGuidelineBeanUtil.entitytoDto(item);
//            result.add(dto);
//        }
//        objects[1] = result;
//        return objects;
//        return null;
//    }
}
