package online.hayho.controller.admin;


import online.hayho.command.ListenGuidelineCommand;
import online.hayho.core.dto.utils.ListenGuidelineDTO;
import online.hayho.core.service.ListenGuidelineService;
import online.hayho.core.serviceimpl.ListenGuidelineServiceImpl;
import online.hayho.core.web.command.WebConstant;
import online.hayho.core.web.utils.RequestUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/admin-guideline-listen-list.html")
public class ListenGuideLineController extends HttpServlet {
    private ListenGuidelineService guidelineService = new ListenGuidelineServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
       ListenGuidelineCommand command = new ListenGuidelineCommand();
//        command.setMaxPageItems(2);
//        RequestUtil.initSearchBean(req,command);
//       Object[] objects = guidelineService.findListenGuidelineByProperties(null,null,command.getSortExpression(),command.getSortDirection(),command.getFirstItem(),command.getMaxPageItems());
//        command.setListResult((List<ListenGuidelineDTO>) objects[1]);
//        command.setTotalItems(Integer.parseInt(objects[0].toString()) );
//        req.setAttribute(WebConstant.LIST_ITEMS,command);
       RequestDispatcher rd = req.getRequestDispatcher("/views/admin/listenguideline/list.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);
        RequestDispatcher rd = req.getRequestDispatcher("/views/admin/listenguideline/list.jsp");
        rd.forward(req,resp);
    }
}
