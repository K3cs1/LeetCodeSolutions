package top_k_frequent_elements_347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> count = new HashMap<>();
		List<List<Integer>> freq = new ArrayList<>();
		for (int i = 0; i < nums.length + 1; i++) {
			freq.add(new ArrayList<>());
		}
		for (int num : nums) {
			count.put(num, count.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			freq.get(entry.getValue()).add(entry.getKey());
		}
		List<Integer> res = new ArrayList<>();
		for (int i = freq.size() - 1; i > 0; i--) {
			for (int j = 0; j < freq.get(i).size(); j++) {
				if (!freq.get(i).isEmpty()) {
					res.add(freq.get(i).get(j));
					if (res.size() == k) {
						return res.stream().mapToInt(Integer::valueOf).toArray();
					}
				}
			}
		}
		return new int[] {};
	}

}
