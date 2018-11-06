import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calcServlet")
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choice = request.getParameter("value");
        String value = request.getParameter("eh");
        int valueInt = Integer.parseInt(choice);
        if ("Koło".equals(choice)) {
    request.getRequestDispatcher("ring.jsp").forward(request,response);
        }else if("Kwadrat".equals(choice)){
            request.getRequestDispatcher("square.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
