public class M19 {
	public static void main(String[] args) {
		int a[]={18,-51,23,35,10,9,-3,52,81,69};
		int b[]={28,32,-35,40,73,17,92,32,13,29};
		int sum=0;
		System.out.print("陣列 a 內容: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("陣列 b 內容: ");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			sum+=a[i]*b[9-i];
		}
		System.out.print("Sum = " + sum);
	}
}
