
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        Date dt = new Date();
        SimpleDateFormat df = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        out.println(df.format(dt));
        out.close();
    }
}