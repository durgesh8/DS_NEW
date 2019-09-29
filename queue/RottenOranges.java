package queue;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	public static void main(String[] args) {
		int arr[][] = { { 2, 1, 0, 2, 1 }, { 1, 0, 1, 2, 1 }, { 1, 0, 0, 2, 1 } };

		System.out.println(rotOrranges(arr));
	}

	static class Ele {
		int x;
		int y;

		public Ele(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int rotOrranges(int arr[][]) {
		Queue<Ele> queue = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 2) {
					queue.add(new Ele(i, j));
				}
			}
		}
		queue.add(new Ele(-1, -1));
		int days = 0;
		while (!queue.isEmpty()) {
			boolean flag = false;
			while ((queue.peek().x != -1) && (queue.peek().y != -1)) {
				if ((queue.peek().x + 1 < arr.length) && (arr[queue.peek().x + 1][queue.peek().y] == 1)) {
					flag = true;
					queue.add(new Ele(queue.peek().x + 1, queue.peek().y));
					arr[queue.peek().x + 1][queue.peek().y] = 2;
				}

				if ((queue.peek().x - 1 < arr.length) && (queue.peek().x - 1 >= 0)
						&& (arr[queue.peek().x - 1][queue.peek().y] == 1)) {
					flag = true;
					queue.add(new Ele(queue.peek().x - 1, queue.peek().y));
					arr[queue.peek().x - 1][queue.peek().y] = 2;
				}

				if ((queue.peek().y + 1 < arr[0].length) && (arr[queue.peek().x][queue.peek().y + 1] == 1)) {
					flag = true;
					queue.add(new Ele(queue.peek().x, queue.peek().y + 1));
					arr[queue.peek().x][queue.peek().y + 1] = 2;
				}

				if ((queue.peek().y - 1 < arr[0].length) && (queue.peek().y - 1 >= 0)
						&& (arr[queue.peek().x][queue.peek().y - 1] == 1)) {
					flag = true;
					queue.add(new Ele(queue.peek().x, queue.peek().y - 1));
					arr[queue.peek().x][queue.peek().y - 1] = 2;
				}
				queue.remove();

			}
			queue.remove();
			if (flag)
				days++;
			if (!queue.isEmpty()) {
				queue.add(new Ele(-1, -1));
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1) {
					return -1;
				}
			}
		}
		return days;

	}
}
