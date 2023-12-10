import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public register() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//table name registerform;
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String from=request.getParameter("from");
		String To=request.getParameter("to");
		out.println(" <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'> ");
		out.println("<p style='background-image: url('flightbooking.webp');'>");
		out.println("<style>\r\n"
				+ "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            background-color: #f4f4f4;\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "        }\r\n"
				+ "        .container {\r\n"
				+ "            max-width: 600px;\r\n"
				+ "            margin: 0 auto;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            background-color: #fff;\r\n"
				+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n"
				+ "        }\r\n"
				+ "        h2 {\r\n"
				+ "            text-align: center;\r\n"
				+ "        }\r\n"
				+ "        .form-group {\r\n"
				+ "            margin-bottom: 20px;\r\n"
				+ "        }\r\n"
				+ "        label {\r\n"
				+ "            display: block;\r\n"
				+ "            font-weight: bold;\r\n"
				+ "        }\r\n"
				+ "        input[type=\"text\"],\r\n"
				+ "        input[type=\"email\"],\r\n"
				+ "        input[type=\"tel\"] {\r\n"
				+ "            width: 100%;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            border: 1px solid #ccc;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "        }\r\n"
				+ "        body{\r\n"
				       
				+ "        }\r\n"
				+ "        input[type=\"submit\"] {\r\n"
				+ "            background-color: #007BFF;\r\n"
				+ "            color: #fff;\r\n"
				+ "            padding: 10px 20px;\r\n"
				+ "            border: none;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "            cursor: pointer;\r\n"
				+ "        }\r\n"
				+ "        input[type=\"submit\"]:hover {\r\n"
				+ "            background-color: #0056b3;\r\n"
				+ "        }\r\n"
				+ "        * {\r\n"
				+ "  margin: 0;\r\n"
				+ "  padding: 0;\r\n"
				+ "  box-sizing: border-box;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "body {\r\n"
				+ "  font-family: cursive;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "a {\r\n"
				+ "  text-decoration: none;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "li {\r\n"
				+ "  list-style: none;\r\n"
				+ "}\r\n"
				+ "/* NAVBAR STYLING STARTS */\r\n"
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
				+ "\r\n"
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
				+ "\r\n"
				+ "    </style>");
		out.println("<nav class=\"navbar\">\r\n"
				+ "    <!-- LOGO -->\r\n"
				+ "    <div class=\"logo\">AirlineBooking</div>\r\n"
				+ "\r\n"
				+ "    <!-- NAVIGATION MENU -->\r\n"
				+ "    <ul class=\"nav-links\">\r\n"
				+ "\r\n"
				+ "      <!-- USING CHECKBOX HACK -->\r\n"
				+ "      <input type=\"checkbox\" id=\"checkbox_toggle\" />\r\n"
				+ "      <label for=\"checkbox_toggle\" class=\"hamburger\">&#9776;</label>\r\n"
				+ "\r\n"
				+ "      <!-- NAVIGATION MENUS -->\r\n"
				+ "      <div class=\"menu\">\r\n"
				+ "\r\n"
				+ "        <li><a href=\"#\">Home</a></li>\r\n"
				+ "        <li><a href=\"login.html\">Login</a></li>\r\n"
				+ "\r\n"
				+ "        <li class=\"services\">\r\n"
				+ "          <a href=\"/\">Services</a>\r\n"
				+ "\r\n"
				+ "          <!-- DROPDOWN MENU -->\r\n"
				+ "          <ul class=\"dropdown\">\r\n"
				
				+ "            <li><a href=\"calculatedistances.html\">calculate Distances </a></li>"
				+ "          </ul>\r\n"
				+ "\r\n"
				+ "        </li>\r\n"
				+ "\r\n"
				+ "        <li><a href=\"\">Pricing</a></li>\r\n"
				+ "        <li><a href=\"\">Contact</a></li>\r\n"
				+ "      </div>\r\n"
				+ "    </ul>\r\n"
				+ "  </nav>");
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","Kaviy@hosur03");
			PreparedStatement ps=con.prepareStatement("select * from flightdetails where soruce =? and destination=?" );
			ps.setString(1, from);
			ps.setString(2, To);
			
			out.println("<div style='margin:auto;width:900px;margin-top:100px;'>");
			out.println("<table Class='table table-hover table-striped' Class='table-primary'>");
			
			
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd= rs.getMetaData();
			int totalColum=rsmd.getColumnCount();
			out.print("<tr>");
//		for(int i=0;i<=totalColum;i++) {
//			out.print("<th>" + rsmd.getColumnName(i)+"</th>");
//			
//			
//		}
//			out.print("<tr>");
			out.println("");
			out.print("<tr><th class='w-75'>"+"FilghtNo"+"</th><th class='w-75' >"+"FlightName"+"</th><th class='w-75'>"+"source"+"</th>"+"<td>"+"<th class='w-75'>"+"destination"+"</th><th class='w-75'>"+"date"+"</th><th class='w-75'>"+"cost"+"</th><th class='w-75'>"+"Time"+"</th><th class='w-75'>Link</th>");
			while(rs.next()) {
				out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td>"+"<td>"+"<td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td><a href='payment.html'><input type='button' value='select'></a></td>");
			}
			out.print("</table>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}