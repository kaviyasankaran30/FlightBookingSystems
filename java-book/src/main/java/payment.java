

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/payment")
public class payment extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String cardNumber=request.getParameter("cardNumber");
		String cardName=request.getParameter("cardName");
		String expiryDate=request.getParameter("expiryDate");
		String cvv=request.getParameter("cvv");
		String billingAddress=request.getParameter("billingAddress");
	 out.println("<html>");
	 out.println("<head>");
		out.print("<style>\r\n"
				+ "	/* NAVBAR STYLING STARTS */\r\n"
				+ ".navbar {\r\n"
				+ "  display: flex;\r\n"
				+ "  align-items: center;\r\n"
				+ "  justify-content: space-between;\r\n"
				+ "  padding: 20px;\r\n"
				+ "  background-color: teal;\r\n"
				+ "  color: #fff;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".nav-links a {\r\n"
				+ "  color: #fff;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* LOGO */\r\n"
				+ ".logo {\r\n"
				+ "  font-size: 32px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* NAVBAR MENU */\r\n"
				+ ".menu {\r\n"
				+ "  display: flex;\r\n"
				+ "  gap: 1em;\r\n"
				+ "  font-size: 18px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".menu li:hover {\r\n"
				+ "  background-color: #4c9e9e;\r\n"
				+ "  border-radius: 5px;\r\n"
				+ "  transition: 0.3s ease;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".menu li {\r\n"
				+ "  padding: 5px 14px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* DROPDOWN MENU */\r\n"
				+ ".services {\r\n"
				+ "  position: relative; \r\n"
				+ "}\r\n"
				+ "body{\r\n"
				
				+ " image-rendering: blur(5px);\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "li {\r\n"
				+ "  list-style: none;\r\n"
				+ "}\r\n"
				+ ".dropdown {\r\n"
				+ "  background-color: rgb(1, 139, 139);\r\n"
				+ "  padding: 1em 0;\r\n"
				+ "  position: absolute; /*WITH RESPECT TO PARENT*/\r\n"
				+ "  display: none;\r\n"
				+ "  border-radius: 8px;\r\n"
				+ "  top: 35px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".dropdown li + li {\r\n"
				+ "  margin-top: 10px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".dropdown li {\r\n"
				+ "  padding: 0.5em 1em;\r\n"
				+ "  width: 8em;\r\n"
				+ "  text-align: center;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".dropdown li:hover {\r\n"
				+ "  background-color: #4c9e9e;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".services:hover .dropdown {\r\n"
				+ "  display: block;\r\n"
				+ "}\r\n"
				+ ".body{\r\n"
				+ "	padding-top:450px;\r\n"
				+ "	font-size: 30px;\r\n"
				+ "	text-align: center;\r\n"
				+ "}\r\n"
				+ "</style>");
		out.println("</head>");
		out.print("<body>\r\n"
				+ "	\r\n"
				+ "	 <!-- NAVIGATION MENUS -->\r\n"
				+ "      <div class=\"menu\">\r\n"
				+ "\r\n"
				+ "        <li><a href=\"#\">Home</a></li>\r\n"
				+ "        <li><a href=\"login.html\">Login</a></li>\r\n"
				+ "\r\n"
				+ "        <li class=\"services\">\r\n"
				+ "          <a href=\"contact1.html\">Services</a>\r\n"
				+ "\r\n"
				+ "          <!-- DROPDOWN MENU -->\r\n"
				+ "          <ul class=\"dropdown\">\r\n"
				+ "            <li><a href=\"calculatedistances.html\">calculate Distances </a></li>\r\n"
				+ "            \r\n"
				+ "          </ul>\r\n"
				+ "\r\n"
				+ "        </li>\r\n"
				+ "\r\n"
				+ "        <li><a href=\"register.java\">flightdetails</a></li>\r\n"
				+ "        <li><a href=\"\">Contact</a></li>\r\n"
				+ "      </div>\r\n"
				+ "    </ul>\r\n"
				+ "  </nav>\r\n"
				+ "\r\n");
				
		
		
		
		out.println(" <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'> ");
		out.println("<p style='background-image: url('flightbooking.webp');'>");
		out.println("<table class='table table-hover table-striped'>");
		out.println("<tr><td>Name</td><td>"+cardName+"</td></tr>");
		out.println("<tr><td>Number</td><td>"+cardNumber+"</td></tr>");
		out.println("<tr><td>Address</td><td>"+billingAddress+"</td></tr>");
		out.println("<tr><td>Totalamount</td><td>"+1000+"</td></tr>");
		
		out.println("<tr colspan='2'><td><input type='submit' value='submit' onClick=\"window.location.href='success.html'\"></td></tr>");
		out.println("</table>");
		out.println("<body>");
		out.println("<html>");
	}

}
