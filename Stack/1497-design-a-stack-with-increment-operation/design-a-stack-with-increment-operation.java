class CustomStack {
    int [] st;
    int end=-1,maxSize=0,size=0;
    public CustomStack(int maxSize) {
        st= new int[maxSize];
        this.maxSize=maxSize;
    }
    
    public void push(int x) {
        if(size==maxSize) return;
        st[++end]=x;
        size++;
    }
    
    public int pop() {
        if(size==0) return -1;
        size--;
        return st[end--];
    }
    
    public void increment(int k, int val) {
        if(size<k){
            for(int i=0;i<size;i++){
                st[i]=st[i]+val;
            }
        }
        else{
            for(int i=0;i<k;i++){
                st[i]=st[i]+val;
            }
        }
        }
    }


/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */