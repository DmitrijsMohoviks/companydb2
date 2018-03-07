package lv.tsi.javasources.companydb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;


@WebServlet(name = "AddPositionServlet", urlPatterns = "/addposition")
public class AddPositionServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pos_name = request.getParameter("position-name");
        //System.out.println(pos_name);
        try (
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/company");

        ) {
            Statement stmt1 = conn.createStatement();
            ResultSet next_id_rs = stmt1.executeQuery("select max(id) id from POSITION");
            long id = 1;
            while (next_id_rs.next()) {
                id = next_id_rs.getLong("id");
                //System.out.println(id);
            }
            long next_id = id + 1;
            PreparedStatement stmt2 = conn.prepareStatement("INSERT INTO POSITION (ID, NAME) VALUES (" + next_id + ", ?)");
            //System.out.println(pos_name + "-2");
            stmt2.setString(1, pos_name);
            stmt2.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Something went wrong!");
        }


    //    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //    }
    }
}