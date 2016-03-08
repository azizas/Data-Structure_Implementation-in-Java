class head // Linked List in JAva 
{
    int data ; 
    head next ; 

    public static void main (String [] argv)
    {
        /*head h = new head (); 
        h=null ;
       h =  h.insert(h,4);
      h=  h.insert(h,3);
      h=   h.insert(h,2);
         h= h.insert(h,1);
          System.out.println();
         h.print(h);
           System.out.print("------------------\n");
           h = h.reverse(h);
           h.print(h); */
           int [] ar = new  int [3] ; 
            int [] f = new int [3] ;
            ar[0] = 1 ; 
             ar[1] = 2 ;  
              ar[2] =3 ; 
              f=ar ; 
             System.out.println(f[0]);  
      
        }
    static head insert (head h,int x )
    {
        head temp = new head ();
             head t = new head ();
        temp.data = x ; 
        temp.next = null; 
        if (h==null)
        {
            h = temp ; 
            }
            else 
            t = h ; 
            while (t.next != null)
            t = t.next ; 
         t.next = temp ; 
           
      return h ;   
    }
   static void print (head g )
    {
        head f = g ; 
        while (f != null)
        {
      
            System.out.println(f.data);
         f= f.next ;   
        }
        }
        head reverse (head g)
        {
        head temp , prev , point  ; 
        temp = g ; 
        prev  = null ; 
        while (temp != null)
        {
         point  = temp.next ; 
         temp.next = prev  ; 
         prev = temp ; 
         temp = point ; 
        }
        g = prev ;  
         return g ;   
        }
   
        
    }