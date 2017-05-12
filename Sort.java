class Sort {
	public static void main(String[] args) {
			
		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		
		
		

		// for (int x: array){
		// 	System.out.println(x);
		// }

		// for (i = 0; i < array.length; i++) {

		// 	val1 = array[0];


		// 	for (j = i + 1; j < array.length; j++) {

		// 		if (array[j] < array[i]) {
		// 			pos1 = array[j];
		// 			// array[i + ] = val1;
		// 		}	
		// 	}

		// 	pos2 = array[i];
		// 	array[i] = array[j];
		// 	array[j] = pos2;

		// }

		

		sort(array);
	}

	public static void sort(int[] array) {

		int cur_pos;
		int min_pos;
		int scan_pos;
		int temp;

		for (cur_pos = 0; cur_pos < array.length; cur_pos++) {

			min_pos = cur_pos;

			for (scan_pos = cur_pos + 1; scan_pos < array.length; scan_pos++) {

				if (array[scan_pos] < array[min_pos]) {
					min_pos = scan_pos;
				}
				temp = array[min_pos];
				array[min_pos] = array[cur_pos];
				array[cur_pos] = temp;
			}
		}
		for (int x: array){
			System.out.println(x);
		}

	}
}
