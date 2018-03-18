package mai.mathlib;

public class MyMath {
	static public double exp(double x)
	{
		double accuracy = 1E-3;
    	double res = 0;
    	double res_curr = 1;
    	double P = 1;
    	int i = 1;
        do
        {
        	res = res_curr;
        	P *= (x / i++);
        	res_curr  += P;
        }
    	while( Math.abs(res_curr - res) > accuracy);
		return res;
	}
	
	static public double сos(double x)
	{
		double accuracy = 1E-3;
    	double res = 0;
    	double res_curr = 1;
    	double P = 1;
    	int i = 0;
        do
        {
        	res = res_curr;
        	P *= -x * x / ((i + 1) * (i + 2));
        	i += 2;
        	res_curr  += P;
        }
    	while( Math.abs(res_curr - res) > accuracy);
		return res;
	}
}
