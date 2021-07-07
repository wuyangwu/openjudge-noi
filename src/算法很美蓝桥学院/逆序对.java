package 算法很美蓝桥学院;

public class 逆序对 {
//	左大右小逆序对
	static int ans = 0;
	
	static void sort(int i , int j, int center ,int a[], int b[]) {
		int x =i,mid = center+1, y = j,k=i;
		while (i<=center&&mid<=j) {
			if (a[i]>a[mid]) {
				//左边的大于右边的  ，因为我左边有序则我左边的都大于右边的
				ans += center-i+1;
				b[k++] = a[mid++];
			}else {
				// 左边的小于右边的
				b[k++] = a[i++];
			}
		}
		while (i<=center) {
			b[k++] = a[i++];
		}
		while (mid<=j) {
			b[k++] = a[mid++];
		}
		for (int k2 = x; k2 <=j; k2++) {
			a[k2] = b[k2];
		}
	}

	static void mergeSort(int a[], int i, int j,int b[]) {
		if (i<j) {
			int center = i+(j-i)/2;
			mergeSort(a, i, center,b);
			mergeSort(a, center+1,j,b);
			sort(i, j, center, a, b);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {37,40,48,90,32,5,12,3,44,13};
        int[] c = new int[10];
        mergeSort(a,0, 9 ,c);
        for (int i = 0; i <10; i++) {
        	System.out.print(a[i]+" ");
		}
		System.out.println();
        System.out.println(ans);
	}

}
