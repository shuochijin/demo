package controller;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="demo2", urlPatterns="/demo2.jsp")
public class Demo2 extends HttpServlet {
	
	private static final long serialVersionUID = -7216740875691485716L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OutputStream os = resp.getOutputStream();
		System.out.println(resp.getCharacterEncoding());
		os.write(new String("demo22").getBytes());
		os.flush();
	}
	
}
