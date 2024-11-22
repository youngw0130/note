package problem;

class TV {
    int channel;
    void setChannel(int channel) {
        this.channel = channel;
    }
    void showChannel() {
        System.out.println("Current channel: " + channel);
    }
}
class main {
    public static void main(String[] args) {
        TV[] tvArray = new TV[3];
        for (int i = 0; i < tvArray.length; i++) {
            tvArray[i] = new TV();
            int randomChannel = (int)(Math.random() * 100) + 1;
            tvArray[i].setChannel(randomChannel);
        }
        for (int i = 0; i < tvArray.length; i++) {
            System.out.print("TV " + (i + 1) + " ");
            tvArray[i].showChannel();
        }
    }
}


