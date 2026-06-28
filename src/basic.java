public class basic {
    static void main() {
        int arr[][]={{1,2,3,4},{5,7,8,9},{7,8,9,1},{5,4,6,7}};
        for(int i=0; i<arr[0].length;i++){
            for(int j=0; j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}



//int arr[] []= new int[3][4];
//        for(int i=0; i<3; i++){
//        for (int j=0; j<4; j++){
//        System.out.print(arr[i][j]);
//            }
//                    System.out.println();
//        }
