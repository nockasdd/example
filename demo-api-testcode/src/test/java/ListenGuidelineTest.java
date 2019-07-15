import online.hayho.core.dao.ListenGuidelineDao;
import online.hayho.core.daoimpl.ListenGuidelineImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ListenGuidelineTest {
    ListenGuidelineDao listenGuidelineDao ;
    @BeforeTest
    public void initData(){
        listenGuidelineDao = new ListenGuidelineImpl();
    }
    @Test
    public void checkApiFindbyProperty(){
        Map<String,Object> property = new HashMap<String,Object>();
        property.put("title","bai hd 8");
        property.put("content","Noi dung 8");
        Object[] objects = listenGuidelineDao.findByProperty(property,null,null,null,null);

    }
}
