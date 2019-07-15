import online.hayho.core.dao.ListenGuidelineDao;
import online.hayho.core.dao.UserDao;
import online.hayho.core.daoimpl.ListenGuidelineImpl;
import online.hayho.core.daoimpl.UserDaoImpl;
import online.hayho.core.persistence.entity.UserEntity;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;



public class TestAPi {
    private final Logger log = Logger.getLogger(this.getClass());
    @Test
    public void checkIsUserExist() {
        UserDao userDao = new UserDaoImpl();
        String name = "admin";
        String password = "123456";
        UserEntity entity = userDao.findByUser(name, password);
        if(entity != null) {
            log.error("Login Sucess");
        }else{
            log.error("Login Fail");
        }
    }
    @Test
    public void checkFindRoleByUser() {
        UserDao userDao = new UserDaoImpl();
        String name = "admin";
        String password = "123456";
        UserEntity entity = userDao.findByUser(name, password);
        log.error(entity.getRoleEntity().getRoleid() + "-" + entity.getRoleEntity().getName());

    }
    @Test
    public void checkFindProperty(){
        ListenGuidelineDao listenGuidelineDao = new ListenGuidelineImpl();
       // Object[] result = listenGuidelineDao.findByProperty(null,null,null,null,2,2);
    }


}
