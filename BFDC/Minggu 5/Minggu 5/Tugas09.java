public class Tugas09 {
    public int maxUTS(int[] arr, int left, int right){
        if(left == right){
            return arr[left];
        }

        int mid = (left + right) / 2;

        int leftMax = maxUTS(arr, left, mid);
        int rightMax = maxUTS(arr, mid + 1, right);
        
        return Math.max(leftMax, rightMax);
    }

    public int minUTS(int[] arr, int left, int right){
        if(left == right){
            return arr[left];
        }

        int mid = (left + right) / 2;

        int leftMin = minUTS(arr, left, mid);
        int rightMin = minUTS(arr, mid + 1, right);
        
        return Math.min(leftMin, rightMin);
    }

    public double rataUAS(int[] arr){
        double total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total / arr.length;
    }
}