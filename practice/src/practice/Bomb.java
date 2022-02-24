package practice;

public class Bomb {

	public static void main(String[] args) {
		int[][] q = new int[9][9];

		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < q[i].length; j++) {
				System.out.print(q[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
			
		}
		System.out.println("----------------------------------------------------------");

		for (int i = 0; i < 20; i++) {
			int a = (int) (Math.random() * q.length);
			int b = (int) (Math.random() * q.length);
			if (q[a][b] == 0)
				q[a][b] = 888;
			else
				i--;
		}

		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < q[i].length; j++) {
				System.out.print(q[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}

		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < q[i].length; j++) {
				int xmin = i-1, xmax = i+1;
				int ymin = j-1, ymax = j+1; 
				if (xmin < 0)
					xmin = 0;
				if (ymin < 0)
					ymin = 0;
				if (xmax > 8)
					xmax = 8;
				if (ymax > 8)
					ymax = 8;

				if (q[i][j] == 888) {
					for (int x = xmin; x <= xmax; x++) {
						for (int y = ymin; y <= ymax; y++) {
							
							if (!(x == i && y == j)) {
								if (q[x][y] != 888)
									q[x][y]++;
							}
						}
					}
				}
			}
		}
		System.out.println("----------------------------------------------------------");

		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < q[i].length; j++) {
				System.out.print(q[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}

	}

}
