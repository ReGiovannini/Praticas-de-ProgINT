package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

@WebServlet("/controller.do")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
		FileWriter logRequest;

	protected void doExecute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			logRequest = new FileWriter (new File("C:/Users/regin/eclipse-workspace/EX8_PPI/logreq.log"), true);
			request.setCharacterEncoding("UTF-8");
			logRequest.append("\n" + Calendar.getInstance().getTime() + " Chegou um request para: " + request.getParameter("command"));
			logRequest.flush();
			Command comando = (Command)Class.forName("command."+request.getParameter("command")).newInstance();
			comando.executar(request, response);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doExecute(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doExecute(request,response);
	}

}
