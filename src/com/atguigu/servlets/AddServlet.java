package com.atguigu.servlets;

import com.atguigu.fruit.dao.FruitDAO;
import com.atguigu.fruit.dao.impl.FruitDAOImpl;
import com.atguigu.fruit.pojo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xqrui
 * @date 2022/2/26
 * @dec 描述
 */
public class AddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.toString());
        req.setCharacterEncoding("utf-8");//post方式下，设置编码，防止中文乱码，且需要放置在所有获取参数的前面
        String fname = req.getParameter("fname");
        String fprice = req.getParameter("fprice");
        String fcount = req.getParameter("fcount");
        String remark = req.getParameter("remark");
        FruitDAO fruitDAO = new FruitDAOImpl();
        boolean flag = fruitDAO.addFruit(new Fruit(0 , fname , Integer.parseInt(fprice) , Integer.parseInt(fcount) , remark));

        System.out.println(flag ? "添加成功！" : "添加失败！");
    }
}
