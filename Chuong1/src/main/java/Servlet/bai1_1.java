package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class bai1_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public bai1_1() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// url: localhost:8888/Chuong1/bai1_1?param1=100&param2=10
		String val1 = request.getParameter("param1");
		String val2 = request.getParameter("param2");
		PrintWriter traVe = response.getWriter();
		traVe.append("Gia tri tham so 1 la: ");
		traVe.append(val1);
		traVe.append("\nGia tri tham so 2 la: ");
		traVe.append(val2);
	}

}
