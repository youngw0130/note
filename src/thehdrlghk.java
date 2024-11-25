public class thehdrlghk {
    static class MyData {  // Make MyData static so it can be accessed in static main method
        int data = 3;
        public void plusData() {
            synchronized (this){
                int mydata = data;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                data = mydata + 1;
            }
        }
    }

    static class PlusThread extends Thread {
        MyData myData;

        public PlusThread(MyData myData) {
            this.myData = myData;
        }

        @Override
        public void run() {
            myData.plusData();
            System.out.println(getName() + " 실행결과: " + myData.data);
        }
    }

    public static void main(String[] args) {
        MyData myData = new MyData();
        Thread plusThread1 = new PlusThread(myData);
        plusThread1.setName("plusThread1");
        plusThread1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread plusThread2 = new PlusThread(myData);
        plusThread2.setName("plusThread2");
        plusThread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

