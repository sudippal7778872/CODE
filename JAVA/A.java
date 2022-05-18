import java.lang.*;

import java.io.*;

import java.util.*;

public class A


{
    
public static void main(String[] args)
  
 {
        
Scanner sc=new Scanner(System.in);

      
  for(int i=1;i<=20;i++)
     
  {
            
      
       
     if(i%3==0)
     
       {
     
if(i%3==0 && i%5==0)
         
 {
          
     System.out.println("usbdevice");
       
     }
    
else    
      System.out.println("usb");
        
    }
   
   
      if(i%5==0)
        
    {
       
if(i%3==0 && i%5==0)
         
 {
          
     System.out.println("usbdevice");
       
     }
  
else 
        System.out.println("device");
     
       }
          
  else      
     {
           
 System.out.println(i);
        

            }
      
  }
}
}