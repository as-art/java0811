
package com.pcschool.ocp.d04;
public class Book {
    private int pages = 200 ;
    
    public Book(){
         
    }
    
    public Book(int pages) {
         this.pages = 200;
         if(pages > 0 && pages < this.pages){
             this.pages = pages;
         }
         
    }

   
   @Override
    public String toString() {
        return "Book{" + "pages=" + pages + '}';
    

   
    

    
    
    
    
    
    
    
    
    
    
}
}