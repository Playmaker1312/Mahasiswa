
package and240530.dao;

import and240530.Mahasiswa;
import java.sql.*;

public class MahasiswaDb 
{
    public void insert(Mahasiswa mahasiswa) throws Exception
    {
        DBHelper db = new DBHelper();
        String query = "insert into mahasiswa values(?,?,?,?,?)";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, mahasiswa.getNobp());
        ps.setString(2, mahasiswa.getNama());
        ps.setString(3, mahasiswa.getAlamat());
        ps.setString(4, mahasiswa.getJenisKelamin());
        ps.setString(5, mahasiswa.getTglalhir());
        ps.executeUpdate();
    }
}
