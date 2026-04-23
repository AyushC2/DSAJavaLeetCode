class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int ec) {
        List<Boolean> list1 = new ArrayList<>(5);
        int max = 0;
        for(int i = 0 ;i < arr.length;i++){
                if(max < arr[i]){
                    max = arr[i];
                }
        }
        for(int i = 0 ;i < arr.length;i++){
                if(arr[i] + ec >= max){
                    list1.add(true);
                }else{
                    list1.add(false);
                }
        }
        return list1;
    }
}
