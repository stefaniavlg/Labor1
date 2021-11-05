package com.company;

/**
 * AUFGABE 4: 1,2,3,4
 */
public class TastaturUsbPrice {
    int n=4;
    int tastaturPrice []={15,20,10,35};
    int usbPrice []={20,15,40,15};
    int min=tastaturPrice[0];
    int max=tastaturPrice[0];

    /**
     * Find cheapest keyboard
     * @param tastaturPrice
     * @return
     */
    public int billig(int [] tastaturPrice){

        for(int i=1;i<n;i++){
            if(tastaturPrice[i]<min) {
                min = tastaturPrice[i];
            }
        }
        return min;
    }

    /**
     * Find most expensive keyboard
     * @param tastaturPrice
     * @param usbPrice
     * @return
     */
    public int teuer(int [] tastaturPrice, int[] usbPrice){

        for(int i=1;i<n;i++){
            if(tastaturPrice[i]>max) {
                max = tastaturPrice[i];

            }
            else{
                if (usbPrice[i]>max){
                    max= usbPrice[i];

                }
            }
        }
        return max;
    }

    /**
     * Find a drive for a budget
     * @param tastaturPrice
     * @return
     */
    public int budget(int [] tastaturPrice){
        int b=60;
        int t;
        int r = 0;
        for(int i=1;i<n;i++) {
            for (int j = i; j > 0; j--) {
                if (tastaturPrice[j] < tastaturPrice[j - 1]) {
                    t = tastaturPrice[j];
                    tastaturPrice[j] = tastaturPrice[j - 1];
                    tastaturPrice[j - 1] = t;
                }
            }
        }
        for(int k=0;k<n;k++){
            if(tastaturPrice[k]<=b)
                r=tastaturPrice[k];

        }

        return r;
    }

    /**
     * Find 1 keyboard and 1 usb for a specific budget
     * @param tastaturPrice
     * @param usbPrice
     * @return
     */
    public int geldbetrag(int []tastaturPrice, int[]usbPrice){

        int rez=0;
        int bu=60;

        if(rez<=bu) {
            for (int i = 0; i <= n; i++) {
                for (int j = i; j < i - 1; j++) {
                    if (tastaturPrice[i] + usbPrice[j] <= bu) {
                        rez = tastaturPrice[i] + usbPrice[j];
                    }
                }
            }
            return rez;
        }
        else

            return -1;

    }

    public static void main (String[] args ){

        int tastaturPrice []={15,20,10,35};
        int usbPrice []={20,15,40,15};
        TastaturUsbPrice m = new TastaturUsbPrice();
        System.out.println("1.BILLIG: "+m.billig(tastaturPrice));
        System.out.println("2.TEUER: "+m.teuer(tastaturPrice,usbPrice));
        System.out.println("3.BUDGET: "+m.budget(tastaturPrice));
        System.out.println("4.GELDBETRAG: "+m.geldbetrag(tastaturPrice,usbPrice));


    }
}
