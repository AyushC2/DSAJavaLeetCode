class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length,-1));
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0 ;i--){
            while(!stack.isEmpty() && arr[i] <= stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans.set(i,stack.peek());
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
