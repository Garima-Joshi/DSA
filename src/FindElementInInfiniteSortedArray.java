
public class FindElementInInfiniteSortedArray {
    public static void main(String[] args) {
        //         0,1,2,3,4,5, 6, 7, 8, 9,10,11,12,13,14,15
        int arr[]={2,3,4,5,6,7,10,14,16,18,25,27,29,31,34,37};
        //remember here in this code since arr is finite after some point window framme will give .ArrayIndexOutOfBoundsException
        int target=16;
        System.out.println(elementIndex(arr,target));
    }
   //since array is infinite we can use arr.length.
    //We will select exponential window frame and search if our element exist in that frame
    public static int elementIndex(int arr[],int target) {
        int s=0,e=1,size=1;
        while(target>arr[e]){
            s=e+1;
            size*=2;
            e=s+size+1;
        }

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]<target){
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}