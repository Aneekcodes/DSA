public class snakeReverse {
    static void main() {
        int arr[][]={
                {1,2,3,4},
                {5,7,8,9},
                {7,8,9,1},
                {5,4,6,7}};
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                for(int j=0; j< arr.length; j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for (int j = arr.length-1; j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
            System.out.println();

        }
    }

}
