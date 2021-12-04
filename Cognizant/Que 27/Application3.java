import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Job{
	public Integer st;
	public Integer ed;
	public Integer cost;
	
	public Job() {
		super();
	}

	public Job(Integer st, Integer ed, Integer cost) {
		super();
		this.st = st;
		this.ed = ed;
		this.cost = cost;
	}
}
class Pair{
	public Integer first;
	public Integer second;
	public Pair() {
		super();
	}
	public Pair(Integer first, Integer second) {
		super();
		this.first = first;
		this.second = second;
	}
}
class SortingJobs implements Comparator<Job>{

	@Override
	public int compare(Job o1, Job o2) {
		if(o1.ed<o2.ed) {
			return 1;
		}else {
			return 0;
		}
	}	
}
public class Application3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Job[] arr=new Job[n];
		int cost;
		String st,ed;
		int total=0;
		for(int i=0;i<n;i++) {
			st=sc.next();
			ed=sc.next();
			if(st.length()<4) {
				while(st.length()!=4) {
					st+="0";
				}
			}
			if(ed.length()<4) {
				while(ed.length()!=4) {
					ed+="0";
				}
			}
			cost=sc.nextInt();
			arr[i] = new Job();
			arr[i].st = getTime(st);
			arr[i].ed = getTime(ed);
			arr[i].cost = cost;
			total += cost;
		}
		Arrays.sort(arr,new SortingJobs());
		Pair res = new Pair();
		res = solve(arr,n);
		if(res==null) {
			System.out.println(0);
		}else {
			System.out.println(n-res.first);
			System.out.println(total-res.second);
		}
		
	}
	private static Pair solve(Job[] arr, int n) {
		if(n==0) {
			return null;
		}
		int dp[]=new int[n];
		int numOfJobs[]=new int[n];
		for(int i=0;i<n;i++) {
			dp[i]=0;
			numOfJobs[i]=0;
		}
		dp[0] = arr[0].cost;
		numOfJobs[0]=1;
		for(int i=1;i<n;i++) {
			int curr=arr[i].cost;
			int num=1;
			int idx=searchJob(arr,0,i-1,arr[i].st);
			if(idx!=curr && idx!=-1) {
				curr+=dp[idx];
				num+=numOfJobs[idx];
			}
			if(curr>dp[i-1]) {
				dp[i]=curr;
				numOfJobs[i]=num;
			}else {
				dp[i]=dp[i-1];
				numOfJobs[i]=numOfJobs[i-1];
			}
		}
		return new Pair(numOfJobs[n-1],dp[n-1]);
	}
	private static int searchJob(Job[] arr, int st, int ed, int key) {
		int ans=-1;
		while(st<=ed) {
			int mid=(st+ed)/2;
			if(arr[mid].ed<=key) {
				ans=mid;
				st=mid+1;
			}else {
				ed=mid-1;
			}
		}
		return ans;
	}
	private static int getTime(String st) {
		int hr = (st.charAt(0)-'0')*10 + (st.charAt(1)-'0');
		int min = (st.charAt(2)-'0')*10 + (st.charAt(3)-'0');
		return hr*60 + min;
	}
}
