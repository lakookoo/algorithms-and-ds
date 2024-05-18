package expression;

public class Expression {
    public static ExpTerm addTerms(ExpTerm term1, ExpTerm term2){
        if(term1.exponent == term2.exponent){
            double sumCoeff = term1.coeff + term2.coeff;
            return new ExpTerm(sumCoeff, term1.exponent);
        } else {
            System.out.println("Cannot add terms with different exponents.");
            return null;
        }
    }
}
