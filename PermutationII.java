import java.util.*;

public class PermutationII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        permuteUnique(nums, new ArrayList<>(), results, new boolean[nums.length]);
        return results;
    }

    private void permuteUnique(int[] nums, List<Integer> result, List<List<Integer>> results,
            boolean[] visited) {
        if (result.size() == nums.length) {
            results.add(new ArrayList<>(result));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            result.add(nums[i]);
            permuteUnique(nums, result, results, visited);
            result.remove(result.size() - 1);
            visited[i] = false;
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 1 };
        PermutationII per = new PermutationII();
        System.out.println(per.permuteUnique(nums));
    }
}
