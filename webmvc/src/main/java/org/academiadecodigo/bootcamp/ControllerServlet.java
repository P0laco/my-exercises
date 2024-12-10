package org.academiadecodigo.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Controller

public class ControllerServlet{

    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String getCustomer (Model model){

        model.addAttribute("customerFirstName", "Rui");
        model.addAttribute("customerLastName", "Ferrão");
        model.addAttribute("customerEmail", "rui.ferrao@academiadecodigo.pt");
        model.addAttribute("customerId", "1");
        model.addAttribute("customerPhone", "916668877");


        return "index";
    }
    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Customer customer = new Customer();

        customer.setId(1);
        customer.setFirstName("Rui");
        customer.setLastName("Ferrão");
        customer.setEmail("rui.ferrao@academiadecodigo.org");
        customer.setPhone("916668877");

        // Use global Servlet context to pass customer object
        //getServletContext().setAttribute("customer", customer);

        // Use session context to pass the customer object
        //req.getSession().setAttribute("customer", customer);

        // Use request context to pass the customer object
        req.setAttribute("customer", customer);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        dispatcher.forward(req, resp);

    }*/
}
