package ex26;

public class calculatePayment {
    public int calculateMonthsUntilPaidOff(float i,float b,float p){

        double n = -(1.0/30.0) * Math.log(1.0 + b/p * Math.pow(1.0 - (1.0 + i),30.0)) / Math.log(1.0 + i);
        int ans = (int) Math.ceil(n);
        return ans;
    }
}
