import java.util.Arrays;

public class Main{

	public static void main(String[] args)
	{

		int[] f = new int[10];

		System.out.println(f[5]);

		int[] g = new int[5];
		printArray(g);
		Arrays.fill(g, 8);
		printArray(g);



		float[] c = new float[100];
		Arrays.fill(c, 1.0f);
		float sum = 0.0f;

		for (float value : c)
			sum += value;

		System.out.println(sum);
		
		int[] a = new int[11];
		Arrays.fill(a, 7);
		int[] b = new int[34];
		
		System.arraycopy(a, 0, b, 0, 11);
		System.out.println();
		printArray(a);
		System.out.println();
		printArray(b);
		System.out.println();

		float[] w = new float[99];
		float min = w[0];
		float max = w[0];

		for (float value : w)
		{

			if (value < min)
				min = value;

			if (value > max)
				max = value;
		}
		System.out.println(min);
		System.out.println(max);

	}


	public static void printArray(int[] array)
	{
		for (int e : array)
		{
			System.out.println(e);
		}
	}

}
