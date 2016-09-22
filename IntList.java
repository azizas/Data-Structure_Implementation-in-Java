

public class IntList {

    // Fields
    private int[] items;
    private int   size;
    private static final int START_SIZE = 8;
    
    // Constructor
    IntList () {
        items = new int[START_SIZE];
        size  = 0;
    }

    public int getAt(int index) {
        return items[index];
    }

    public void append(int toAdd) {
        checkAndGrow();
        items[size] = toAdd;
        size++;
    }
    
    public void prepend (int toAdd) { 
        if(size>=items.length){
            checkAndGrow();
        }
        updateList(0);
       
         items[0] = toAdd; 
        size++;                                     // only implement this method
    }

    public void insertAt(int toAdd, int index) {       // onlyimplements this method
        updateList(index);
        items[index] = toAdd;
        size++; 

    }

    public void removeAt(int index) {
        shiftLeft(index);
        size--;
    }
    
    /*
     * Expands the size of the list whenever it is at
     * capacity
     */
    private void checkAndGrow () {
        // Case: big enough to fit another item, so no
        // need to grow
        if (size < items.length) {
            return;
        }
        
        // Case: we're at capacity and need to grow
        // Step 1: create new, bigger array; we'll
        // double the size of the old one
        int[] newItems = new int[items.length * 2];
        
        // Step 2: copy the items from the old array
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        
        // Step 3: update IntList reference
        items = newItems;
    }
    public void print (){
        for (int i = 0 ; i<size ; i++){
            System.out.print(items[i]+" ");
        }
    System.out.println("This is items sub [size] "+ size); // debugging
    }


    /*
     * Shifts all elements to the right of the given
     * index one left
     */
    private void shiftLeft (int index) {
        for (int i = index; i < size-1; i++) {
            items[i] = items[i+1];
        }
   
    }
     private void updateList (int index){

         for (int i = size-1  ; i>=index ; i-- ){
            items[i+1] = items[i];
        }
    }

    public static void main (String [] args){

        IntList list1 = new IntList(); 
        list1.append(12);
        list1.append(56);
        list1.append(6);
        list1.append(8);
        list1.prepend(1);
        list1.prepend(1340);
        list1.insertAt(-12,3);

      list1.print();
    //list1.print();
        System.out.println();
        
    }
    
}