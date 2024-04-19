class PrimeCalculator {

    int nth(int nth) {
		if(nth<1)
			throw new IllegalArgumentException();
		int number=2;
		int count=1;
		while(count<nth){
			number++;
			boolean isPrime=true;
			for(int i=2;i<=number/2;i++){
				if(number%i==0){
					isPrime=false;
				}
			}
			if(isPrime==false){
				continue;
			}
			count++;
		} 
		return number;
    }

}
