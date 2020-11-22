import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet3")
public class ProfileServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
PrintWriter out=response.getWriter();
 request.getRequestDispatcher("link.html").include(request, response);
Cookie ck[]=request.getCookies();
if(ck!=null){
 String name=ck[0].getValue();
 if(!name.equals("")||name!=null){
 out.print("<h1 >Welcome to Profile</h1>");
 out.print("<br> Welcome," +name );
 }
 }else{
 out.print("<h1 >You will have to login first</h1>");
 request.getRequestDispatcher("login.html").include(request, response);
 }
 out.close();
 }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}
}
