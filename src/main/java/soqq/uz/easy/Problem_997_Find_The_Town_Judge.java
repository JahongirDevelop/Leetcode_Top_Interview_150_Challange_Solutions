package soqq.uz.easy;

public class Problem_997_Find_The_Town_Judge {
    public static void main(String[] args) {
    int n = 3;
    int[][] trust = {{1,3},{2,3},{3,1}};
        System.out.println(findJudge(n, trust));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] inout = new int[n+1];
        for(int[] i:trust){
            inout[i[0]]-=1;
            inout[i[1]]+=1;
        }
        for(int i=1;i<=n;i++){
            if(inout[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}
