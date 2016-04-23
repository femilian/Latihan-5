package bukutamu;

public class BukuTamu {
    private final String nama;
    private static int id = 0;
    private String alamat, nohp;
    
    public BukuTamu (String n){
        nama =n;
        id++;
    }
    public static int getID(){
        return id;
    }
    public void setAlamat (String a){
        alamat = a;
    }
    public  String getAlamat(){
        return alamat;
    }
    public void setnoHp(String no){
        nohp = no;
    }
    public String getnohp(){
        return nohp;
    }
    public void display(){
        System.out.println("ID              : "+id);
        System.out.println("Nama            : "+nama);
        System.out.println("Alamat          : "+alamat);
        System.out.println("No. handphone   : "+nohp);
    }
}
