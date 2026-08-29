class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        // Step 1: Put the newest element into the empty secondary queue
        q2.add(x);
        
        // Step 2: Transfer all older elements behind the new one
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        
        // Step 3: Swap the references (q1 always holds the main stack)
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}