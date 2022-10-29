package arbucret23;

import java.util.Scanner;

public class arbUcret232 {
    
    public static void main(String[] args) {
    
        System.out.print("Anlaşma Miktarını Giriniz: ");
        Scanner data = new Scanner (System.in);

        int anMi = data.nextInt();
        
        double sonuc;
        
        double a = 100000;
        double b = 160000;
        double c = 260000;
        double d = 520000;
        double e = 1560000;
        double f = 2080000;
        double g = 4160000;
        
        
        double sonuc1 = a * 0.06;
        double sonuc2 = b * 0.05;
        double sonuc3 = c * 0.04;
        double sonuc4 = d * 0.03;
        double sonuc5 = e * 0.02;
        double sonuc6 = f * 0.015;
        double sonuc7 = g * 0.01;
        
        if ((anMi - a) > 0){
            
            if (((anMi - a) - b) > 0){
                
                if ((((anMi - a) - b) - c) > 0){
                    
                    if (((((anMi - a) - b) - c) - d) > 0 ){
                        
                        if ((((((anMi - a) - b) - c) - d) - e) > 0){
                            
                          if (((((((anMi - a) - b) - c) - d) - e) - f) > 0){
                              
                            if ((((((((anMi - a) - b) - c) - d) - e) - f) - g) >= 0 ){
                                
                                sonuc = (((((((anMi - a) - b) - c) - d) - e) - f) - g) * 0.005;
                                System.out.println("Arabuluculuk Ücretiniz: " + (sonuc7 + sonuc6 + sonuc5 + sonuc4 + sonuc3 + sonuc2 + sonuc1 + sonuc) + " -TL'dir.");
                            }
                            else{
                                
                                if ((((((((anMi - a) - b) - c) - d) - e) - f) - g) < 0){
                                    sonuc = (((((((anMi - a) - b) - c) - d) - e) - f) - g) * 0.01;
                                    System.out.println("Arabuluculuk Ücretiniz: " + (sonuc6 + sonuc5 + sonuc4 + sonuc3 + sonuc2 + sonuc1 + sonuc) + " -TL'dir.");
                                }
                                
                            }
                               
                          }
                          else{
                              if (((((((anMi - a) - b) - c) - d) - e) - f) < 0){
                                  sonuc = ((((((anMi - a) - b) - c) - d) - e) - f) * 0.015;
                                  System.out.println("Arabuluculuk Ücretiniz: " + (sonuc5 + sonuc4 + sonuc3 + sonuc2 + sonuc1 + sonuc) + " -TL'dir.");
                              }
                          }

                        }
                        else{
                            if ((((((anMi - a) - b) - c) - d) - e) < 0){
                                sonuc = (((((anMi - a) - b) - c) - d) - e) * 0.02;
                                System.out.println("Arabuluculuk Ücretiniz: " + (sonuc4 + sonuc3 + sonuc2 + sonuc1 + sonuc) + " -TL'dir.");
                            
                        }
                        }
                        
                        
                    }
                    else{
                        if(((((anMi - a) - b) - c) - d) < 0){
                            sonuc = ((((anMi - a) - b) - c) - d) * 0.03;
                            System.out.println("Arabuluculuk Ücretiniz: " + (sonuc3 + sonuc2 + sonuc1 + sonuc) + " -TL'dir.");
                        }
                    }
                    
                }
                else{
                    if ((((anMi - a) - b) - c) < 0){
                        sonuc = (((anMi - a) - b) - c) * 0.04;
                        System.out.println("Arabuluculuk Ücretiniz: " + (sonuc2 + sonuc1 + sonuc) + " -TL'dir.");
                    }
                }
                
                
            }
            else{
                if (((anMi - a) - b) < 0){
                    sonuc = ((anMi - a) - b) * 0.05;
                    System.out.println("Arabuluculuk Ücretiniz: " + (sonuc1 + sonuc) + " -TL'dir.");
                }
            }
        }
        
        else{
            if ((anMi - a) < 0){
                sonuc = anMi * 0.06;
                if (sonuc < 1600){
                    System.out.println("Arabuluculuk Ücretiniz: " + 1600 + " -TL'dir.");
                }
                else{
                    System.out.println("Arabuluculuk Ücretiniz: " + sonuc + " -TL'dir.");
                }
                
            }
            
        }
        
        
    data.close();    
        
        
    }
    
}
