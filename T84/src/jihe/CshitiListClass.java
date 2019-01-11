package jihe;

public class CshitiListClass {	
		// TODO Auto-generated method stub
		private int stuno;
		private String name;
		private int scroe;
		public int getStuno() {
			return stuno;
		}
		public void setStuno(int stuno) {
			this.stuno = stuno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScroe() {
			return scroe;
		}
		public void setScroe(int scroe) {
			this.scroe = scroe;
		}
		public CshitiListClass(int n,String name,int s){
			this.stuno=n;
			this.name=name;
			this.scroe=s;
		}
}
