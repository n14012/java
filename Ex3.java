class Ex3{

	public String ex3_0(int n){

          if(n>0){
            return "その値は正です"; 
          }else{
            return "その値は0か負です";
          }

	}

	public int ex3_1(int n){		
          
          if(n<0){
            n = -n;
          } 

          return n;


	}

	public String ex3_2(int a, int b){
          if (a % b == 0){
          return b + "は" + a + "の約数です";   
          }else{ 

		return b + "は" + a + "の約数ではありません";
          }
	}

	public String ex3_3(int a, int b){
          if (a < b){
            return "bの方が大きいです";
          }else if(a > b){
            return "aの方が大きいです";
          }else{
            return "同じ値です";
          } 

	}

	public String ex3_4(int a){
          if (a % 5 == 0){
            return "その値は5で割り切れます"; 
          }else if (a < 0){
            return "正でない整数値です";  
          }else{
            return "その値は5で割り切れません"; 
          }

	}

	public String ex3_5(int a){
          if (a % 10 == 0){
            return "その値は10の倍数です";
          }else if (a < 0){
            return "正でない整数値です"; 
          }else{
            return "その値は10の倍数ではありません";
          }
	}
	
	public String ex3_6(int a){
          if (a % 3 == 0){
            return "その値は3で割り切れます"; 
          }else if (a % 3 == 2){
            return "その値を3で割った余りは2です"; 
          }else if (a % 3 == 1) {
            return "その値を3で割った余りは1です"; 
          }else {
            return "正でない整数値です"; 
          } 
	}

	public String ex3_7(int a){
          if (a > 0 && a < 60){
            return "不可"; 
          }else if (a > 59 && a < 70){
            return "可"; 
          }else if (a > 69 && a < 80){
            return "良";
          }else if (a > 79 && a < 101){
            return "優良"; 
          }else {
            return "範囲(0〜100)外の値です"; 
          }
        } 

	public double ex3_8(double a, double b){
          if (a < b){
            return b;
          }else{
            return a;
          } 
	}

	public int ex3_9(int a, int b){
          if (a < b){
            return (b - a);
          }else {
            return (a - b); 
          }
	}

	public String ex3_10(int a, int b){
          if (a > b){
            if (a - b < 11){
              return "それらの差は10以下です"; 
            }else{
              return "それらの差は11以上です"; 
            }
          }else {
            if (b - a < 11){
              return "それらの差は10以下です"; 
            }else{
              return "それらの差は11以上です"; 
            }
          }   
	}

	public int ex3_11(int a, int b, int c){
          int x = Math.min(a,b);
          int y = Math.min(x,c);

          return y;
	}

	public int ex3_12(int a, int b, int c){
          int x = Math.max(a,b);
          int max = Math.max(x,c);
          int y = Math.min(a,b);
          int min = Math.min(y,c);

         if ( a < max && a > min){
          return a;
         }else if( b < max && b > min){
          return b;
         }else if( c < max && c > min){
          return c;
         }else if( a == b && a!= c){
          return a;   
         }else if( b == c && b!= a){
          return b;
         }else{
          return c;
         } 
	}

	public String ex3_13(int a){
          if (a > 0 && a < 3 || a == 12) {
            return "冬"; 
          }else if (a > 2 && a < 6){
            return "春"; 
          }else if (a > 5 && a < 9){
            return "夏"; 
          }else if (a > 8 && a < 12){
            return "秋"; 
          }else{
            return "範囲(1～12)外の値です"; 
          } 
	}
}


