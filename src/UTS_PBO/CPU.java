package UTS_PBO;

public class CPU {
    protected String nama;
    protected int kecepatan;
    
    public CPU(String n, int k){
        nama = n;
        kecepatan = k;
    }
    
    public String getCPUData(){
        return (nama+" "+kecepatan);
    }
}
