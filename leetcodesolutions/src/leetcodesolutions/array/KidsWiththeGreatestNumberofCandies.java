package leetcodesolutions.array;
import java.util.*;

public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < n; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i = 0; i < n; i++){
            int total = candies[i]+extraCandies;
            if(total>=max){
                result.add(true);
            }
            else{
                result. add(false);
            }
        }
        System.out.println(result);

	}

}
