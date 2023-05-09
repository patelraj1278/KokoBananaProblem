public class KokoEatBanana {

    public boolean isPossible(int[] piles,int h,int k){
        int time=0;
        for(int p:piles){
            time+=(p-1)/k+1;
            System.out.println("for Pile =>"+p+".. For speed.. "+k+".. time =>"+time);
            if(time>h) break;
        }
        return time<=h;
    }
    public int findMinSpeed(int[] piles, int h) {
        int low=1,high=Integer.MAX_VALUE;
        while(low<high){
            int mid=low + (high-low)/2;
            if(isPossible(piles,h,mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        KokoEatBanana m = new KokoEatBanana();
        int[] piles = {3, 6, 7, 11};
        int k = m.findMinSpeed(piles,8);
        System.out.println("Result =>"+k);

        //int[] piles2 = {30,11,23,4,20};
        //int k1 = m.findMinSpeed(piles2,5);
        //System.out.println("Result =>"+k1);
        //int[] piles3 = {30,11,23,4,20};
        //int k2 = m.findMinSpeed(piles3,6);
        //System.out.println("Result =>"+k2);

    }
}