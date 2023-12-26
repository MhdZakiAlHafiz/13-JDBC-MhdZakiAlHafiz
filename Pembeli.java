public class Pembeli implements iSupermarket{
    public String nama;
    public String alamat;
    public Pembeli(String nama, String noHp){
        this.nama = nama;
        this.alamat = alamat;
    }
    @Override
    public void dataPelanggan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dataPelanggan'");
    }
    @Override
    public void cetakFaktur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cetakFaktur'");
    }
    @Override
    public void totalBelanja() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'totalBelanja'");
    }
}