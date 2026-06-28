public class rowmax {
    static void main() {
        int arr[][]={{1,2,3,4},{5,7,8,9},{7,8,9,1},{5,4,6,7}};
        int a= 0;
        int max=0;

        for(int row=0;row<arr.length;row++){

            int rowsum=0;
            for(int col=0;col<arr[row].length;col++){
                rowsum= rowsum+ arr[row][col];
            }
            if(max<rowsum){
                max= rowsum;
                a= row;
            }
        }
        System.out.println(a);
    }
}
