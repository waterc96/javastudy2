	package data_structure;

import java.util.Arrays;

public class Basketball {


	// 用于储存球员的信息
	private static  Object[] players = null;

	// 记录场上球员的个数
	private static  int size = 0;
	private  final int default1=10;
	// 1、初始化一个5个容量的容器，去存储场上球员的信息
	public Basketball(int init) {
		players = new Integer[init];
	}
	public Basketball() {}

	// 2、安排5个球员上场（1，3，5，10，30）
	public  void add(Object playerNumber) {
		// 数组的扩容问题
		if (size == players.length) {
			Object[] copyArray = Arrays.copyOf(players, players.length * 2);
			players = copyArray;
		}
		players[size] = playerNumber;
		// [1,3,5,10,30,100,null,null,null,null]
		size++;
	}

	// 3、查询某一个位置是哪个球员再打（通过索引查元素）
	public  Object get(int index) {
		if (index >= size || index < 0) {
			// 不合法的
			throw new IllegalArgumentException("索引越界");
		}
		return players[index];
	}

	// 4、查询指定球员编号在场上的位置（查询某一个元素在数组中的索引）
	public static  int getIndexByPlayerNumber(Object playerNumber) {
		for (int index = 0; index < size; index++) {
			if (players[index] == playerNumber) {
				return index;
			}
		}
		return -1;
	}
	// 5、将中锋位置的球员从3号变成33号（替换指定索引下的元素值）
	public static  void set(int index, Object newPlayerNumber) {
		if (index >= size || index < 0) {
			// 不合法的
			throw new IllegalArgumentException("索引越界");
		}
		players[index] = newPlayerNumber;
	}

	// 6、将30号球员替换成50号球员（查找指定元素值病进行替换）
	public static void update(Object oldPlayerName, Object newPlayerNumber) {
		int index = getIndexByPlayerNumber(oldPlayerName);
		if (index != -1) {
			set(index, newPlayerNumber);
		}
	}

	// 7、将场上在打中锋的球员罚下（假设一旦罚下，没有替补，删除数组中指定索引的元素）
	public  void delete(int index) {
		if (index >= size || index < 0) {
			// 不合法的
			throw new IllegalArgumentException("索引越界");
		}
		for (int i = index; i < size - 1; i++) {
			players[i] = players[i + 1];
		}
		players[size - 1] = null;
		size--;

	}

	// 8、知道场上每一个位置是谁在打（遍历数组）
	public String toString() {
		// [1,3,5,7,10] []
		if (players == null) {
			return "没有初始化";
		}
		if (size == 0) {
			return "[]";
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		for (int index = 0; index < size; index++) {
			stringBuilder.append(players[index]);
			if (index != size - 1) {
				stringBuilder.append(",");
			} else {
				stringBuilder.append("]");
			}
		}
		return stringBuilder.toString();

	}


}

