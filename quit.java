public class Quickshort {
	public static void main(String [] args) {
		
		int a[] = {41, 13, 2, -5, 28, 105, 6};
		int b[] = {12, 67, -21, 25, 77, 3, -2, 100, 1};	
		int c[] = {1, 3, 2, -5, 8, 10, 6};
		method_short(a, a[1]);
		System.out.println();
		method_short(b, b[4]);
		System.out.println();
		method_short(c, c[0]);
	}
	
	public static void method_short(int [] b, int a) {
		int c[]=new int[b.length];
		int x=0, y=b.length-1, d=0;
		
		for(int i=0; i<b.length; i++) {
			if(b[i]<=a) {
				c[x]=b[i];
				for(int j=x; j>0; j--) {
					if(c[j]<c[j-1]) {
						d=c[j];
						c[j]=c[j-1];
						c[j-1] = d;
					}
				}
				x++;
			}else {
				c[x]=b[i];
				for(int j=x; j>0; j--) {
					if(c[j]>c[j-1]) {
						break;
					}else {
						d=c[j];
						c[j]=c[j-1];
						c[j-1]=d;
					}
				}
				x++;
			}
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+", ");
		}
	}
}

