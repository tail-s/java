package example07;

import java.util.Vector;

public class BoardEx {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		System.out.println("용량 : " + vector.capacity());
		System.out.println("저장된 객체 수 : " + vector.size());	//저장된 객체 수
		
		vector.add(new Board("제목1", "내용1", "작성자1"));
		vector.add(new Board("제목2", "내용1", "작성자1"));
		vector.add(new Board("제목3", "내용1", "작성자1"));
		vector.add(new Board("제목4", "내용1", "작성자1"));
		vector.add(new Board("제목5", "내용1", "작성자1"));
		vector.add(new Board("제목6", "내용1", "작성자1"));
		vector.add(new Board("제목7", "내용1", "작성자1"));
		vector.add(new Board("제목8", "내용1", "작성자1"));
		vector.add(new Board("제목9", "내용1", "작성자1"));
		vector.add(new Board("제목10", "내용1", "작성자1"));
		vector.add(new Board("제목11", "내용1", "작성자1"));
		
		System.out.println("용량 : " + vector.capacity());
		System.out.println("저장된 객체 수 : " + vector.size());	//저장된 객체 수
		
		vector.remove(2);
		vector.remove(5);
		vector.remove(8);
		
		System.out.println("용량 : " + vector.capacity());
		System.out.println("저장된 객체 수 : " + vector.size());	//저장된 객체 수
		
		System.out.println("--------------------------------------");
		
		for(int i=0; i<vector.size(); i++) {
			if(vector.get(i) instanceof Board) {
				Board board = (Board)vector.get(i);
				board.show();
			}
		}

	}

}
