
package model;

/**
 *
 * @author SAD
 */
public class MaGiamGia {
//    private String stt;
    private String rateGiamGia;
    private int soLuong;
    public MaGiamGia() {
    }

    public MaGiamGia( String rateGiamGia, int soLuong) {
      //  this.stt = stt;
        this.rateGiamGia = rateGiamGia;
        this.soLuong = soLuong;
    }
//
//    public String getStt() {
//        return stt;
//    }

    public String getRateGiamGia() {
        return rateGiamGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

//    public void setStt(String stt) {
//        this.stt = stt;
//    }

    public void setRateGiamGia(String rateGiamGia) {
        this.rateGiamGia = rateGiamGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return  "rateGiamGia=" + rateGiamGia + ", soLuong=" + soLuong ;
    }

   
    
}
