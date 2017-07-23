/**
 * 
 */
package week3.greedy;

import java.util.Arrays;

/**
 * @author Pratik Sanglikar
 *
 */
public class FractionalKnapsack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 1;
		int w = 10;
		KnapsackItem[] array = { new KnapsackItem(500, 30)};
		FractionalKnapsackHelper helper = new FractionalKnapsackHelper();
		System.out.println(helper.getMaximumValue(n, w, array));
	}
}

class FractionalKnapsackHelper {

	public double getMaximumValue(int n, long w, KnapsackItem[] loot) {
		double maximumLoot = 0.0;
		Arrays.sort(loot);
		while (w > 0) {
			for (KnapsackItem knapsackItem : loot) {
				if (knapsackItem.weight < w) {
					maximumLoot += knapsackItem.value;
					w -= knapsackItem.weight;
				} else {
					double fraction = ((double) w) / knapsackItem.weight;
					maximumLoot += knapsackItem.value * fraction;
					w = 0;
				}
			}
		}
		return maximumLoot;
	}
}

class KnapsackItem implements Comparable<KnapsackItem> {

	public int weight;
	public int value;

	/**
	 * 
	 */
	public KnapsackItem(int value, int weight) {
		this.weight = weight;
		this.value = value;
	}

	public double getValueToWeightRatio() {
		return (this.value / this.weight);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(KnapsackItem o) {
		return Double.compare(o.getValueToWeightRatio(), this.getValueToWeightRatio());
	}
}
