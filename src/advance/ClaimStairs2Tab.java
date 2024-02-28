package advance;

public class ClaimStairs2Tab {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,5,2,7,1};
        System.out.println(findMinPath(arr));
    }

    private static int findMinPath(int[] arr) {
        int[] tab = new int[arr.length+1];
        tab[0] = arr[0];
        tab[1] = arr[0]+arr[1];
        for (int i = 2; i < tab.length; i++) {
            tab[i] = Math.min(tab[i-1], tab[i-2])+ arr[i-1];
        }
        return tab[tab.length-1];
    }
}
