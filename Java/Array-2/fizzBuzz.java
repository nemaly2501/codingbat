public String[] fizzBuzz(int start, int end) {
int len = end - start;
		String[] arry = new String[len];
		if(len <= 0) return arry;
		for(int i=1; i<len+1;i++)
		{
			int tmp = i+start-1;
			int fizz = tmp % 3;
			int buzz = tmp % 5;
			String s = "";
			if(fizz==0){
				if(buzz==0) s = "FizzBuzz";
				else s = "Fizz";
			}else{
				if(buzz==0) s = "Buzz";
				else s = String.valueOf(tmp);
			}
			arry[i-1] = s;
		}
		return arry;
}