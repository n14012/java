class Ex3{

	public String ex3_0(int n){

          if(n>0){
            return "その値は正です"; 
          }else{
            return "その値は０か負です";
          }

	}

	public int ex3_1(int n){		
          void execute(){
            Random rand = new Random(); 

            int n = rand.nextInt(5)-5;
            System.out.print("整数値:" + n);

            System.out.println("その絶対値は" + Math.abs(n) + "です。"); 
          }

	}

	public String ex3_2(int a, int b){

		return "dummy";
	}

	public String ex3_3(int a, int b){

		return "dummy";

	}

	public String ex3_4(int a){

		return "dummy";

	}

	public String ex3_5(int a){

		return "dummy";
	}
	
	public String ex3_6(int a){
		return "dummy";
	}

	public String ex3_7(int a){
		return "dummy";
	}
}


