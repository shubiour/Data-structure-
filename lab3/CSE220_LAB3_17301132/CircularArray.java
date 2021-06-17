public class CircularArray{
    
    private int c;
    private int size;
    private Object [] cir;
    
    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object [] lin, int st, int sz){
        cir = new Object [lin.length];
        size = sz;
        c = st;
        int s=st;
        for(int i=0; i<size; i++){
            cir[s]=lin[i];
            s=(s+1)%cir.length;
        }
        
    }
    
    //Prints from index --> 0 to cir.length-1
    public void printFullLinear(){
        for(int i=0; i<cir.length; i++){
            System.out.print(cir[i]+" ");
        }
        System.out.println();
    }
    
    // Starts Printing from index start. Prints a total of size elements
    public void printForward(){
        int s =c;
        for(int i=0; i<size; i++){
            System.out.print(cir[s]+" ");
            s=(s+1)%cir.length;
        }
        System.out.println();
    }
    
    public void printBackward(){
        int s =c-c;
        for(int i=0; i<size; i++){
            System.out.print(cir[s]+" ");
            s--;
            if(s==-1){
                s=cir.length-1;
            }
            
        }
    }
    
    // With no null cells
    public void linearize(){
        Object newLinArray[]=new Object [cir.length-1];
        int s =c;
        for(int i=0; i<size; i++){
            newLinArray[i]=cir[s];
            s=(s+1)%cir.length;
        }
        cir = newLinArray;
        
    }
    
    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity){
        Object newCirArray2[]=new Object [newcapacity];
        int s =c;
        int t=c;
        for(int i=0; i<size; i++){
            newCirArray2[t]=cir[s];
            s=(s+1)%cir.length;
            t=(t+1)%newCirArray2.length;
        }
        cir = newCirArray2;
    }
    
    // Start index becomes zero
    public void resizeByLinearize(int newcapacity){
        Object newCirArray3[]=new Object [newcapacity];
        int s =c;
        for(int i=0; i<size; i++){
            newCirArray3[i]=cir[s];
            s=(s+1)%cir.length;
        }
        cir = newCirArray3;
    }
    
    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos){
        Object newCirArray$[];
        if(pos>=0 && pos<=size){
        if(size==cir.length){
            resizeStartUnchanged(8);
        }
        else{
            newCirArray$ = cir;
        }
        int offset =(c+pos)%cir.length;
        int nShift = size-pos;
        int from = (c + size) % cir.length;
        int to = (from+1) % cir.length;
        
        for(int i=0; i<=nShift; i++){
            cir[to] = cir[from];
            to = from;
            from--;
            if (from == -1)
                from = cir.length;
        }
        cir[offset]=elem;
    }
        else{
        return;
        }
    }
    
    public void insertByLeftShift(Object elem, int pos){
       Object newCirArray$[];
        
         if(pos>=0 && pos<=size){
        if(size==cir.length){
            resizeStartUnchanged(8);
        }
        else{
            newCirArray$ = cir;
        }
        int offset =(c+pos)%cir.length;
        int nShift = size-pos;
        int from = (c + size+2) % cir.length;
        int to = (from-1) % cir.length;
       
        for(int i=0; i<nShift; i++){
            cir[to] = cir[from];
            to = from;
            from++;
            if (from == cir.length )
                from = 0;
        }
        cir[offset]=elem;
    }
        else{
        return;
        }
        
        this.c=1;
        size=size+1;
    }
    
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos){
        
        int offset =(c+pos)%cir.length;
        int nShift = size-pos-1;
        int to = offset;
        int from = (to+1) % cir.length;
        int nullify = from;
        
        for(int i=0; i<nShift; i++){
            cir[to] = cir[from];
            to = from;
           from=(from+1)%cir.length;
        }
        cir[nullify]=null;
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos){
        int offset =(c+pos)%cir.length;
        int nShift = size-pos+1;
        int to = offset;
        int from = to-1;
        int nullify = from;
        
        for(int i=0; i<nShift; i++){
            cir[to] = cir[from];
            to = from;
            from--;
            if(from == -1){
            from = cir.length-1;
            }
        }
        cir[c]=null;
        this.c=c+1;
        this.size=size-1;
       
    }
    
    
    //This method will check whether the array is palindrome or not
    public void palindromeCheck(){
        int s =c;
        int n=0;
        Object newCirArray5[]=new Object[cir.length];
        for(int i=0; i<size; i++){
            newCirArray5[i]= cir[s];
            s=(s+1)%cir.length;
        }
        int e = size-1;
        int p=0;
        boolean flag = false;
        while(p<e){
            if(newCirArray5[p] == newCirArray5[e]){
            flag = true;
            }
            else{
            flag = false;
            break;
            }
            p++;e--;
        } if(flag == true){
        System.out.println(" This array is a palindrome.");
        }
        else{
        System.out.println(" This array is NOT a palindrome.");
        }
        
    }
    
    
    //This method will sort the values by keeping the start unchanged
    public void sort(){
        
        
       
    
    }
    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k){
        int m = this.c;
        int j = k.c;
        for(int i=0; i<size; i++){
            if(this.cir[m] != k.cir[j]){
            return false;
            }
            m = (m+1)%this.cir.length;
            j = (j+1)%k.cir.length;
        }
        return true;
        }
    }
