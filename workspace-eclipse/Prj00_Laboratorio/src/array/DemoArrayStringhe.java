package array;

import java.util.Arrays;

public class DemoArrayStringhe {

	public static void main(String[] args) {

		
		String[] rediroma = {
				"romolo",
				"numa pompilio",
				"tullo ostilio",
				"anco marzio",
				"servio tullio",
				"tarquinio prisco",
				"tarquinio il superbo",
		};
		
		Arrays.sort(rediroma);
		
		for (int i = 0; i < rediroma.length; i++) {
			System.out.println(rediroma[i]);
		}
		
	}

}
