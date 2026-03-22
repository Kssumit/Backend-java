package Java.Day09interface.multiple_inheritance;

public class SmartPhone implements Camera, Phone, MusicPlayer {

    @Override
    public void playMusic() {

    }

    @Override
    public void stopMusic() {

    }

    @Override
    public void makeCall() {

    }

    @Override
    public void endCall() {

    }

    @Override
    public void takePhoto() {

    }

    @Override
    public void recordVideo() {

    }   
}

class Test{
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.endCall();
    }
}
