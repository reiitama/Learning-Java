package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class konek {
    static Connection koneksi;
    public static Connection getConnection(){
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/sekolah","root","");
        }catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"KONEKSI GAGAL!!");
        }return koneksi;
    }
}
