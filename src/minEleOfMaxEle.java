public class minEleOfMaxEle {
    static void main() {
        int arr[][]={{1,2,3,4},{5,7,8,9},{7,8,9,1},{5,4,6,7}};
        int maxRow= Integer.MIN_VALUE;
        int totalMin = Integer.MAX_VALUE;
        int sum=0;
        int ansarr []= new int[4];
        int k=0;

        for(int i=0;i<arr.length;i++) {

            for(int j=0;j<arr[0].length;j++) {
                sum+=arr[i][j];
                if(sum> maxRow){
                    maxRow=sum;
                }
            }
            System.out.println(maxRow);
            if(totalMin> maxRow){
                totalMin=maxRow;
            }
        }
        System.out.println(totalMin);

    }
}

//public class minEleOfMaxEle {
//    static void main() {
//        int arr[][]={{1,2,3,4},{5,7,8,9},{7,8,9,1},{5,4,6,7}};
//
//        int totalMin = Integer.MAX_VALUE;
//
//        for(int i=0;i<arr.length;i++) {
//            int maxRow=arr[i][0];
//            for(int j=0;j<arr[i].length;j++) {
//                if(arr[i][j]> maxRow){
//                    maxRow=arr[i][j];
//                }
//            }
//            System.out.println(maxRow);
//            if(totalMin> maxRow){
//                totalMin=maxRow;
//            }
//        }
//        System.out.println(totalMin);
//
//    }
//}
