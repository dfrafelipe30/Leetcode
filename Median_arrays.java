public class Median_arrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        double m1 = -1, m2 = -1;
        int m = nums1.length;
        int n = nums2.length;
        if (m == 0 ){
            int mid = (int)n/2;
            double aux = (n % 2 == 1) ? (double)nums2[mid] : ((double)nums2[mid-1] + (double)nums2[mid])/2;
            return aux;
        }
        if (n == 0 ){
            int mid = (int)m/2;
            double aux = (m % 2 == 1) ? (double)nums1[mid] : ((double)nums1[mid-1] + (double)nums1[mid])/2;
            return aux;
        }
        if ((m+n) % 2 == 1){
            for (int count = 0; count <= (n +m)/2; count ++){
                if (i != m && j != n){
                    m1 = (nums1[i] > nums2[j]) ? nums2[j++] :nums1[i++];
                }
                else if (i < m){
                    m1 = nums1[i++];
                }
                else{
                    m1 = nums2[j++];
                }
            }
            return m1;
        }
        else{
            for (int count = 0; count <= (n +m)/2; count ++){
                m2 = m1;
                if (i != m && j != n){
                    m1 = (nums1[i] > nums2[j]) ? nums2[j++] :nums1[i++];
                }
                else if ( i < m){
                    m1 = nums1[i++];
                }
                else{
                    m1 = nums2[j++];
                }
            }
            return (m1 + m2) / 2;
        }
    }

    public static void main (String[] args){
        int ar1[] = {};
        int ar2[] = {1,2,3,4,5};
        System.out.println(findMedianSortedArrays(ar1,ar2));
    }
}
