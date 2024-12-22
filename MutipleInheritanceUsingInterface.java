import interfaces.Devices.SmartPhone;

public class MutipleInheritanceUsingInterface {
    public static void main(String[] args){

        SmartPhone samsungPhone = new SmartPhone();
        samsungPhone.makeCall("7354239666");
        samsungPhone.endCall();
        samsungPhone.playMusic();
        samsungPhone.stopMusic();

    }

}
