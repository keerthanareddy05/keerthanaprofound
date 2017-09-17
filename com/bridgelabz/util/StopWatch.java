/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/lib/StopWatch.java
 *  Execution:    java -cp bin com/bridgelabz/lib/StopWatch
 *  
 *Purpose:To return an harmonic number,sin of an angle,cosine of an angle,return Binary of a number
 *
 *  @author  Keerthana Reddy
 *  @version 1.0
 *  @since   17-08-2017
 *
 ******************************************************************************/ 
public class StopWatch {
	private static long start;
	
	public StopWatch(){
		start = System.currentTimeMillis();
	}
	
	public static long elapsedTime(){
		long now = System.currentTimeMillis();
		return (now - start)/1000.0;
	}
	    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // sum of square roots of integers from 1 to n using Math.sqrt(x).
        Stopwatch timer1 = new Stopwatch();
        double sum1 = 0.0;
        for (int i = 1; i <= n; i++) {
            sum1 += Math.sqrt(i);
        }
        double time1 = timer1.elapsedTime();
        StdOut.printf("%e (%.2f seconds)\n", sum1, time1);

        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
        Stopwatch timer2 = new Stopwatch();
        double sum2 = 0.0;
        for (int i = 1; i <= n; i++) {
            sum2 += Math.pow(i, 0.5);
        }
        double time2 = timer2.elapsedTime();
        StdOut.printf("%e (%.2f seconds)\n", sum2, time2);
    }
}	
	}
} 