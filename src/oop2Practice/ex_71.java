package oop2Practice;

class SutdaDeck{
	
	
	final int CARD_NUM = 20;
	SutdaCard[] cards =new SutdaCard[CARD_NUM];
	
	public SutdaDeck() {
		// 1, 3, 8일 경우 isKwang을 true
		for (int i = 0; i < cards.length; i++) {
			
			// 특정 구간의 수를 반복하고 싶다면 i를 i%10 + 1 ( 0~9를 10로 나눈 나머지로 0~9만 가지고 온다)
			int num = (i%10) + 1;
			
			boolean isKwang = (i < 10) && (i == 1 || i == 3 || i == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	// 7-2 문제
	// 랜덤 섞기
	void Shuffle() {
		
		
		for (int i = 0; i < cards.length; i++) {
			// (int)Math.random()*20 으로 하면 random부터 형변환되서 0이 되어버린다.
			int ranNum = (int)(Math.random()*cards.length);
			int tmp = cards[i].num;
			cards[i].num = cards[ranNum].num;
			cards[ranNum].num = tmp;
			
		}
	}
	// 인덱스 위치에 배열 출력
	SutdaCard pick(int index) {
		
		if(index < 0 || index > CARD_NUM) {
			return null;
		}
		
		return cards[index];
	}
	// 랜덤 위치에 배열 출력
	SutdaCard pick() {
		int ranNum = (int)(Math.random()*cards.length);
		return cards[ranNum];
	}
	
	
}

class SutdaCard {
	
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + (isKwang?"K":"");
	}
	
}

public class ex_71 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.Shuffle();
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));

	}

}
