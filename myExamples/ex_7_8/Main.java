public class Main{

	public static void main(String[] args)
	{

		int[] f = new int[10];

		System.out.println(f[6]);

		int[] g = {8, 8, 8, 8, 8};

		float[] c = new float[100];
		float sum = 0.0f;

		for (int counter = 0; counter < c.length; counter++)
			sum += c[counter];

		System.out.println(sum);
		
		int[] a = new int[11];
		int[] b = new int[34];

		for (int counter = 0; counter < a.length; counter++)
			b[counter] = a[counter];

		float[] w = new float[99];
		float min = w[0];
		float max = w[0];

		for (int counter = 1; counter < w.length; counter++)
		{

			if (w[counter] < min)
				min = w[counter];

			if (w[counter] > max)
				max = w[counter];
		}


	}

}
