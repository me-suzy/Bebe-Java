/*
 * TestActualizariJDBC.java
 *
 * Created on August 18, 2004, 4:42 PM
 */

/**
 *
 * @author  Bebe
 */

package Test;

import java.sql.*;
import java.math.BigDecimal;

public class TestActualizariJDBC {
    public ResultSet CrsJucatori;
    public Statement StmtJucatori;
    public Connection conn;    
    
    /** Creates a new instance of TestActualizariJDBC */
    public TestActualizariJDBC() { ///constructorul clasei
        
        try{
            conexiune();
        }
    catch(Exception e){
        e.printStackTrace();
        System.out.println("ERORI la conectare BD");
    }
    }
public void conexiune()throws SQLException{
    
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    
    this.conn=DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.5:1521:bebe","bebe","domnita");
    
    this.StmtJucatori=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    
    this.CrsJucatori=StmtJucatori.executeQuery("select j.* from jucatori j");
    
    System.out.println("INITIAL:");
    this.afiseazaInregistrarile();     
    }
    
public static void main(String[]args){
    try{
        TestActualizariJDBC objTest=new TestActualizariJDBC();
        objTest.diverseModificari();
//inchiderea conexiunilor
        objTest.CrsJucatori.close();
        objTest.Stmt.CrsJucatori.close();                                                                     
        objTest.conn.close();        
    }
    catch (Exception err)
        {  if(err instanceof SQLException)
           { SQLException errSQL=(SQLException)err;
             javax.swing.JOptionPane.showMessageDialog(null,errSQL.getErrorCode()+"--"+err.getMessage(),
"Eroare actualizari!",javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    else
    {System.out.println("a aparut o eroare non-SQL");
     err.printStackTrace();}
    }
        }
            }
public void diverseModificari()throws SQLException { 
    
    // ne pozitionam pe inregistrarea a doua
    this.CrsJucatori.absolute(2);
        // modificam valoarea numelui:
    this.CrsJucatori.updateDouble("NUME ")
    this.CrsPersoane.updateRow();
}

// pozitionam pe inregistrarea urmatoare (daca exista)
    if (this.CrsJucatori.next())
        {  //modificam prenume
            java.util.Date dataJava=new java.text.SimpleDateFormat("")
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
