import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class Calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        String login = request.getParameter("login");
        String pass = request.getParameter("password");

if("admin".equals(login)&&"admin".equals(pass)){
    writer.print("Zalogowano poprawnie");
}else{
    writer.print("Niepoprawne dane");
}
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        request.setCharacterEncoding("UTF-8");

        String v1 = request.getParameter("firstName");
        String v2 = request.getParameter("lastName");
        String v3 = request.getParameter("age");


        if (v1 == null && v2 != null & v3 != null) {
            writer.print("Nie wiem jak masz na imie, masz na nazwisko " + v2 + " i masz " + v3 + " lat.");
        } else if (v1 != null && v2 == null & v3 != null) {
            writer.print("Cześć " + v1 + " nie wiem jak masz na nazwisko, ale wiem, że masz " + v3 + " lat.");
        } else if (v1 != null && v2 != null & v3 == null) {
            writer.print("Cześć " + v1 + " " + v2 + " nie wiem ile masz lat");
        }else{
            writer.print("Cześć "+v1+" "+v2+" masz "+v3+" lat");
        }
    }
}