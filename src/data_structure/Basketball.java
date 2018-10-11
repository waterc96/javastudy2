	package data_structure;

import java.util.Arrays;

public class Basketball {


	// ���ڴ�����Ա����Ϣ
	private static  Object[] players = null;

	// ��¼������Ա�ĸ���
	private static  int size = 0;
	private  final int default1=10;
	// 1����ʼ��һ��5��������������ȥ�洢������Ա����Ϣ
	public Basketball(int init) {
		players = new Integer[init];
	}
	public Basketball() {}

	// 2������5����Ա�ϳ���1��3��5��10��30��
	public  void add(Object playerNumber) {
		// �������������
		if (size == players.length) {
			Object[] copyArray = Arrays.copyOf(players, players.length * 2);
			players = copyArray;
		}
		players[size] = playerNumber;
		// [1,3,5,10,30,100,null,null,null,null]
		size++;
	}

	// 3����ѯĳһ��λ�����ĸ���Ա�ٴ�ͨ��������Ԫ�أ�
	public  Object get(int index) {
		if (index >= size || index < 0) {
			// ���Ϸ���
			throw new IllegalArgumentException("����Խ��");
		}
		return players[index];
	}

	// 4����ѯָ����Ա����ڳ��ϵ�λ�ã���ѯĳһ��Ԫ���������е�������
	public static  int getIndexByPlayerNumber(Object playerNumber) {
		for (int index = 0; index < size; index++) {
			if (players[index] == playerNumber) {
				return index;
			}
		}
		return -1;
	}
	// 5�����з�λ�õ���Ա��3�ű��33�ţ��滻ָ�������µ�Ԫ��ֵ��
	public static  void set(int index, Object newPlayerNumber) {
		if (index >= size || index < 0) {
			// ���Ϸ���
			throw new IllegalArgumentException("����Խ��");
		}
		players[index] = newPlayerNumber;
	}

	// 6����30����Ա�滻��50����Ա������ָ��Ԫ��ֵ�������滻��
	public static void update(Object oldPlayerName, Object newPlayerNumber) {
		int index = getIndexByPlayerNumber(oldPlayerName);
		if (index != -1) {
			set(index, newPlayerNumber);
		}
	}

	// 7���������ڴ��з����Ա���£�����һ�����£�û���油��ɾ��������ָ��������Ԫ�أ�
	public  void delete(int index) {
		if (index >= size || index < 0) {
			// ���Ϸ���
			throw new IllegalArgumentException("����Խ��");
		}
		for (int i = index; i < size - 1; i++) {
			players[i] = players[i + 1];
		}
		players[size - 1] = null;
		size--;

	}

	// 8��֪������ÿһ��λ����˭�ڴ򣨱������飩
	public String toString() {
		// [1,3,5,7,10] []
		if (players == null) {
			return "û�г�ʼ��";
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

