package online.hayho.controller.admin;

import online.hayho.command.UserCommand;
import online.hayho.core.dto.utils.RoleDTO;
import online.hayho.core.dto.utils.UserDTO;
import online.hayho.core.service.UserService;
import online.hayho.core.serviceimpl.UserServiceImpl;
import online.hayho.core.web.command.WebConstant;
import online.hayho.core.web.utils.FormUtil;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login.html")
public class LoginController extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/views/web/login.jsp");
        rd.forward(req,resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserCommand command = FormUtil.populate(UserCommand.class, req);
        UserDTO pojo = command.getPojo();
        UserService userService = new UserServiceImpl();
        try {
            if(userService.isUserExist(pojo) != null){
                if(userService.findRoleByuser(pojo) != null && userService.findRoleByuser(pojo).getRoleDTO() != null){
                    if(userService.findRoleByuser(pojo).getRoleDTO().getName().equals(WebConstant.ROLE_ADMIN)){
                       resp.sendRedirect("/admin-home.html");
                    }else if (userService.findRoleByuser(pojo).getRoleDTO().getName().equals(WebConstant.ROLE_USER)) {
                        resp.sendRedirect("/home.html");
                    }
                }

            }
        }catch (NullPointerException e){
            log.error(e.getMessage(), e);
            req.setAttribute(WebConstant.ALERT, WebConstant.TYPE_ERROR);
            req.setAttribute(WebConstant.MESSAGE_RESPONSE, "Tên hoặc mật khẩu sai");
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/login.jsp");
            rd.forward(req,resp);
        }

    }
}
