package practice.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        //System.arraycopy(src, srcPos ,dest,destPos,length ) 
      int OrgArr[] = {1,2,3,4,5,6,7,8,9};
      int arr[] = new int[6];
      int arr1[] = new int [5];
      arr1[0] = 10;
      arr1[1] = 20;
      arr1[2] = 30;
      arr1[3] = 40;
      arr1[4] = 50;

      for(int i : OrgArr)
      {
          System.out.print(i+" ");
      }

      System.out.println();
      System.arraycopy(OrgArr, 4, arr, 0, 4);

      for(int i : arr)
      {
        System.out.print(i+" ");
      } 

      System.out.println();
    for(int i : arr1){
        System.out.print(i+" ");
    }
      System.arraycopy(OrgArr, 0, arr1, 1, 3);
System.out.println();
      for(int i : arr1){
        System.out.print(i+" ");
    }
        
    }
    
}
