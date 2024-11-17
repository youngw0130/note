class myThread extends Thread {
    public void run(){
        String[] strArray = new String[] {"하나","둘","셋","넷","다섯"};
        try {Thread.sleep(10);} catch (InterruptedException e1) {}
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("(자막)"+ strArray[i]);
            try { Thread.sleep(200);} catch (InterruptedException e) { }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread mythread = new myThread();
        mythread.start();
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("(비디오프레임) "+ arr[i]+"-");
            try { Thread.sleep(200);} catch (InterruptedException e) { }
        }
    }
}