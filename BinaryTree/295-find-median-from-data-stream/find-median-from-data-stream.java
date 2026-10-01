class MedianFinder {
    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int num) {
        if (max.size() == 0)
            max.add(num);
        else if (num <= max.peek())
            max.add(num);
        else
            min.add(num);
        if (Math.abs(max.size() - min.size()) > 1) {
            if (min.size() < max.size()) {
                min.add(max.poll());
            } else
                max.add(min.poll());
        }
    }

    public double findMedian() {
        if (max.size() == min.size())
            return (max.peek() + min.peek()) / 2.0;

        return max.size() > min.size() ? max.peek() : min.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */