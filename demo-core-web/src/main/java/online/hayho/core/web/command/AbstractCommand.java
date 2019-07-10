package online.hayho.core.web.command;

import java.util.List;

public class AbstractCommand<T> {
    protected T pojo;
    private String crudaction;
    private int maxPageItems = 20;
    private  int firstItem = 0;
    private int totalItems = 0;
    private String sortExpression;
    private String sortDirection;
    private String[] checkList;
    private List<T> listResult;
    private String tableID = "tableList";
    private String messageResponse;
    private int page = 1;

    public T getPojo() {
        return pojo;
    }

    public void setPojo(T pojo) {
        this.pojo = pojo;
    }

    public String getCrudaction() {
        return crudaction;
    }

    public void setCrudaction(String crudaction) {
        this.crudaction = crudaction;
    }
}
