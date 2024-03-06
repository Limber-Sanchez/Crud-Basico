/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.empleadosDAL;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/* Crear un crud que se pueda "Agregar", "Editar", "Eliminar", "Canselar", y aser una base de datos
y poder agregar registros 
*/
public class conexion {
    //variable que inicia la conexion
    public Connection conectar; 
    // Inicio de la conexion
    public conexion(){
        // Creando variables para conectar la base de datos
        String url_de_la_base = "jdbc:mysql://localhost:3306/";// NOmbre conector/Puerto
        String basededatos = "crud"; // Nombre de la base de datos
        String usuario = "root"; //usuario
        String Password = "";  // Cotraseña de la base de datos "No tine"
        //-----------iniciando la conexionn---------
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection(url_de_la_base +  basededatos,usuario,Password); 
            System.out.println("conectado a la base de datos");   
        } catch (Exception e) {
            System.err.println("ERROR:" + e); //PARA OBTENER EL ERROR 
        }
    }
    // Creando metod que los permitira insertar los datos ala base de datos 
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        //  Crear un try/catch para atrapar si ubiera un error
        try {
            PreparedStatement pstn = conectar.prepareStatement(strSentenciaSQL);
            // Llmamos la varibel que creamos con "pstn" para ejutarla
            pstn.execute();
            return 0;
        } catch (SQLException e) {
            // Mensaje de excepsion
            System.out.println(e);
            // Y que los retorne la informacion
            return 1;
        }
    }
    // Consultar informacion y recupoerar datos con el parametro de "Resultset"
    public ResultSet consultarRegistroSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstn = conectar.prepareStatement(strSentenciaSQL);
            // Creando respuesta para luego retornarla
            ResultSet respuesta = pstn.executeQuery();
            // Retornamos la respuesta 
            return respuesta;
        } catch (Exception e) {
            // Mostrar error
            System.out.println(e);
            // retornar nul en caos que no haygan datos reggistrados
            return null;
        }
    }
}
