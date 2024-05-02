package br.com.alura.application;

import br.com.alura.db.DB;
import br.com.alura.db.DbException;

import javax.xml.transform.Result;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Ana");
            st.setString(2, "mail@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("02/07/1979").getTime()));
            st.setDouble(4,3500);
            st.setInt(5,2);

            int rowsAffected = st.executeUpdate();

            if(rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys();

                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! Id=" + id);
                }

                DB.closeResultSet(rs);

            }

        }catch (SQLException | ParseException e){
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }

}
