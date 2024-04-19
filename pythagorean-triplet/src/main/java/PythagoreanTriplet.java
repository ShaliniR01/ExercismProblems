import java.util.*;

class PythagoreanTriplet {

    int a,b,c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int sum,maxFactor;
        TripletListBuilder thatSumTo(int sum) {
            this.sum=sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor=maxFactor;
            return this;
        }

        boolean checkPythagorean(int a, int b, int c){
            return a*a + b*b == c*c;
        }

        boolean checkFactors(int a, int b, int c){
            return (a<b && a<c && b<c) && (maxFactor==0 || a<=maxFactor && b<=maxFactor && c<=maxFactor);
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> result = new ArrayList<>();
            for(int a=1;a<=sum/3;a++){
                for(int b=1;b<=sum;b++){
                    int c=sum-a-b;
                    if(checkPythagorean(a,b,c)){
                        if(checkFactors(a,b,c)){
                            result.add(new PythagoreanTriplet(a,b,c));
				}
			  }
                }
            }
            return result;
        }

    }
    @Override
    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }
        if(getClass()!=obj.getClass()){
            return super.equals(obj);
        }
        PythagoreanTriplet triplet = (PythagoreanTriplet)obj;
        return (triplet.a==this.a && triplet.b==this.b && triplet.c==this.c);
    }
}