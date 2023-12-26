import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class pegawai {
    private static final String URL = "jdbc:mysql://localhost:3306/bm";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void insertEmployeeData(Scanner scanNEW) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO pegawai (id, nama) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("----MEMBUAT DATA LOGIN BARU----");

                System.out.print("Masukkan ID Pegawai: ");
                int idValue = scanNEW.nextInt();

                System.out.print("Masukkan User Name: ");
                String usernameValue = scanNEW.next();        

                preparedStatement.setInt(1, idValue);
                preparedStatement.setString(2, usernameValue);
                
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Berhasil menambah data login baru");
                } else {
                    System.out.println("Tidak dapat menambah data login baru");
                }

                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
