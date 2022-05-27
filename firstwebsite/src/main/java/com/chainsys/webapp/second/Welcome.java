package com.chainsys.webapp.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession(true);
        String id=session.getId();
        response.getWriter().append("Served at: ").append(request.getContextPath());
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String url="Welcome";
        String encodedUrl=response.encodeURL(url);
        StringBuffer htmlOutput= new StringBuffer();
        htmlOutput.append("<!DOCTYPE html>\r\n"
                + "<html>\r\n"
                + "<head>\r\n"
                + "<meta charset=\"ISO-8859-1\">\r\n"
                + "<title>Insert title here</title>\r\n"
                + "</head>\r\n"
                + "<body><form action='"+encodedUrl+"' method='get'>");
        htmlOutput.append("<h1> welcome </h1>"+id);
        htmlOutput.append("<input type='submit' name='submit' value='click' />");
        htmlOutput.append("</body>"+ "</html>");
        out.println(htmlOutput);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
