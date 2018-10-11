package data_structre;

import java.util.*;

public class Pocker1{
	static HashMap<Integer, String> pocker=new HashMap<>();
	public static void main(String[] args) {
		//=======================来一副新的扑克牌=================
		int index=1;
		String num []= {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
		String color[]= { "♥", "♣", "♦", "♠" };
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<color.length;j++) {
				pocker.put(index,color[j]+num[i]);
				index++;
			}
		}
		pocker.put(index, "大王");
		index++;
		pocker.put(index, "小王");
		index++;	
		Set<Integer> IndexSet=pocker.keySet();
		ArrayList<Integer> copyIndexSet=new ArrayList<>();
		for(Integer i:IndexSet) {
			copyIndexSet.add(i);
		}
		//=========================洗牌========================
		Collections.shuffle(copyIndexSet);

		Set<Integer> player1 = new TreeSet<>();
		Set<Integer> player2 = new TreeSet<>();
		Set<Integer> player3 = new TreeSet<>();
		Set<Integer> dipai = new TreeSet<>();
		for(int i=0;i<copyIndexSet.size();i++) {
			if(i<copyIndexSet.size()-3) {
		if(i%3==0) {
			player1.add(copyIndexSet.get(i));
		}else if(i%3==1){
			player2.add(copyIndexSet.get(i));
		}else if(i%3==2) {
			player3.add(copyIndexSet.get(i));
		}
		
	
	}else {
		//51 ，52,53
		dipai.add(copyIndexSet.get(i));
	}
		
		}
	
		lookPoker("sad",player1);
		lookPoker("pdd",player2);
		lookPoker("miss",player3);
		lookPoker("底牌",dipai);
	
	}
	public static void lookPoker(String playerName, Set<Integer> set) {

		System.out.print(playerName + "的牌:");

		for (Integer i : set) {
			System.out.print(pocker.get(i) + " ");
		}
		System.out.println();

	}




}