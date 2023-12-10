

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

/**
 * Servlet implementation class restaurantServlet
 */
@WebServlet("/restaurantServlet")
public class restaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public restaurantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String foodname=request.getParameter("foodname");
		String foodquan=request.getParameter("foodQuan");
		String price=request.getParameter("Price");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","Kaviy@hosur03");
			PreparedStatement ps=con.prepareStatement("select * from fooddetails where FoodName =?" );
			ps.setString(1, foodname);
			
			out.println("<caption>Food details :</caption>");
			out.println("<div style='margin:auto;width:900px;margin-top:100px;'>");
			out.println("<table Class='table table-hover table-striped' Class='table-primary'>");
			
			
			ResultSet rs=ps.executeQuery();
			//ResultSetMetaData rsmd= rs.getMetaData();
			//int totalColum=rsmd.getColumnCount();
			//out.print("<tr>");
//		for(int i=0;i<=totalColum;i++) {
//			out.print("<th>" + rsmd.getColumnName(i)+"</th>");
//			
//			
//		}
//			out.print("<tr>");
			out.println("");
			out.print("<tr><th class='w-75'>+FoodName</th><th class='w-75' >FoodQuan</th><th class='w-75'>price</th></tr>");
			while(rs.next()) {
				out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td>");
			}
			out.print("</table>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	}


