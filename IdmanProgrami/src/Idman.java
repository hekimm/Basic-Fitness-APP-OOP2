/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
public class Idman {
    
    private int burpeeSayisi;
    private int squatSayisi;
    private int pushUpSayisi;
    private int sitUpSayisi;

    public Idman(int burpeeSayisi, int squaySayisi, int pushUpSayisi, int sitUpSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.squatSayisi = squaySayisi;
        this.pushUpSayisi = pushUpSayisi;
        this.sitUpSayisi = sitUpSayisi;
    }
    
    
    public void hareketYap(String hareketTuru,int sayi){
        
        
       if (hareketTuru.equals("Burpee")){
           burpeeYap(sayi);
       }
       
       else if (hareketTuru.equals("Squat")){
           squatYap(sayi);
       }
       
        else if (hareketTuru.equals("Pushup")){
           pusUpYap(sayi);
       }
        else if(hareketTuru.equals("Situp")){
           sitUpYap(sayi);

        }
        else{
            System.out.println("Böyle bir hareket yok");
        }
       
       
      
       
    }
    
     public void burpeeYap(int sayi){
           if(burpeeSayisi ==0){
               System.out.println("Yapacak burpee kalmadı");
           }
           if(burpeeSayisi - sayi<0){
               System.out.println("Hedeflediğin burpee sayısını geçtin,Tebrikler");
               burpeeSayisi =0;
               System.out.println("Kalan burpee : " + burpeeSayisi);
           }
           else{
               burpeeSayisi -= sayi;
               System.out.println("Kalan burpee " + burpeeSayisi);
           }
       }
     
     
     
          public void squatYap(int sayi){
           if(squatSayisi ==0){
               System.out.println("Yapacak squat kalmadı");
           }
           if(squatSayisi- sayi<0){
               System.out.println("Hedeflediğin squat sayısını geçtin,Tebrikler");
               squatSayisi =0;
               System.out.println("Kalan squat : " + squatSayisi);
           }
           else{
               squatSayisi -= sayi;
               System.out.println("Kalan squat " + squatSayisi);

           }
       }
          
          
          
               public void pusUpYap(int sayi){
           if(pushUpSayisi ==0){
               System.out.println("Yapacak push up kalmadı");
           }
           if(pushUpSayisi - sayi<0){
               System.out.println("Hedeflediğin burpee sayısını geçtin,Tebrikler");
               pushUpSayisi =0;
               System.out.println("Kalan burpee : " + pushUpSayisi);
           }
           else{
               pushUpSayisi -= sayi;
               
               System.out.println("Kalan push up " + pushUpSayisi);

           }
       }
               
               
                    public void sitUpYap(int sayi){
           if(sitUpSayisi ==0){
               System.out.println("Yapacak sit up kalmadı");
           }
           if(sitUpSayisi- sayi<0){
               System.out.println("Hedeflediğin sit up sayısını geçtin,Tebrikler");
               sitUpSayisi =0;
               System.out.println("Kalan sit up : " + sitUpSayisi);
           }
           else{
               
               sitUpSayisi -= sayi;
                System.out.println("Kalan sit up : " + sitUpSayisi);

           }
       }
    
    
  
    
    
    /**
     * @return the burpeeSayisi
     */
    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    /**
     * @param burpeeSayisi the burpeeSayisi to set
     */
    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    /**
     * @return the squaySayisi
     */
    public int getSquaySayisi() {
        return squatSayisi;
    }

    /**
     * @param squaySayisi the squaySayisi to set
     */
    public void setSquaySayisi(int squaySayisi) {
        this.squatSayisi = squaySayisi;
    }

    /**
     * @return the pushUpSayisi
     */
    public int getPushUpSayisi() {
        return pushUpSayisi;
    }

    /**
     * @param pushUpSayisi the pushUpSayisi to set
     */
    public void setPushUpSayisi(int pushUpSayisi) {
        this.pushUpSayisi = pushUpSayisi;
    }

    /**
     * @return the sitUpSayisi
     */
    public int getSitUpSayisi() {
        return sitUpSayisi;
    }

    /**
     * @param sitUpSayisi the sitUpSayisi to set
     */
    public void setSitUpSayisi(int sitUpSayisi) {
        this.sitUpSayisi = sitUpSayisi;
    }
    
    public boolean idmanBittiMi(){
      return (burpeeSayisi ==0 && squatSayisi ==0 && pushUpSayisi ==0 && sitUpSayisi ==0 );
    }
    
}
