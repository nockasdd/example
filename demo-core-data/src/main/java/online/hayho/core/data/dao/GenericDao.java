package online.hayho.core.data.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GenericDao <ID extends Serializable, T> {
     List<T> findAll();
     T update(T entity);
     void save(T entity);
     T findById(ID var1);
     Object[] findByProperty(Map<String, Object> prperty, String sortExpression, String sortDirection, Integer offset, Integer limits);
     Integer delete(List<ID> ids);
}
